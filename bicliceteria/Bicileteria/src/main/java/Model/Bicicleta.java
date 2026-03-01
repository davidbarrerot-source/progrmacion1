package Model;
import java.util.ArrayList;
import java.util.List;
public class Bicicleta {
    //creamos los atributos de bicleta
    private String marca;
    private String modelo;
    private String tipo;
    private double precioBase;
    private List<Repuesto> repuestos;

    //el constructor de bicicleta
    public Bicicleta(String marca, String modelo, String tipo, double precioBase) {
        //inicializa valores
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.repuestos = new ArrayList<>();
    }//agregar repuesto ala bicicleta

    public void agregarRepuesto(Repuesto repuesto) {
        repuestos.add(repuesto);
    }
  
    //calcular total de los repuestos
    public double calcularTotalRepuestos() {
        double total = 0;
        for (int i = 0; i < repuestos.size(); i++) {
            total += repuestos.get(i).calcularSubTotal();
        }
        return total;
    }

    //calcular precio total de la bicicleta
    public double calcularPrecioTotal() {
        double total = 0;
        total = precioBase + calcularTotalRepuestos();
        return total;

    }//cada atributo getter

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Repuesto> getRepuestos() {
        return repuestos;
    }

    //setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioBase=" + precioBase +
                ", totalRepuestos=" + calcularTotalRepuestos() +
                ", precioTotal=" + calcularPrecioTotal() +
                '}';
    }//sobreescribir metodo este metodo modifica

}

