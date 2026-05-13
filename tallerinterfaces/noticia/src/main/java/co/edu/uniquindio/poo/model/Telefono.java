package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class Telefono  implements Notificador{
    private String numero;
    public Telefono (String numero){
        this.numero=numero;
    }@Override
    public EstadoNoticia envianoticia(Noticia noticia){
        JOptionPane.showMessageDialog(null,"enviado sms"+numero+noticia.getTitulo());

    return EstadoNoticia.EVIADA;
    }
}
