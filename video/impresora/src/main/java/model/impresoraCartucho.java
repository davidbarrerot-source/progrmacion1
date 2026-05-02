package model;

class impresoraCartucho implements impresora {
    private boolean conectada = false;

    @Override
    public void conectar(){ this.conectada=true ;
        System.out.println("se conecto ");}
    @Override
    public void desconectar(){this.conectada=false;
        System.out.println("desconetada");}

    @Override
    public void imprimir(documento doc){
        System.out.println("imprimieto "+doc.getContenido());

    }@Override
    public boolean esconectada(){
        return this.conectada;
    }
}
