package model;

import javax.swing.*;

public class Camion extends Vehiculo{
    private int ejes;
    private double capacidadCarga;
    public Camion(String placa ,int ejes, double capacidadCarga){
        super(placa);
        this.ejes=ejes;
        this.capacidadCarga=capacidadCarga;

    }
    public static Camion informacion(){
      String placa= JOptionPane.showInputDialog("digite la placa");
      int ejes=Integer.parseInt((JOptionPane.showInputDialog("numero de ejes")));
double carga =Double.parseDouble((JOptionPane.showInputDialog("ingrese capacidad de carga ")));
return new Camion(placa,ejes,carga);
    }

@Override
public double calcularPeaje(){
      double  tarifabase=0;
        tarifabase=ejes*7000;
        if(capacidadCarga>10){
            tarifabase *=1.10;
        }

 return tarifabase;
}
public double getCapacidadCarga(){return capacidadCarga;}

}
