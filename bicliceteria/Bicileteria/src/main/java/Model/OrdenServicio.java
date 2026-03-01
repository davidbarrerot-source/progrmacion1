package Model;


import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {

    private int numeroOrden;
    private Cliente cliente;
    private Mecanico mecanico;
    private Bicicleta bicicleta;
    private List<Tarea> tareas;
    private List<Repuesto> repuestos;
    private String estado;

    // Constructor
    public OrdenServicio(int numeroOrden, Cliente cliente,
                         Mecanico mecanico, Bicicleta bicicleta) {

        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.bicicleta = bicicleta;
        this.tareas = new ArrayList<>();
        this.repuestos = new ArrayList<>();
        this.estado="recibida";
    }

    // Agregar tarea
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    // Agregar repuesto
    public void agregarRepuesto(Repuesto repuesto) {
        repuestos.add(repuesto);
    }

    // Calcular total de la orden
    public double calcularTotal() {

        double total = 0;

        // Sumar tareas
        for (Tarea t : tareas) {
            total += t.getCosto();
        }

        // Sumar repuestos
        for (Repuesto r : repuestos) {
            total += r.calcularSubTotal();
        }

        return total;
    }public void cambiarMecanico(Mecanico nuevoMecanico) {
        this.mecanico = nuevoMecanico;
    }
    public void cambiarEstado() {

        if (estado.equals("RECIBIDA")) {
            estado = "EN PROCESO";
        }
        else if (estado.equals("EN PROCESO")) {
            estado = "FINALIZADA";
        }
        else if (estado.equals("FINALIZADA")) {
            estado = "ENTREGADA";
        }
        else if (estado.equals("ENTREGADA")) {
            System.out.println("La orden ya fue entregada.");
        }
    }

    // Getters
    public int getNumeroOrden() { return numeroOrden; }
    public Cliente getCliente() { return cliente; }
    public Mecanico getMecanico() { return mecanico; }
    public Bicicleta getBicicleta() { return bicicleta; }
    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "numeroOrden=" + numeroOrden +
                ", cliente=" + cliente.getNombre() +
                ", mecanico=" + mecanico.getNombre() +
                ", total=" + calcularTotal() +
                '}';
    }
}