package app;
import  model.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Aplicacion {

    public static void main(String[] args) {

        //instacia de peaje
        EstacionPeaje estacion = new EstacionPeaje("peaje", "armenia");
        String[] opciones = {
                "cobrar carro",
                "cobrar moto",
                "cobrar camion",
                "ver camiones especial","reporte generar",
                "salir"
        };

        boolean continuar = true;
        while (continuar) {
            int seleccion = JOptionPane.showOptionDialog(null,"seleccione una opcion", "sistema de peaje", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        switch (seleccion){
            case 0:
                estacion.cobrarPeaje(Carro.informacion());
                break;
                case 1:
                    estacion.cobrarPeaje(Moto.informacion());
                    break;
            case 2:
                estacion.cobrarPeaje(Camion.informacion());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,estacion.generReporte(),"reporte",JOptionPane.INFORMATION_MESSAGE);


            case 4:

                JOptionPane.showMessageDialog(null,estacion.reportegeneral());
                break;
            case 5:
            case -1:
                continuar =false;
                break;
        }
        }
    }
}
