package Model;

import java.util.ArrayList;

public class OrdenServicio {
   private int numeroOrden;
    private String fechaIngreso;

    private String tipoOrden;
    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Bicicleta>bicicletas;
    private ArrayList<Tarea>tareas;
     private ArrayList<Repuesto> repuestos;
    private EstadoOrden estado;
    public OrdenServicio(int numeroOrden, String fechaIngreso,EstadoOrden estado,  String EstadoOrden,String tipoOrden) {
        this.numeroOrden = numeroOrden;
        this.fechaIngreso = fechaIngreso;
        this.estado=estado;
        this.tipoOrden = tipoOrden;
        this.mecanicos = new ArrayList<>();
        this.bicicletas = new ArrayList<>();
        this.tareas=new ArrayList<>();
        this.repuestos=new ArrayList<>();

    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }



    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
    //agregar mecanico
    public void agregarMecanico(Mecanico mecanico){
        mecanicos.add(mecanico);
    }// agregar tarea
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }public void agregarRepuesto(Repuesto repuesto){
        repuestos.add(repuesto);
    }
    public void cambiarEstado(EstadoOrden nuevoEstado){
        this.estado = nuevoEstado;
    }
    public double calularTotal(){
double total=0;
for(int i=0;i<repuestos.size();i++){
total+=repuestos.get(i).calcularSubtotal();
}
for(int i=0;i<tareas.size();i++){
    total+=tareas.get(i).getCosto();
}

return total;
    }

    @Override
    public String toString() {
        return"su numero orden"+numeroOrden+"fecha ingreso"+fechaIngreso+"el total orden "+calularTotal();
    }
}
