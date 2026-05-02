package model;

public class empresa {
    private String nombre;
    private centroImpresion centro;

    public empresa(String nombre) {
        this.nombre = nombre;
        this.centro = new centroImpresion();
    }
    public centroImpresion getcentro(){
        return centro;
    }
}
