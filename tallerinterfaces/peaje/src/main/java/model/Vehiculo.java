package model;

public abstract class Vehiculo {
    protected String placa;
    protected int numeroPeaje;
    public Vehiculo(String placa){
        this.placa=placa;
                this.numeroPeaje=0;
    }public abstract double calcularPeaje();
        public void aumentarPeaje(){
        this.numeroPeaje++;
        }
        public int getNumeroPeaje(){return numeroPeaje;}
        public String getPlaca(){return placa;}
}
