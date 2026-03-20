package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaccion {
    private int id;
    private TipoTransacion tipo;
    private double monto;
    private LocalDate fecha;
    private LocalTime hora;
    private Cuenta cuenta;

    public Transaccion(int id, TipoTransacion tipo, double monto, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoTransacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacion tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }
}
