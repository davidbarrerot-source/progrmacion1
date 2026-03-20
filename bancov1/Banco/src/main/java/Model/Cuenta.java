package Model;

import javax.swing.*;
import java.util.ArrayList;

public class Cuenta {
    private double saldo;
    private String numero;
    private ArrayList<Cliente>clientes;

    public Cuenta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }public void depositar (double monto){
        if(monto>0){
            saldo+= monto;
            JOptionPane.showMessageDialog(null,"deposito exitoso el saldo es "+saldo);

        }else{
            JOptionPane.showMessageDialog(null,"elvalor debe ser mayor a cero ");
        }
    }public void retirarDinero(int valorAretirar){
        if (valorAretirar<0){
            JOptionPane.showMessageDialog(null,"Ingrese un valor valido ");
        }if(saldo>valorAretirar){
            saldo =saldo-valorAretirar;
            JOptionPane.showMessageDialog(null,"retiro exitoso su saldo es "+saldo);
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numero='" + numero + '\'' +
                '}';
    }
}
