package Model;

public class Bicicleta {
    private String marca;
    private int serial;
    private String tipo;
    private String color;


    public Bicicleta(String marca ,int serial,String tipo,String color) {
        this.marca = marca;
        this.serial=serial;
        this.tipo=tipo;
        this.color=color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return"ingrese marca "+marca +"ingrese serial"+serial+"ingrese tipo"+tipo +"ingrese color "+color ;
    }
}
