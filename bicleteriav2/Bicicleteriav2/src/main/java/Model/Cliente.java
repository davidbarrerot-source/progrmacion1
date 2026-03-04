package Model;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String telefono;
    private LocalDate fechanacimiento;
    private int numerobicicletas;
    private String identificacion;

    public Cliente(String nombre, String identificacion,
                   String telefono, LocalDate fechanacimiento,
                   int numerobicicletas) {

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.numerobicicletas = numerobicicletas;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getNumerobicicletas() {
        return numerobicicletas;
    }

    public void setNumerobicicletas(int numerobicicletas) {
        this.numerobicicletas = numerobicicletas;
    }

    @Override
    public String toString() {
        return "cliente "+"su identidicacion "+identificacion+"su nombre "+nombre+"fecha nacimiento "+fechanacimiento+"el total de bicletas es "+numerobicicletas;
    }
}
