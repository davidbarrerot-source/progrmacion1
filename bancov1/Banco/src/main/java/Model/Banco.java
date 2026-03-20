package Model;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente>clientes;
    private Cuenta cuenta;
    private Transaccion transaciones;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
