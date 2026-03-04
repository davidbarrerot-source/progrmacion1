package App;

import Model.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {

        Bicicleteria tienda = new Bicicleteria("nombre ", "direccion");

        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    " MENU PRINCIPAL \n"
                            + "1. Registrar Cliente\n"
                            + "2. Registrar Bicicleta\n"
                            + "3. Registrar Mecanico\n"
                            + "4. Registrar Repuesto\n"
                            + "5. Registrar Orden\n"
                            + "6. Salir\n\n"
                            + "Seleccione una opcion:"
            ));

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String id = JOptionPane.showInputDialog("Identificacion:");
                    String telefono = JOptionPane.showInputDialog("Telefono:");

                    int anio = Integer.parseInt(
                            JOptionPane.showInputDialog("Año nacimiento:")
                    );
                    int mes = Integer.parseInt(
                            JOptionPane.showInputDialog("Mes nacimiento:")
                    );
                    int dia = Integer.parseInt(
                            JOptionPane.showInputDialog("Dia nacimiento:")
                    );

                    int numBici = Integer.parseInt(
                            JOptionPane.showInputDialog("Numero bicicletas:")
                    );

                    LocalDate fecha = LocalDate.of(anio, mes, dia);

                    JOptionPane.showMessageDialog(null,
                            tienda.registrarCliente(nombre, id, telefono, fecha, numBici)
                    );
                    break;

                case 2:

                    String marca = JOptionPane.showInputDialog("Marca:");
                    int serial = Integer.parseInt(
                            JOptionPane.showInputDialog("Serial:")
                    );
                    String tipo = JOptionPane.showInputDialog("Tipo:");
                    String color = JOptionPane.showInputDialog("Color:");

                    JOptionPane.showMessageDialog(null,
                            tienda.registrarBicicleta(marca, serial, tipo, color)
                    );
                    break;

                case 3:

                    int idMec = Integer.parseInt(
                            JOptionPane.showInputDialog("Identificacion:")
                    );
                    String nombreMec = JOptionPane.showInputDialog("Nombre:");
                    double salario = Double.parseDouble(
                            JOptionPane.showInputDialog("Salario:")
                    );

                    JOptionPane.showMessageDialog(null,
                            tienda.registrarMecanico(idMec, nombreMec, salario)
                    );
                    break;

                case 4:

                    String nombreRep = JOptionPane.showInputDialog("Nombre repuesto:");
                    double costo = Double.parseDouble(
                            JOptionPane.showInputDialog("Costo:")
                    );
                    int cantidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Cantidad:")
                    );

                    JOptionPane.showMessageDialog(null,
                            tienda.registrarRepuesto(nombreRep, costo, cantidad)
                    );
                    break;

                case 5:

                    int numOrden = Integer.parseInt(
                            JOptionPane.showInputDialog("Numero Orden:")
                    );

                    String idCliente = JOptionPane.showInputDialog("ID Cliente:");
                    int serialBici = Integer.parseInt(
                            JOptionPane.showInputDialog("Serial Bicicleta:")
                    );

                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "salin");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }

        } while (opcion != 6);
    }
}