package App;
import model.*;

public class Aplicacion {
    public static void main(String[] args) {

        empresa miEmpresa = new empresa("impresiones saa");

        centroImpresion centro = miEmpresa.getcentro();
        impresora miimpresora=new impresoralaser();
        centro.instalarImpresora(miimpresora);

        documento documento1 = new documento("nomina", "pagoquincenal ");
        documento documento2 = new documento("inventario ", "no hay teclados");

        centro.recibirsolicitud(documento1);
        centro.recibirsolicitud(documento2);
        centro.procesarimpresion();
    }
}