package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;


public class Gestor {
    private List <Notificador>notificadores;
    private List <Noticia> inventariaNoticias;
    private Publicador publicador;
    public Gestor (String NombrePublicador){
        this.notificadores=new ArrayList<>();
        this.inventariaNoticias=new ArrayList<>();
        this.publicador=new Publicador(NombrePublicador);

    }
    public void agregargarMetodo(Notificador metodo){
        this.notificadores.add(metodo);
    }public void agregarNoticia(Noticia noticia){
        this.inventariaNoticias.add(noticia);

    }public void enviamensaje(Noticia noticia){
        for(Notificador n : notificadores){
            EstadoNoticia resultado =n.envianoticia(noticia);

            noticia.actualizarEstado(resultado);
        }
    }public void configurarcorreo(String email){
        this.notificadores.add(new Correo(email));
    }public void configurartelefono(String numero){
        this.notificadores.add(new Telefono(numero));
    }
    public void configurarpush(String id){
        this.notificadores.add(new Push(id));
    }
    public void crearnoticia(String titulo ,String descripcion){
        Noticia nueva =new Noticia(titulo,descripcion);
        this.inventariaNoticias.add(nueva);
    }
    public List<Noticia> consultarnoticiaporpalabra(String palabra){
       List<Noticia> noticiasEncontradas=new ArrayList<>();
       String palabrabuscar=palabra.toLowerCase();
       for(int i=0;i<inventariaNoticias.size();i++){
           Noticia noticiaactual =inventariaNoticias.get(i);
           if(noticiaactual.getEstado()==EstadoNoticia.PENDIENTE){
             String titulo=noticiaactual.getTitulo().toLowerCase();
             if(titulo.contains(palabrabuscar)){
                 noticiasEncontradas.add(noticiaactual);
             }
           }
       }return noticiasEncontradas;
    } public void ejecutarenvio(String titulo){
        for(Noticia noticia :inventariaNoticias){
            if(noticia.getTitulo().equalsIgnoreCase(titulo)&&noticia.getEstado()==EstadoNoticia.PENDIENTE){
               this.enviamensaje(noticia);
               return;
            }
        }
    }public String reporteconsulta(String palabra){
        List<Noticia>lista=consultarnoticiaporpalabra(palabra);
        if(lista.isEmpty()) return "no hay pendiente";
        String reporte ="notieica pendiente \n";
        for (Noticia n :lista){
            reporte+= n.getTitulo()+"\n";
        }return reporte;
    }

}
