package model;

 public class impresoralaser implements impresora {
     private boolean conetada = false ;
     @Override
     public void conectar(){this.conetada= true;
         System.out.println("laser conectada");}
     @Override
     public void desconectar(){this.conetada=false;
         System.out.println("laser desconetada ");}
     @Override
     public boolean esconectada(){return conetada;}
     @Override
     public void imprimir(documento doc){
         System.out.println("imprimiendo laser"+ doc.getContenido());
     }
}
