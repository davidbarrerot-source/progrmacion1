
import  model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class test {
    @Test
    public void pruebascalculartipovehiculo(){
        //en este caso se elegic camio
        Camion camion =new Camion("asda-1458",2,15.0);
double valorEsperado=15400.0;
assertEquals(valorEsperado,camion.calcularPeaje(),0.001,"calculo incorrecto");


    }@Test
    public void camionespecial(){

        EstacionPeaje peaje =new EstacionPeaje("peaje","armenia");
        Camion camion =new Camion ("sfsdo",200,200);

      peaje.cobrarPeaje(camion);
      List<Camion> resultao=  peaje.obtenerCamionesEspeciales();
      assertEquals(1,resultao.size(),"camion esoencialas");
    }

}
