package App;

import Model.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {
        // Objeto principal: bicicleteria
        Bicicleteria bicicleteria = new Bicicleteria("Bici-Mundo Armenia", "Calle 10 #15-20");

        int opcionPrincipal = 0;

        do {
            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(
                    "                 menu\n" +
                            "1. menu de Clientes\n" +
                            "2. menu de Bicicletas\n" +
                            "3. menu  de Mecánicos\n" +
                            "4. menu  de Repuestos\n" +
                            "5. menu de Tareas\n" +
                            "6. menu de Órdenes\n" +
                            "7. Salir"
            ));

            switch (opcionPrincipal) {
                case 1: // CLIENTES
                    int opcionCliente = Integer.parseInt(JOptionPane.showInputDialog("--- CLIENTES ---\n1. Registrar\n2. Actualizar\n3. Borrar\n4. Volver"));
                    if (opcionCliente == 1) {
                        String nombre = JOptionPane.showInputDialog("Nombre:");
                        String identificacion = JOptionPane.showInputDialog("Identificación:");
                        String telefono = JOptionPane.showInputDialog("Teléfono:");
                        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año Nacimiento:"));
                        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
                        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
                        int numerobicicletas = Integer.parseInt(JOptionPane.showInputDialog("Número de bicicletas:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.registrarCliente(nombre, identificacion, telefono, LocalDate.of(anio, mes, dia), numerobicicletas));
                    } else if (opcionCliente == 2) {
                        String identificacion = JOptionPane.showInputDialog("Identificación del cliente a actualizar:");
                        String nombre = JOptionPane.showInputDialog("Nuevo nombre:");
                        JOptionPane.showMessageDialog(null, bicicleteria.actualizarCliente(identificacion, nombre));
                    } else if (opcionCliente == 3) {
                        String identificacion = JOptionPane.showInputDialog("Identificación a borrar:");
                        JOptionPane.showMessageDialog(null, bicicleteria.eliminarCliente(identificacion));
                    }
                    break;

                case 2:
                    int opcionBici = Integer.parseInt(JOptionPane.showInputDialog("--- BICICLETAS ---\n1. Registrar\n2. Actualizar\n3. Borrar\n4. Volver"));
                    if (opcionBici == 1) {
                        String marca = JOptionPane.showInputDialog("Marca:");
                        int serial = Integer.parseInt(JOptionPane.showInputDialog("Serial:"));
                        String tipo = JOptionPane.showInputDialog("Tipo:");
                        String color = JOptionPane.showInputDialog("Color:");
                        JOptionPane.showMessageDialog(null, bicicleteria.registrarBicicleta(marca, serial, tipo, color));
                    } else if (opcionBici == 2) {
                        int serial = Integer.parseInt(JOptionPane.showInputDialog("Serial a actualizar:"));
                        String marca = JOptionPane.showInputDialog("Nueva Marca:");
                        String tipo = JOptionPane.showInputDialog("Nuevo Tipo:");
                        String color = JOptionPane.showInputDialog("Nuevo Color:");
                        JOptionPane.showMessageDialog(null, bicicleteria.actualizarBicicleta(serial, marca, tipo, color));
                    } else if (opcionBici == 3) {
                        int serial = Integer.parseInt(JOptionPane.showInputDialog("Serial a borrar:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.eliminarBicicleta(serial));
                    }
                    break;

                case 3: // MECÁNICOS
                    int opcionMecanico = Integer.parseInt(JOptionPane.showInputDialog("--- MECÁNICOS ---\n1. Registrar\n2. Actualizar\n3. Borrar\n4. Volver"));
                    if (opcionMecanico == 1) {
                        int idendificacion = Integer.parseInt(JOptionPane.showInputDialog("Identificación:"));
                        String nombre = JOptionPane.showInputDialog("Nombre:");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.registrarMecanico(idendificacion, nombre, salario));
                    } else if (opcionMecanico == 2) {
                        int idendificacion = Integer.parseInt(JOptionPane.showInputDialog("Identificación a actualizar:"));
                        String nombre = JOptionPane.showInputDialog("Nuevo nombre:");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Nuevo salario:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.actualizarMecanico(idendificacion, nombre, salario));
                    } else if (opcionMecanico == 3) {
                        int idendificacion = Integer.parseInt(JOptionPane.showInputDialog("Identificación a borrar:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.eliminarMecanico(idendificacion));
                    }
                    break;

                case 4:
                    int opcionRepuesto = Integer.parseInt(JOptionPane.showInputDialog("--- REPUESTOS ---\n1. Registrar\n2. Actualizar\n3. Borrar\n4. Volver"));
                    if (opcionRepuesto == 1) {
                        String nombre = JOptionPane.showInputDialog("Nombre:");
                        double costo = Double.parseDouble(JOptionPane.showInputDialog("Costo:"));
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.registrarRepuesto(nombre, costo, cantidad));
                    } else if (opcionRepuesto == 2) {
                        String nombre = JOptionPane.showInputDialog("Nombre a actualizar:");
                        double costo = Double.parseDouble(JOptionPane.showInputDialog("Nuevo costo:"));
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Nueva cantidad:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.actualizarRepuesto(nombre, costo, cantidad));
                    } else if (opcionRepuesto == 3) {
                        String nombre = JOptionPane.showInputDialog("Nombre a borrar:");
                        JOptionPane.showMessageDialog(null, bicicleteria.eliminarRepuesto(nombre));
                    }
                    break;

                case 5:
                    int opcionTarea = Integer.parseInt(JOptionPane.showInputDialog("--- TAREAS ---\n1. Registrar\n2. Actualizar\n3. Borrar\n4. Volver"));
                    if (opcionTarea == 1) {
                        String nombre = JOptionPane.showInputDialog("Nombre Tarea:");
                        double costo = Double.parseDouble(JOptionPane.showInputDialog("Costo:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.registrarTarea(nombre, costo));
                    } else if (opcionTarea == 2) {
                        String nombre = JOptionPane.showInputDialog("Nombre de tarea a actualizar:");
                        double costo = Double.parseDouble(JOptionPane.showInputDialog("Nuevo costo:"));
                        JOptionPane.showMessageDialog(null, bicicleteria.actualizarTarea(nombre, costo));
                    } else if (opcionTarea == 3) {
                        String nombre = JOptionPane.showInputDialog("Nombre a borrar:");
                        JOptionPane.showMessageDialog(null, bicicleteria.eliminarTarea(nombre));
                    }
                    break;

                case 6:
                    int opcionOrden = Integer.parseInt(JOptionPane.showInputDialog("--- ÓRDENES ---\n1. Crear Nueva Orden\n2. Calcular Total\n3. Volver"));
                    if (opcionOrden == 1) {
                        int numeroOrden = Integer.parseInt(JOptionPane.showInputDialog("Número Orden:"));
                        String fechaIngreso = JOptionPane.showInputDialog("Fecha:");
                        String tipoOrden = JOptionPane.showInputDialog("Tipo:");
                        OrdenServicio nOrd = new OrdenServicio(numeroOrden, fechaIngreso, null, " ", tipoOrden);
                        bicicleteria.getOrdenes().add(nOrd);
                        JOptionPane.showMessageDialog(null, "Orden creada.");
                    } else if (opcionOrden == 2) {
                        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Número de Orden:"));
                        boolean encontrada = false;
                        for (int i = 0; i < bicicleteria.getOrdenes().size(); i++) {
                            if (bicicleteria.getOrdenes().get(i).getNumeroOrden() == buscar) {
                                JOptionPane.showMessageDialog(null, "Total Orden: $" + bicicleteria.getOrdenes().get(i).calularTotal());
                                encontrada = true;
                            }
                        }

                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "See salio");
                    break;
            }
        } while (opcionPrincipal != 7);
    }
}