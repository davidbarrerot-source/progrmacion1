package Model;



   

    package Model;

public record Cliente(
            String nombre,
            String apellido,
            String cedula,
            String direccion,
            String email
    ) {
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
