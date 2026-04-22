

import model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class test {

    private static final Logger LOG = Logger.getLogger(test.class.getName());

    @Test
    void verificarDescuentosVentas() {
        LOG.info("Iniciando prueba de descuentos...");
        float esperadoDescuento = 92000f;

        EmpleadoVenta vendedor = new EmpleadoVenta(
                "Juan", "123", 20, 1000000f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                1000000f, 10f
        );

        float actualDescuento = vendedor.calcularDescuentos();
        assertEquals(esperadoDescuento, actualDescuento, 0.001f, "El cálculo de descuentos es incorrecto");
        LOG.info("Prueba finalizada con éxito.");
    }

    @Test
    void pruebasalariomayoracero() {
        LOG.info("Inicio de pruebas verificar salario");

        EmpleadoTemporal c1 = new EmpleadoTemporal(
                "Juan", "103020", 25, 0f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                20, 12000
        );

        float actual = c1.calcularSalarioNeto();
        assertNotEquals(0.0f, actual, 0.001f, "el salario no debe ser cero");

        LOG.info("Fin de la prueba verificar salario. Calculado: " + actual);
    }@Test
    void verificaempleados() {
        LOG.info("Iniciando prueba: verificar datos almacenados del empleado");


        EmpleadoTemporal c1 = new EmpleadoTemporal(
                "Juan", "10", 30, 200000f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                15, 50000
        );


        String actual = c1.getNombre();
        String esperado = "Juan";


        assertEquals(esperado, actual);

        LOG.info("Prueba de verificación de nombre finalizada con éxito.");
    }@Test
    void verificarBonificacionmayorcero() {
        LOG.info("Inicio de prueba: verificación de bonificación mayor a cero");


        EmpleadoVenta c1 = new EmpleadoVenta(
                "Juan", "10", 20, 1000000f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                100000f, 10f
        );


        float bonificacion = c1.calcularBonificacionCategoria();


        assertTrue(bonificacion > 0, "La bonificación por categoría debe ser mayor a cero");

        LOG.info("Fin de la prueba. Bonificación calculada: " + bonificacion);
    }
    @Test
    void verificarsalarionegativo() {
        LOG.info("Inicio de prueba: verificar que el salario neto no sea negativo");

        EmpleadoPlanta c1 = new EmpleadoPlanta(
                "Juan", "1004785", 20, 0f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                "Operario", 0, 0f, 0f
        );


        float resultadoActual = c1.calcularSalarioNeto();


        assertTrue(resultadoActual >= 0, "El salario neto no puede ser negativo");

        LOG.info("Fin de prueba. Salario calculado: " + resultadoActual);
    }
    @Test
    void verificarexistenciadelempleado() {
        LOG.info("Inicio de la prueba: verificar búsqueda de empleado inexistente");


        Empresa miEmpresa = new Empresa("Empresa Prueba", new ArrayList<>());


        String buscar = "111111";


        Empleado resultado = miEmpresa.buscarEmpleado(buscar);

        assertNull(resultado, "La búsqueda de un ID inexistente debería retornar null");

        LOG.info("Fin de la prueba. Resultado de búsqueda fue null como se esperaba.");
    }@Test
    void verificarsalarionegativo2() {
        LOG.info("Inicio de prueba: verificar excepción por salario negativo");


        assertThrows(IllegalArgumentException.class, () ->{

            new EmpleadoPlanta(
                    "Juan", "1004785", 20, -5000f,
                    4f, 4f, CategoriaEmpleado.JUNIOR,
                    "Operario", 0, 0f, 0f
            );
        });

        LOG.info("Fin de la prueba: la excepción fue lanzada correctamente.");
    }
    @Test
    void verificarEmpleado() {
        LOG.info("Inicio de prueba: verificar empleados con salario mayor a un valor");

        Empresa miEmpresa = new Empresa("Empresa Prueba", new ArrayList<>());


        EmpleadoPlanta juan = new EmpleadoPlanta(
                "Juan", "101", 20, 60000f, 4f, 4f,
                CategoriaEmpleado.JUNIOR, "Cargo1", 0, 0f, 0f
        );
        EmpleadoPlanta maria = new EmpleadoPlanta(
                "Maria", "102", 25, 100000f, 4f, 4f,
                CategoriaEmpleado.SENIOR, null, 0, 0f, 0f
        );

        miEmpresa.agregarEmpleado(juan);
        miEmpresa.agregarEmpleado(maria);



        ArrayList<Empleado> actual = miEmpresa.mayorsalario(80000.0);


        ArrayList<Empleado> esperado = new ArrayList<>();
        esperado.add(maria);


        assertIterableEquals(esperado, actual, "La lista de empleados con mayor salario no es la correcta");

        LOG.info("Fin de la prueba. Tamaño de lista esperado: " + esperado.size());
    }
    @Test
    void testInexistente() {
        LOG.info("Iniciando prueba: buscar documento inexistente");


        Empresa emp = new Empresa("Empresa Prueba", new ArrayList<>());


        Empleado resultado = emp.buscarEmpleado("458");


        assertNull(resultado, "El resultado debe ser null cuando el empleado no existe");

        LOG.info("Prueba finalizada: el sistema retornó null correctamente.");
    }
    @Test
    void verificarnoduplicados() {
        LOG.info("Iniciando prueba: verificar que no se permitan documentos duplicados");

        Empresa empresa = new Empresa("Mi Empresa", new ArrayList<>());

  
        Empleado e1 = new EmpleadoPlanta("Juan", "100", 20, 500000f, 4f, 4f,
                CategoriaEmpleado.JUNIOR, "Operario", 0, 0f, 0f);

        Empleado e2 = new EmpleadoPlanta("Luis", "100", 25, 600000f, 4f, 4f,
                CategoriaEmpleado.JUNIOR, null, 0, 0f, 0f);


        empresa.agregarEmpleado(e1);


        boolean resultado = empresa.agregarEmpleado(e2);


        assertFalse(resultado, "El sistema no debería permitir registrar un documento duplicado");

        LOG.info("Prueba finalizada: el sistema bloqueó correctamente el duplicado.");
    }
    @Test
    void verificarEmpleadoconmayorsalario() {
        LOG.info("Verificando mejores pagados");
        Empresa empresa = new Empresa("Empresa", new ArrayList<>());
        EmpleadoPlanta maria = new EmpleadoPlanta("Maria", "102", 25, 2000000f, 4f, 4f, CategoriaEmpleado.SENIOR, "Gerente", 0, 0f, 0f);
        empresa.agregarEmpleado(maria);

        float max = empresa.obtenerMayorSalario();
        ArrayList<Empleado> mejores = empresa.mayorsalario(max - 1);
        assertIterableEquals(new ArrayList<Empleado>() {{ add(maria); }}, mejores);

    }
    @Test
    void verificartemporales() {
        LOG.info("Inicio de prueba: verificar empleados temporales con más de 100 horas");


        Empresa empresa = new Empresa("Empresa Prueba", new ArrayList<>());


        EmpleadoTemporal carlos = new EmpleadoTemporal(
                "Carlos", "201", 30, 0f, 4f, 4f,
                CategoriaEmpleado.JUNIOR, 120, 5000
        );
        EmpleadoTemporal ana = new EmpleadoTemporal(
                "Ana", "202", 25, 0f, 4f, 4f,
                CategoriaEmpleado.JUNIOR, 80, 5000
        );

        empresa.agregarEmpleado(carlos);
        empresa.agregarEmpleado(ana);


        ArrayList<Empleado> actual = empresa.obtenerTemporalesmasde100horas();


        ArrayList<Empleado> esperado = new ArrayList<>();
        esperado.add(carlos);


        assertIterableEquals(esperado, actual, "La lista de temporales con más de 100 horas es incorrecta");

        LOG.info("Fin de la prueba. Empleados encontrados: " + actual.size());
    }@Test
    void verificarsalarioneto() {
        LOG.info("Inicio de prueba: verificar que salario neto > salario base en planta");

        float salarioBase = 500000f;


        EmpleadoPlanta juan = new EmpleadoPlanta(
                "Juan", "101", 20, salarioBase,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                null, 0, 0f, 0f
        );


        float salarioNeto = juan.calcularSalarioNeto();


        assertTrue(salarioNeto > salarioBase,
                "El salario neto (" + salarioNeto + ") debería ser mayor al base (" + salarioBase + ") por los beneficios de ley y categoría");

        LOG.info("Fin prueba. Neto calculado: " + salarioNeto);
    }
    @Test
    void verificarSalarioNetoTemporal() {
        LOG.info("Inicio de prueba: verificar salario neto positivo en empleado temporal");


        EmpleadoTemporal carlos = new EmpleadoTemporal(
                "Carlos", "201", 25, 0f,
                4f, 4f, CategoriaEmpleado.JUNIOR,
                20, 50000
        );


        float salarioNeto = carlos.calcularSalarioNeto();


        assertTrue(salarioNeto > 0, "El salario neto debe ser mayor a cero para datos válidos");

        LOG.info("Fin prueba. Salario neto temporal calculado: " + salarioNeto);
    }
}