package model;

import javax.swing.*;

public class Carro  extends Vehiculo{
    private boolean esElectrico;
    private boolean esServicioPublico;

    public Carro(String placa, boolean esElectrico, boolean esServicioPublico) {
        super(placa);
        this.esElectrico = esElectrico;
        this.esServicioPublico = esServicioPublico;
    }//datos de vehiculo

    public static Carro informacion(){
        String placa = JOptionPane.showInputDialog("digite la placa");
        int electrico =JOptionPane.showConfirmDialog(null,"¿electico? 20%descuentos");
        int publico =JOptionPane.showConfirmDialog(null,"¿es servicio es publico?");
        return new Carro (placa,(electrico ==0), (publico==0));
    }
    @Override
    public double calcularPeaje(){
        double tarifa =1000;
        if(esElectrico) tarifa *=0.80;
        if(esServicioPublico) tarifa *=1.15;
        return tarifa;
    }
}
