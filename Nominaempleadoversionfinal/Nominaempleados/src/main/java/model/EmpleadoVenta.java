package model;

public class EmpleadoVenta extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, float salarioBase,
                          float descuentoSalud, float descuentoPension,
                          CategoriaEmpleado categoriaEmpleado, float totalVentas, float porcentajeComision) {


        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado);

        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float calcularBonificacionCategoria() {

        return salarioBase * categoriaEmpleado.getPorcentajeBono();
    }

    @Override
    public float calcularSalarioBruto() {
        float comision = totalVentas * (porcentajeComision / 100);
        return salarioBase + calcularBonificacionCategoria() + comision;
    }

    @Override
    public float calcularDescuentos() {
        float bruto = calcularSalarioBruto();
        return (bruto * (descuentoSalud / 100)) + (bruto * (descuentoPension / 100));
    }

    @Override
    public String toString() {
        return "EmpleadoVenta{" +
                "totalVentas=" + totalVentas +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }

    @Override
    public float calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularDescuentos();
    }
}