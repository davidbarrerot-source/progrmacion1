package App;

import javax.swing.JOptionPane;
import model.*;
import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa", new ArrayList<>());

        String[] opciones = {"Agregar Empleado Planta", "Agregar Empleado Temporal", "Agregar Empleado Venta",
                "Listar Empleados", "Buscar Empleado", "Mayor Salario", "Calcular Nómina", "Mostrar Resumen", "Salir"};

        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Empresa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                   
                    String nombrePlanta = JOptionPane.showInputDialog("Nombre:");
                    String documentoPlanta = JOptionPane.showInputDialog("Documento:");
                    int edadPlanta = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    float salarioBasePlanta = Float.parseFloat(JOptionPane.showInputDialog("Salario Base:"));
                    float descSaludPlanta = Float.parseFloat(JOptionPane.showInputDialog("Descuento Salud (%):"));
                    float descPensionPlanta = Float.parseFloat(JOptionPane.showInputDialog("Descuento Pensión (%):"));
                    CategoriaEmpleado catPlanta = CategoriaEmpleado.valueOf(
                            JOptionPane.showInputDialog("Categoría (JUNIOR, SEMI_SENIOR, SENIOR):").toUpperCase());
                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Horas Extra:"));
                    float valorHoraExtra = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora Extra:"));
                    float auxTransporte = Float.parseFloat(JOptionPane.showInputDialog("Auxilio Transporte:"));

                    empresa.agregarEmpleado(new EmpleadoPlanta(nombrePlanta, documentoPlanta, edadPlanta, salarioBasePlanta,
                            descSaludPlanta, descPensionPlanta, catPlanta, cargo, horasExtra, valorHoraExtra, auxTransporte));
                    break;

                case 1:
                   
                    String nombreTemporal = JOptionPane.showInputDialog("Nombre:");
                    String documentotemporal = JOptionPane.showInputDialog("Documento:");
                    int edadTemporal = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    float salarioBaseTemporal = Float.parseFloat(JOptionPane.showInputDialog("Salario Base:"));
                    float descSaludTemporal = Float.parseFloat(JOptionPane.showInputDialog("Descuento Salud (%):"));
                    float descPensionTemporal = Float.parseFloat(JOptionPane.showInputDialog("Descuento Pensión (%):"));
                    CategoriaEmpleado catTemporal = CategoriaEmpleado.valueOf(
                            JOptionPane.showInputDialog("Categoría (JUNIOR, SEMI_SENIOR, SENIOR):").toUpperCase());
                    int diasTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Días trabajados:"));
                    int valorDia = Integer.parseInt(JOptionPane.showInputDialog("Valor día:"));

                    empresa.agregarEmpleado(new EmpleadoTemporal(nombreTemporal, documentotemporal, edadTemporal, salarioBaseTemporal,
                            descSaludTemporal, descPensionTemporal, catTemporal, diasTrabajados, valorDia));
                    break;

                case 2:
                   
                    String nombreVenta = JOptionPane.showInputDialog("Nombre:");
                    String documentoVenta = JOptionPane.showInputDialog("Documento:");
                    int edadVenta = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    float salarioBaseVenta = Float.parseFloat(JOptionPane.showInputDialog("Salario Base:"));
                    float descSaludVenta = Float.parseFloat(JOptionPane.showInputDialog("Descuento Salud (%):"));
                    float descPensionVenta = Float.parseFloat(JOptionPane.showInputDialog("Descuento Pensión (%):"));
                    CategoriaEmpleado catVenta = CategoriaEmpleado.valueOf(
                            JOptionPane.showInputDialog("Categoría (JUNIOR, SEMI_SENIOR, SENIOR):").toUpperCase());
                    float totalVentas = Float.parseFloat(JOptionPane.showInputDialog("Total Ventas:"));
                    float porcentajeComision = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Comisión (%):"));

                    empresa.agregarEmpleado(new EmpleadoVenta(nombreVenta, documentoVenta, edadVenta, salarioBaseVenta,
                            descSaludVenta, descPensionVenta, catVenta, totalVentas, porcentajeComision));
                    break;

                case 3:

                    empresa.listarEmpleados();
                    break;

                case 4:
                    String docBuscar = JOptionPane.showInputDialog("Documento a buscar:");
                    Empleado encontrado = empresa.buscarEmpleado(docBuscar);
                    if (encontrado != null) {
                        JOptionPane.showMessageDialog(null, "Empleado encontrado: " + encontrado.getNombre() +
                                "\nSalario Neto: " + encontrado.calcularSalarioNeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Mayor salario neto: " + empresa.obtenerMayorSalario());
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Nómina total: " + empresa.calcularNominaTotal());
                    break;

                case 7:

                    mostrarResumenVentana(empresa);
                    break;
            }
        } while (opcion != 8);
    }


    public static void mostrarResumenVentana(Empresa empresa) {
        String contenido = empresa.mostrarResumenCompleto();
        JOptionPane.showMessageDialog(null, contenido, "Resumen General", JOptionPane.INFORMATION_MESSAGE);
    }
}
