package model;

public class Recaudador implements Icobrador{
    private String nombre ;
    private String apellido;

    public Recaudador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }@Override
    public void cobrarPeaje(Vehiculo v){
        v.aumentarPeaje();
    }
    @Override
    public String getIdentificador(){
        return nombre+""+apellido;
    }
}
