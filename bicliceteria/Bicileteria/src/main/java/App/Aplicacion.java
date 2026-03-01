package App;

import Model.*;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {

        //  DATOS CLIENTE
        String nombreCliente = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
        String idCliente = JOptionPane.showInputDialog("Ingrese identificación del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese teléfono:");
        String direccion = JOptionPane.showInputDialog("Ingrese dirección:");
        Cliente cliente = new Cliente(nombreCliente, idCliente, telefono);

        //  DATOS MECANICO
        String nombreMecanico = JOptionPane.showInputDialog("Ingrese nombre del mecánico:");
        String idMecanico = JOptionPane.showInputDialog("Ingrese identificación del mecánico:");
        String especialidad = JOptionPane.showInputDialog("Ingrese especialidad:");
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese salario:")
        );
//asigna mecacnico
        Mecanico mecanico = new Mecanico(nombreMecanico, idMecanico, especialidad, salario);

        //  DATOS BICICLETA
        String marca = JOptionPane.showInputDialog("Ingrese marca de la bicicleta:");
        String modelo = JOptionPane.showInputDialog("Ingrese modelo:");
        String tipo = JOptionPane.showInputDialog("Ingrese tipo:");
        double precioBase = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese precio base:")
        );

        Bicicleta bicicleta = new Bicicleta(marca, modelo, tipo, precioBase);

        //  CREAR ORDEN
        int numeroOrden = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese número de orden:")
        );

        OrdenServicio orden = new OrdenServicio(numeroOrden, cliente, mecanico, bicicleta);

        //  INGRESAR TAREAS
        int cantidadTareas = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántas tareas desea agregar?")
        );

        for (int i = 0; i < cantidadTareas; i++) {

            String descripcion = JOptionPane.showInputDialog("Descripción de la tarea:");
            double costo = Double.parseDouble(
                    JOptionPane.showInputDialog("Costo de la tarea:")
            );
            String tiempo = JOptionPane.showInputDialog("Tiempo estimado:");

            Tarea tarea = new Tarea(descripcion, costo, tiempo);
            orden.agregarTarea(tarea);
        }

        // INGRESAR REPUESTOS
        int cantidadRepuestos = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántos repuestos desea agregar?")
        );

        for (int i = 0; i < cantidadRepuestos; i++) {

            String nombreRep = JOptionPane.showInputDialog("Nombre del repuesto:");
            int idRep = Integer.parseInt(
                    JOptionPane.showInputDialog("ID del repuesto:")
            );
            double precio = Double.parseDouble(
                    JOptionPane.showInputDialog("Precio unitario:")
            );
            int cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad:")
            );

            Repuesto repuesto = new Repuesto(nombreRep, idRep, precio, cantidad);
            orden.agregarRepuesto(repuesto);
        }

        // mostrar servicio
        JOptionPane.showMessageDialog(null,
                " ORDEN DE SERVICIO \n" +
                        "Cliente: " + cliente.getNombre() + "\n" +
                        "Mecánico: " + mecanico.getNombre() + "\n" +
                        "Total a pagar: $" + orden.calcularTotal()
        );
    }
}