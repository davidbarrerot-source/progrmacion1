package model;

import javax.swing.*;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }
    public static Moto informacion(){
String placa= JOptionPane.showInputDialog("digite placa de la moto");
int cilindraje=Integer.parseInt(JOptionPane.showInputDialog("digite el cilindraje de la moto"));
return new Moto(placa ,cilindraje);

    }
    @Override
    public double calcularPeaje(){

       if (cilindraje>200){
           return 7000.0;
       }else{
           return 5000.;
       }

    }
}
