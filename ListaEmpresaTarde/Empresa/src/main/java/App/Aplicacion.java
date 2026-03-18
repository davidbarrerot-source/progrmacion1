package App;

import Model.Empresa;
import Model.Empleado;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.time.LocalTime;

public class Aplicacion {
    public static void main(String[]args){
        String nombreEmpresa=JOptionPane.showInputDialog("ingrese el nombre de la empresa ");
        int horaEmpresa= Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de entrada de la empresa "));
        int minutosEmpresa=Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos de la empresa "));
        Empresa empresa=new Empresa (nombreEmpresa,LocalTime.of(horaEmpresa,minutosEmpresa));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de empleados a registra "));
        empresa.registrarEmpleados(cantidad);
        String reporte ="lista de tarde ";
        ArrayList<Empleado>tarde=empresa.consultartarde();
        for (int i=0;i< tarde.size();i++){
            Empleado empleado=tarde.get(i);
            reporte +=(i+1)+empleado.getNombre()+empleado.getHoraEntrada();


        }
        JOptionPane.showMessageDialog(null,reporte );

        }



    }

