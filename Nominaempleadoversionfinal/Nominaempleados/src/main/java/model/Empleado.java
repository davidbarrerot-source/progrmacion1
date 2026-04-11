package model;

abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected int edad;
    protected float salarioBase;
    protected float descuentoSalud;
    protected float descuentoPension;
    protected CategoriaEmpleado categoriaEmpleado;



    public abstract float calcularSalarioBruto();
    public abstract float  calcularBonificacionCategoria();
    public abstract float calcularDescuentos();
    public abstract float  calcularSalarioNeto();

    public Empleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        if(salarioBase<0) {
            System.out.println("el salario no puede ser negativo");
        }

      else{  this.salarioBase = salarioBase;}
    }

    public float getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(float descuentoSalud) {

        if(descuentoSalud<0 ||descuentoSalud>100){
            System.out.println("porcentaje no es correcto ");
        }
        else {this.descuentoSalud = descuentoSalud;}
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public float getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(float descuentoPension) {

        if(descuentoPension<0||descuentoPension>100){
            System.out.println("error de pension ");

        }
      else{  this.descuentoPension = descuentoPension;}
    }
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

}

