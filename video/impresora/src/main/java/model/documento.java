package model;

public class documento {
    private String areaOrigen;
    private String contenido;


    public documento(String areaOrigen, String contenido) {
        this.areaOrigen = areaOrigen;
        this.contenido = contenido;
    }

    public String getAreaOrigen() {
        return areaOrigen;
    }

    public void setAreaOrigen(String areaOrigen) {
        this.areaOrigen = areaOrigen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
