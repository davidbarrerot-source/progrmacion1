package Model;

public class Repuesto {

    private String nombre;
    private int idRepuesto;
    private double precio;
    private int cantidad;

    public Repuesto(String nombre, int idRepuesto, double precio, int cantidad) {
        this.nombre = nombre;
        this.idRepuesto = idRepuesto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubTotal() {
        return cantidad * precio;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setIdRepuesto(int idRepuesto) { this.idRepuesto = idRepuesto; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}