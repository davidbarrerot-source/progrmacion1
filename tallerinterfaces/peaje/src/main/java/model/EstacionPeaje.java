package model;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Collectors;

public class EstacionPeaje implements Icobrador {
    private String nombre;
    private String departamento;
    private double totalRecolectado;
private List<RegistroPeaje> listaRegistroPeaje;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
         this.totalRecolectado=0;
         this.listaRegistroPeaje=new ArrayList<>();
    }
    @Override
    public void cobrarPeaje(Vehiculo v){
        double valor =v.calcularPeaje();
        v.aumentarPeaje();
        this.totalRecolectado+= valor;
        RegistroPeaje nuevoRegistro =new RegistroPeaje(v,this,valor,LocalDate.now(),LocalTime.now());
    listaRegistroPeaje.add(nuevoRegistro);
    }
    //metodo de autoditoria
    public List<Camion> obtenerCamionesEspeciales(){
      return listaRegistroPeaje.stream().map(RegistroPeaje::vehiculo).filter(v-> v instanceof Camion).map(v ->(Camion) v).filter(c->c.getCapacidadCarga()>10&&c.getNumeroPeaje()>5 ).distinct().toList();
      /*
      map exttrae objeto vehiculo crea intacia de tipo camion el .map convierte vehiculo a camion
      .filter  aplica las condiciones .distint elinmina duplicados .tolist lo guarda en una lista inmutable
       */
    }public String generReporte(){
     List<Camion> especiales =obtenerCamionesEspeciales();
     if (especiales.isEmpty()) return "no hay camiones";
/*
.stream convierte la lista especiales tipo camion
.mapp tranforma cada objeto y lo convierte en un string
.collect la informacion se detiene  y agrupa resultado en un solo objeto
.joining  herramienta pegar todos los textos generados
 */
     return especiales.stream().map(c->c.getPlaca()+"carga"+c.getCapacidadCarga()+"t"+"\n").collect(java.util.stream.Collectors.joining());

    }
    public String reportegeneral(){
        if(listaRegistroPeaje.isEmpty())return "no hay vehiculo";
        //se usa long por la funcion count
        long carro = listaRegistroPeaje.stream().map(RegistroPeaje::vehiculo).filter(v -> v instanceof Carro).count();
        long moto = listaRegistroPeaje.stream().map(RegistroPeaje::vehiculo).filter(v -> v instanceof Moto).count();
        long Camion = listaRegistroPeaje.stream().map(RegistroPeaje::vehiculo).filter(v -> v instanceof Camion).count();
    return String.format(
            "estadode peaje\n"+"total recoletado: $%.2f\n"+"carros :%d\n"+"motos:%d\n"+"camiones%d\n"+"total vehiculo:%d",totalRecolectado,carro,moto,Camion, listaRegistroPeaje.size()

    );
    }
    @Override
    public String getIdentificador(){return nombre;}
}
