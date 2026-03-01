package Model;
import java.util.ArrayList;
public class Cliente {

    //atributos de la clase cliente
    private String nombre;
    private String identificacion;
    private String telefono;
    private ArrayList<Bicileta> bicicletas;

    //constructor
    public Cliente(String noombre, String identificacion, String telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.bicicletas = new ArrayList<>();

    }  //metodo para agragar bicicleta

    public void agregarBicileta(Bicicleta bicicleta) {
        biclicletas.add(bicicleta);

    }
    //getter
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getTelefono() { return telefono; }
    public ArrayList<Bicicleta> getBicicletas() { return bicicletas; }

    //setter
    public void setNombre(String nombre ){this.nombre=nombre;}
    public void setIdentificacion(String identificacion){this.identificacion=identificacion;}
    public void setTelefono(String telefono){this.telefono=telefono;}
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
