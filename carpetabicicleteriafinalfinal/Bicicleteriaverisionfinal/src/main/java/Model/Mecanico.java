package Model;

public class Mecanico {
    //atributos de mecanico
    private int idendificacion;
    private String nombre;
    private double salario;

    //constructor
    public Mecanico(int indetificacion , String nombre, double salario){
        this.idendificacion=indetificacion;
        this.nombre=nombre;
        this.salario=salario;



    }

    public void setIdendificacion(int idendificacion) {
        this.idendificacion = idendificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdendificacion() {
        return idendificacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ingrese mecanico"+nombre +"ingrese identificacion"+idendificacion+"ingrese salario"+salario;
    }
}
