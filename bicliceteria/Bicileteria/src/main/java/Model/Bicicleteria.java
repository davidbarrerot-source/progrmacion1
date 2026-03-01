package Model;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {

    private List<Cliente> clientes;
    private List<Mecanico> mecanicos;
    private List<OrdenServicio> ordenes;
    private List<Repuesto> repuestos;

    // Constructor
    public Bicicleteria() {
        this.clientes = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.ordenes = new ArrayList<>();
        this.repuestos = new ArrayList<>();
    }

    // Registrar cliente
    public void registrarCliente(Cliente cliente) {

        if (buscarCliente(cliente.getIdentificacion()) == null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado: " + cliente.getNombre());
        } else {
            System.out.println("El cliente ya está registrado");
        }
    }

    // Buscar cliente
    public Cliente buscarCliente(String identificacion) {

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);

            if (c.getIdentificacion().equals(identificacion)) {
                return c;
            }
        }

        return null;
    }

    // Agregar mecánico
    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    // Crear orden
    public void crearOrden(OrdenServicio nuevaOrden) {
        ordenes.add(nuevaOrden);
    }

    // Calcular ingresos totales
    public double calcularIngresosTotales() {

        double totalAcumulado = 0;

        for (int i = 0; i < ordenes.size(); i++) {

            OrdenServicio ordenActual = ordenes.get(i);
            totalAcumulado += ordenActual.calcularTotal(); // ACUMULA
        }

        return totalAcumulado;
    }

    // Getters
    public List<Cliente> getClientes() { return clientes; }
    public List<Mecanico> getMecanicos() { return mecanicos; }
    public List<OrdenServicio> getOrdenes() { return ordenes; }
}
