package model;

public abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected int edad;
    protected float salarioBase;
    protected float descuentoSalud;
    protected float descuentoPension;
    protected CategoriaEmpleado categoriaEmpleado;

    public abstract float calcularSalarioBruto();
    public abstract float calcularBonificacionCategoria();
    public abstract float calcularDescuentos();
    public abstract float calcularSalarioNeto();

    public Empleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.categoriaEmpleado = categoriaEmpleado;
    }

   
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public CategoriaEmpleado getCategoriaEmpleado() { return categoriaEmpleado; }

    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\nDocumento: " + documento +
                "\nTipo: " + this.getClass().getSimpleName() +
                "\nSalario Neto: $" + calcularSalarioNeto();
    }

    public ResumenPago generarResumenPago() {
        return new ResumenPago(
                this.documento,
                this.nombre,
                this.getClass().getSimpleName(),
                this.calcularSalarioBruto(),
                this.calcularDescuentos(),
                this.calcularSalarioNeto()
        );
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalarioBase(float salarioBase) {
        if (salarioBase < 0) {
            System.out.println("El salario no puede ser negativo");
        } else {
            this.salarioBase = salarioBase;
        }
    }
}