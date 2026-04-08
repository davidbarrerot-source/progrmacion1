package model;

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private int valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase,
                            float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado,
                            int diasTrabajados, int valorDia) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getValorDia() {
        return valorDia;
    }

    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public float calcularSalarioBruto() {
        return diasTrabajados * valorDia;
    }

    @Override
    public float calcularBonificacionCategoria() {

        if (this.categoriaEmpleado == CategoriaEmpleado.JUNIOR) {
            return calcularSalarioBruto() * 0.05f;
        }
        if(this.categoriaEmpleado==CategoriaEmpleado.SEMI_SENIOR){
            return calcularSalarioBruto()*0.10f;
        }if (this.categoriaEmpleado==CategoriaEmpleado.SENIOR){
            return calcularSalarioBruto()* 0.15f;
        }
        return 0f ;
    }

    @Override
    public float calcularDescuentos() {
        return (calcularSalarioBruto() * descuentoSalud) + (calcularSalarioBruto() * descuentoPension);
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "diasTrabajados=" + diasTrabajados +
                ", valorDia=" + valorDia +
                '}';
    }

    @Override
    public float calcularSalarioNeto() {
        return calcularSalarioBruto() + calcularBonificacionCategoria() - calcularDescuentos();
    }
}
