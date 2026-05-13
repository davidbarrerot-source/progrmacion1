package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.*;
import java.util.List;
import javax.swing.JOptionPane;
public class Aplicacion {
    public static void main(String[] args) {
        Gestor gestor = new Gestor(leer("ingrese nombre del publicador "));
        String[] opciones = {
                "configurar correo",
                "cofigurar telefono",
                "configurar push",
                "crear noticia",
                "enviar mensaje",
                "consulta si  hay noticias pendiente ",
                "salir"
        };
        boolean continuar = true;
        while (continuar) {
            int selecion = JOptionPane.showOptionDialog(null, "selecione opcion", "sistema de noticias", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (selecion) {
                case 0:
                    gestor.configurarcorreo(leer("ingrese el email"));
                    imprimir("correo ");
                    break;
                case 1:
                    gestor.configurartelefono("ingrese eñ telefono");
                    imprimir("relefono conficurado");
                    break;
                case 2:
                    gestor.configurarpush(leer("ingrese id push"));
                    imprimir("push configurado");
                    break;
                case 3:
                    gestor.crearnoticia(leer("titulo noticia"), leer("descripcion"));
                    imprimir("noticia creada con exito");
                    break;
                case 4:
                    //buscar y enviar
                    gestor.ejecutarenvio(leer("titulo de la noticia envia"));
                case 5:
                    imprimir(gestor.reporteconsulta(leer("ingrese palabra")));
                    break;
                case -1:
                    continuar = false;
                    break;

            }

        }
    }

public static String leer(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
}public static  void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
























    }
}
