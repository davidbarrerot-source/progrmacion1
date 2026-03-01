package Model;

public class Mecanico {
     //atributos mecacnico
    private String nombre;
    private String identificacion;
    private String especialidad;
    private double salario;

    // Constructor
    public Mecanico(String nombre, String identificacion, String especialidad, double salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario=" + salario +
                '}';
    }
}