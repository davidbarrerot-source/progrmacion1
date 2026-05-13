package model;
import java.time.LocalDate;
import java.time.LocalTime;

public record RegistroPeaje(Vehiculo vehiculo,Icobrador cobrador,double valor,LocalDate fecha,LocalTime hora ) {
}
