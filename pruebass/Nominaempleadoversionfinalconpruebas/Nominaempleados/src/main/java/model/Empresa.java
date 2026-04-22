package model;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private int edad;
    private double salarioBase;
    private ArrayList<Empleado> listaempleados;

    public Empresa(String nombre, ArrayList<Empleado> listaempleados) {
        this.nombre = nombre;
        this.listaempleados = listaempleados;
    }public void setEdad(int edad) { this.edad = edad; }
public void setSalarioBase(float salarioBase) { this.salarioBase = salarioBase; }

    public boolean eliminarEmpleado(String documento) {
        Empleado encontrado = buscarEmpleado(documento);
        if (encontrado != null) {
            listaempleados.remove(encontrado);
            return true;
        }
        return false;
    }

    public boolean actualizarEmpleado(String documento, int nuevaEdad, float nuevoSalarioBase) {
        Empleado encontrado = buscarEmpleado(documento);
        if (encontrado != null) {
            encontrado.setEdad(nuevaEdad);
            encontrado.setSalarioBase(nuevoSalarioBase);
            return true;
        }
        return false;
    }

    public boolean agregarEmpleado(Empleado e) {

        if (buscarEmpleado(e.getDocumento()) != null) {

            return false;
        }


        listaempleados.add(e);
        return true;
    }

    public ArrayList<ResumenPago> generarResumenes() {
        ArrayList<ResumenPago> listaResumenPago = new ArrayList<>();
        for (int i = 0; i < listaempleados.size(); i++) {
            listaResumenPago.add(listaempleados.get(i).generarResumenPago());
        }
        return listaResumenPago;
    }

    public String mostrarResumenCompleto() {
        if (listaempleados.isEmpty()) return "No hay empleados registrados.";

        StringBuilder acumulado = new StringBuilder(" REPORTE DE EMPLEADOS \n\n");
        for (Empleado emp : listaempleados) {
            acumulado.append(emp.mostrarInformacion()).append("\n");
        }
        return acumulado.toString();
    }

    public float calcularNominaTotal() {
        float nomina = 0;
        for (Empleado emp : listaempleados) {
            nomina += emp.calcularSalarioNeto();
        }
        return nomina;
    }

    public float obtenerMayorSalario() {
        if (listaempleados.isEmpty()) return 0;
        float salariomayor = listaempleados.get(0).calcularSalarioNeto();
        for (Empleado emp : listaempleados) {
            if (emp.calcularSalarioNeto() > salariomayor) {
                salariomayor = emp.calcularSalarioNeto();
            }
        }
        return salariomayor;
    }

    public Empleado buscarEmpleado(String documento) {
        for (Empleado e : listaempleados) {
            if (e.getDocumento().equals(documento)) return e;
        }
        return null;
    }


    public void listarEmpleados() {
        String contenido = this.mostrarResumenCompleto();
        JOptionPane.showMessageDialog(null, contenido, "Listado de Empleados", JOptionPane.INFORMATION_MESSAGE);
    }
    public ArrayList<Empleado> mayorsalario(double u) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : listaempleados) {

            if (emp.calcularSalarioNeto() > u) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

}