package Model;

import java.time.LocalTime;

public class Empleado {
    private String nombre;

    public Empleado(String nombre,  LocalTime horaEntrada) {
        this.nombre = nombre;

        this.horaEntrada = horaEntrada;

    }





    private LocalTime horaEntrada;

public boolean llegoTarde(LocalTime horaEntradaEmpresa){
    boolean resultado =false;
    if(horaEntrada.isAfter(horaEntradaEmpresa)){
        resultado=true;
    }return resultado;
}
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +

                ", horaEntrada=" + horaEntrada +

                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }


}
