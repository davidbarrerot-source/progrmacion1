package Model;

import App.Aplicacion;

import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private LocalTime horaEntradsEmpresa;
    private ArrayList<Empleado> listaEmpleados;


    public Empresa(String nombre, LocalTime horaEntradsEmpresa) {
        this.nombre = nombre;
        this.horaEntradsEmpresa = horaEntradsEmpresa;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado nuevo) {

        this.listaEmpleados.add(nuevo);
    }


    public ArrayList<Empleado> consultartarde() {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado empleadoAux = listaEmpleados.get(i);


            if (empleadoAux.llegoTarde(horaEntradsEmpresa)) {
                resultado.add(empleadoAux);
            }
        }
        return resultado;
    }
    public void registrarEmpleados(int cantidad){
        for (int i=0;i<cantidad;i++){
            JOptionPane.showMessageDialog(null,"datos empleados");
            String nombre =JOptionPane.showInputDialog("nombre");

            int horas=Integer.parseInt(JOptionPane.showInputDialog("horas de entrada"));
            int minutos =Integer.parseInt(JOptionPane.showInputDialog("ingrese minutos "));
             Empleado nuevo = new Empleado (nombre , LocalTime.of(horas,minutos));
             this.listaEmpleados.add(nuevo);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraEntradsEmpresa() {
        return horaEntradsEmpresa;
    }

    public void setHoraEntradsEmpresa(LocalTime horaEntradsEmpresa) {
        this.horaEntradsEmpresa = horaEntradsEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", horaEntradsEmpresa=" + horaEntradsEmpresa +
                ", totalEmpleados=" + listaEmpleados.size() +
                '}';
    }
}