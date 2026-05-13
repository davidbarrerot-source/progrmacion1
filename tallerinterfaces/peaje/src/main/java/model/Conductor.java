package model;
import java.time.LocalDate;
import java.util.List;
public record Conductor( String nombre,
                         String apellido,String documento,LocalDate fechanacimeto,
                         List<Vehiculo> listaVehiculos) {

}
