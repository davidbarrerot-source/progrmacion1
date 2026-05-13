package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private String titulo;
    private String descripcion;
    private EstadoNoticia estado;
    private List<String> estiquetas;

    public Noticia(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado=EstadoNoticia.PENDIENTE;
        this.estiquetas=new ArrayList<>();
    }
    public void actualizarEstado(EstadoNoticia nuevoEstado){
        this.estado=nuevoEstado;
    }
    public void agregarEtiqueta(String etiqueta){
        this.estiquetas.add(etiqueta);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoNoticia getEstado() {
        return estado;
    }

    public void setEstado(EstadoNoticia estado) {
        this.estado = estado;
    }

    public List<String> getEstiquetas() {
        return estiquetas;
    }

    public void setEstiquetas(List<String> estiquetas) {
        this.estiquetas = estiquetas;
    }
}
