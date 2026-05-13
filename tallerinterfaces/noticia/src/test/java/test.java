import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.uniquindio.poo.model.*;
import java.util.List;
import java.util.logging.Logger;

public class test {
private static final Logger  LOGGER=Logger.getLogger(test.class.getName());
    @Test
    public void consultarnotica(){
        LOGGER.info("inicio prueba");
        Gestor gestor = new Gestor("hola");
        gestor.crearnoticia("fin del mundo","se acabo");
        gestor.crearnoticia("gato","se cayo");
        LOGGER.info("se esta configurando la noticia");
        gestor.configurarcorreo("david@gmail");

        List<Noticia> resultado=gestor.consultarnoticiaporpalabra("mundo");
        assertEquals(1,resultado.size(),"la noticia estapendiente");
        assertEquals("fin del mundo",resultado.get(0).getTitulo());
    }

}
