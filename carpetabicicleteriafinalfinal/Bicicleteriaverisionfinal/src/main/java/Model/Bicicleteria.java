package Model;

import java.util.ArrayList;
import java.time.LocalDate;
public class Bicicleteria {
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    private String nombre;
private String direccion;
private ArrayList<Cliente> clientes;
    private ArrayList <Bicicleta>bicicletas;
private ArrayList<Mecanico>mecanicos;
private ArrayList<Tarea>tareas;
private ArrayList<Repuesto>repuestos;
private ArrayList<OrdenServicio>ordenes;

//constructos
public Bicicleteria(String nombre ,String direccion){
    this.nombre = nombre;
    this.direccion = direccion;
     this.tareas=new ArrayList<>();
    this.clientes = new ArrayList<>();
    this.mecanicos = new ArrayList<>();
    this.bicicletas = new ArrayList<>();
    this.repuestos = new ArrayList<>();
    this.ordenes = new ArrayList<>();
}//getter

    public ArrayList<Bicicleta> getBiciletas() {
        return bicicletas;
    }

    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<OrdenServicio> getOrdenes() {
        return ordenes;
    }

    public ArrayList<Repuesto> getRepuestos() {
        return repuestos;
    }


    public void setBiciletas(ArrayList<Bicicleta> biciletas) {
        this.bicicletas= bicicletas;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setMecanicos(ArrayList<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public void setOrdenes(ArrayList<OrdenServicio> ordenes) {
        this.ordenes = ordenes;
    }

    public void setRepuestos(ArrayList<Repuesto> repuestos) {
        this.repuestos = repuestos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "direccion "+direccion+"nombre"+nombre;
    }



    public String registrarCliente(String nombre, String identificacion,
                                   String telefono, LocalDate fechaNacimiento,
                                   int numeroBicicletas) {

        if (buscarCliente(identificacion) != null) {
            return "El cliente ya existe";
        }

        Cliente nuevoCliente = new Cliente(nombre, identificacion,
                telefono, fechaNacimiento, numeroBicicletas);

        clientes.add(nuevoCliente);

        return "Cliente registrado correctamente";
    }


    public Cliente buscarCliente(String identificacion) {

        for (Cliente clienteAux : clientes) {
            if (clienteAux.getIdentificacion().equals(identificacion)) {
                return clienteAux;
            }
        }

        return null;
    }


    public String actualizarCliente(String identificacion, String nuevoNombre) {

        Cliente clienteEncontrado = buscarCliente(identificacion);

        if (clienteEncontrado != null) {

            clienteEncontrado.setNombre(nuevoNombre);

            return "Cliente actualizado correctamente";
        }

        return "El cliente no existe";
    }

    public String eliminarCliente(String identificacion) {

        Cliente clienteEncontrado = buscarCliente(identificacion);

        if (clienteEncontrado != null) {

            clientes.remove(clienteEncontrado);

            return "Cliente eliminado correctamente";
        }

        return "El cliente no existe";
    }



    public String registrarBicicleta(String marca, int serial,
                                     String tipo, String color) {

        if (buscarBicicleta(serial) != null) {
            return "La bicicleta ya existe";
        }

        Bicicleta nuevaBicicleta = new Bicicleta(marca, serial, tipo, color);
        bicicletas.add(nuevaBicicleta);

        return "Bicicleta registrada correctamente";
    }



    public Bicicleta buscarBicicleta(int serial) {

        for (int i = 0; i < bicicletas.size(); i++) {

            if (bicicletas.get(i).getSerial() == serial) {
                return bicicletas.get(i);
            }
        }

        return null;
    }



    public String actualizarBicicleta(int serial,
                                      String nuevaMarca,
                                      String nuevoTipo,
                                      String nuevoColor) {

        for (int i = 0; i < bicicletas.size(); i++) {

            if (bicicletas.get(i).getSerial() == serial) {

                bicicletas.get(i).setMarca(nuevaMarca);
                bicicletas.get(i).setTipo(nuevoTipo);
                bicicletas.get(i).setColor(nuevoColor);

                return "Bicicleta actualizada correctamente";
            }
        }

        return "La bicicleta no existe";
    }



    public String eliminarBicicleta(int serial) {

        for (int i = 0; i < bicicletas.size(); i++) {

            if (bicicletas.get(i).getSerial() == serial) {

                bicicletas.remove(i);

                return "Bicicleta eliminada correctamente";
            }
        }

        return "La bicicleta no existe";
    }




    public String registrarMecanico(int idendificacion,
                                    String nombre,
                                    double salario) {

        if (buscarMecanico(idendificacion) != null) {
            return "El mecanico ya existe";
        }

        Mecanico nuevoMecanico =
                new Mecanico(idendificacion, nombre, salario);

        mecanicos.add(nuevoMecanico);

        return "Mecanico registrado correctamente";
    }


    public Mecanico buscarMecanico(int idendificacion) {

        for (int i = 0; i < mecanicos.size(); i++) {

            if (mecanicos.get(i).getIdendificacion() == idendificacion) {
                return mecanicos.get(i);
            }
        }

        return null;
    }



    public String actualizarMecanico(int idendificacion,
                                     String nuevoNombre,
                                     double nuevoSalario) {

        for (int i = 0; i < mecanicos.size(); i++) {

            if (mecanicos.get(i).getIdendificacion() == idendificacion) {

                mecanicos.get(i).setNombre(nuevoNombre);
                mecanicos.get(i).setSalario(nuevoSalario);

                return "Mecanico actualizado correctamente";
            }
        }

        return "El mecanico no existe";
    }



    public String eliminarMecanico(int idendificacion) {

        for (int i = 0; i < mecanicos.size(); i++) {

            if (mecanicos.get(i).getIdendificacion() == idendificacion) {

                mecanicos.remove(i);

                return "Mecanico eliminado correctamente";
            }
        }

        return "El mecanico no existe";
    }

    public String registrarRepuesto(String nombre,
                                    double costo,
                                    int cantidad) {

        if (buscarRepuesto(nombre) != null) {
            return "El repuesto ya existe";
        }

        Repuesto nuevoRepuesto =
                new Repuesto(nombre, costo, cantidad);

        repuestos.add(nuevoRepuesto);

        return "Repuesto registrado correctamente";
    }


    // READ
    public Repuesto buscarRepuesto(String nombre) {

        for (int i = 0; i < repuestos.size(); i++) {

            if (repuestos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return repuestos.get(i);
            }
        }

        return null;
    }



    public String actualizarRepuesto(String nombre,
                                     double nuevoCosto,
                                     int nuevaCantidad) {

        for (int i = 0; i < repuestos.size(); i++) {

            if (repuestos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                repuestos.get(i).setCosto(nuevoCosto);
                repuestos.get(i).setCantidad(nuevaCantidad);

                return "Repuesto actualizado correctamente";
            }
        }

        return "El repuesto no existe";
    }



    public String eliminarRepuesto(String nombre) {

        for (int i = 0; i < repuestos.size(); i++) {

            if (repuestos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                repuestos.remove(i);

                return "Repuesto eliminado correctamente";
            }
        }

        return "El repuesto no existe";
    }


    public String registrarTarea(String nombre, double costo) {

        if (buscarTarea(nombre) != null) {
            return "La tarea ya existe en el sistema";
        }

        Tarea nuevaTarea = new Tarea(nombre, costo);
        tareas.add(nuevaTarea);

        return "Tarea registrada correctamente";
    }

    public Tarea buscarTarea(String nombre) {

        for (int i = 0; i < tareas.size(); i++) {

            if (tareas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return tareas.get(i);
            }
        }
        return null;
    }


    public String actualizarTarea(String nombre, double nuevoCosto) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equalsIgnoreCase(nombre)) {

                tareas.get(i).setCosto(nuevoCosto);

                return "Costo de tarea actualizado correctamente";
            }
        }
        return "La tarea no existe";
    }


    public String eliminarTarea(String nombre) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equalsIgnoreCase(nombre)) {

                tareas.remove(i);

                return "Tarea eliminada correctamente";
            }
        }
        return "La tarea no existe";
    }
}
