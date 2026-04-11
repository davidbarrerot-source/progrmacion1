package model;

public class EmpleadoPlanta extends Empleado {

    private String cargo;
    private int horasExtra;
    private float valorHoraExtra;
    private float auxilioTransporte;


    public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase,
                          float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado,
                          String cargo, int horasExtra, float valorHoraExtra, float auxilioTransporte) {

        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado);

        this.cargo = cargo;
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporte;
    }


    @Override
    public float calcularSalarioBruto() {

        return salarioBase + (horasExtra * valorHoraExtra) + auxilioTransporte;
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

        return (salarioBase * descuentoSalud) + (salarioBase * descuentoPension);
    }

    @Override
    public float calcularSalarioNeto() {
        return calcularSalarioBruto() + calcularBonificacionCategoria() - calcularDescuentos();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        if(horasExtra<0){
            System.out.println("las horas no pueden ser negativas");
        }else{
        this.horasExtra = horasExtra;}
    }

    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(float auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
}