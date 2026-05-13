package co.edu.uniquindio.poo.model;

import javax.swing.*;

public class Push  implements Notificador{
    private String iddispositivo;
    public Push(String iddispositivo){
        this.iddispositivo=iddispositivo;
    }@Override
    public EstadoNoticia envianoticia(Noticia noticia){
        JOptionPane.showMessageDialog(null,"enviando notificacion push"+iddispositivo+noticia.getTitulo());
   return EstadoNoticia.EVIADA;
    }
}
