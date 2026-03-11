package Model;

public class EstadoOrden {

    private String recibida;
    private String enproceso;
    private String entregado;

    public EstadoOrden(String recibida, String enproceso, String entregado) {
        this.recibida = recibida;
        this.enproceso = enproceso;
        this.entregado = entregado;
    }

    public String getRecibida() {
        return recibida;
    }

    @Override
    public String toString() {
        return "EstadoOrden{" +
                "recibida='" + recibida + '\'' +
                ", enproceso='" + enproceso + '\'' +
                ", entregado='" + entregado + '\'' +
                '}';
    }

    public void setRecibida(String recibida) {
        this.recibida = recibida;
    }

    public String getEnproceso() {
        return enproceso;
    }

    public void setEnproceso(String enproceso) {
        this.enproceso = enproceso;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }
}
