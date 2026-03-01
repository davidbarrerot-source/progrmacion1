package Model;

public class Tarea {
    //atributos de la clase tarea
    private String descripcion;
    private double costo;
    private String tiempo;
    //constructor
    public Tarea(String descripcion, double costo, String tiempo){
        this.descripcion= descripcion;
        this.costo=costo;
        this.tiempo=tiempo;
        //geter
    }public String getDescripcion(){return descripcion;}
    public double getCosto(){return costo;}
    public String getTiempo(){return tiempo;}
    //seter
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }public void setCosto(double costo){
        this.costo=costo;
    }public void setTiempo(String tiempo){
        this.tiempo=tiempo;
    }

}






