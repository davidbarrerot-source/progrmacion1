package model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado>listaempleados;

    public Empresa(String nombre, ArrayList<Empleado> listaempleados) {
        this.nombre = nombre;
        this.listaempleados = listaempleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaempleados() {
        return listaempleados;
    }

    public void setListaempleados(ArrayList<Empleado> listaempleados) {
        this.listaempleados = listaempleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", listaempleados=" + listaempleados +
                '}';
    }
    public void agregarEmpleado(Empleado e){
        listaempleados.add(e);
    }public void listarEmpleados(){
        for(int i  =0; i<listaempleados.size();i++){
            Empleado emp = listaempleados.get(i);
            System.out.println("empleado"+emp.getNombre());

        }
    }public Empleado buscarEmpleado(String documento){
        return listaempleados.stream().filter(e -> e.getDocumento().equals(documento)).findFirst().orElse(null);
    }
    public float obtenerMayorSalario(){
        float salariomayor=listaempleados.get(0).getSalarioBase();
        for(int i=0;i<listaempleados.size();i++){
            if(listaempleados.get(i).getSalarioBase()>salariomayor){
              salariomayor=listaempleados.get(i).getSalarioBase();

            }



        }

        return salariomayor;

    }
    public float calcularNominaTotal(){
         float nomina=0;
        for (Empleado emp :listaempleados){
            nomina+=emp.calcularSalarioNeto();

        }
         return nomina ;
    }
}
