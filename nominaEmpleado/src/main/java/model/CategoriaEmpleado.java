package model;

public enum CategoriaEmpleado {
    JUNIOR(0.05f),
    SEMI_SENIOR(0.10f),
    SENIOR(0.15f);
    private final float porcentajeBono;
    CategoriaEmpleado(float porcentajeBono){
        this.porcentajeBono=porcentajeBono;
    }public float getPorcentajeBono(){
        return porcentajeBono;
    }
}