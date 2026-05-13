package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class Correo implements Notificador {
    private String email;
    public Correo(String email){
        this.email=email;
    }
    @Override
    public EstadoNoticia envianoticia(Noticia noticia){
        JOptionPane.showMessageDialog(null,"enviado email"+email+noticia.getTitulo());
    return EstadoNoticia.EVIADA;
    }
}
