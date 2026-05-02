package model;

import java.util.LinkedList;
import java.util.Queue;

public class centroImpresion {
    private Queue<documento>coladocumentos;//cola
    private impresora impresoraactual;

    public centroImpresion(){
        this.coladocumentos=new LinkedList<>();
    }
    public void instalarImpresora(impresora nueva){
        this.impresoraactual=nueva;
    }public void recibirsolicitud (documento doc){
        coladocumentos.add(doc);
        System.out.println("solicitud en cola en "+doc.getAreaOrigen());
    }
    public void procesarimpresion(){

        if (impresoraactual==null){
            System.out.println("no hay impresora");
            return;
        }while(!coladocumentos.isEmpty()){
            //obtiene el primer elemento y lo casa de lista de espera
            documento actual = coladocumentos.poll();
            impresoraactual.imprimir(actual);
        }
    }
}
