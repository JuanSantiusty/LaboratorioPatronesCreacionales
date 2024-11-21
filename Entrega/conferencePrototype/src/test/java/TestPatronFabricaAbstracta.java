import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaAbstracta;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaPoster;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaSimposio;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaWorkshop;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoParticipante;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoSesion;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPatronFabricaAbstracta {

    /**
     * @brief Prueba unitaria que verifica la correcta creación de una conferencia Workshop predeterminada
     * */
    @Test
    public void testCrearConferenciaWorkshop() {
        FabricaAbstracta fabrica=new FabricaWorkshop();
        InterfazConferencia conferencia= fabrica.crearConferencia();
        assertEquals(conferencia.getTitulo(),"Titulo Workshop Predeterminado");
        assertEquals(conferencia.getSecions().getLast().getTipoSecion(), TipoSesion.GRUPOSDETRABAJO);
        assertEquals(conferencia.getParticipantes().getFirst().getTipo(), TipoParticipante.MENTOR);
    }

    /**
     * @brief Prueba unitaria que verifica la correcta creación de una conferencia Simposio predeterminada
     * */
    @Test
    public void testCrearConferenciaSimposio() {
        FabricaAbstracta fabrica=new FabricaSimposio();
        InterfazConferencia conferencia= fabrica.crearConferencia();
        assertEquals(conferencia.getTitulo(),"Titulo Simposio Predeterminado");
        assertEquals(conferencia.getSecions().getLast().getTipoSecion(), TipoSesion.PANELDEDISCUSION);
        assertEquals(conferencia.getParticipantes().getFirst().getTipo(), TipoParticipante.ORADOR);
    }

    /**
     * @brief Prueba unitaria que verifica la correcta creación de una conferencia Poster predeterminada
     * */
    @Test
    public void testCrearConferenciaPoster() {
        FabricaAbstracta fabrica=new FabricaPoster();
        InterfazConferencia conferencia= fabrica.crearConferencia();
        assertEquals(conferencia.getTitulo(),"Titulo Poster Predeterminado");
        assertEquals(conferencia.getSecions().getLast().getTipoSecion(), TipoSesion.POSTERSDESTACADOS);
        assertEquals(conferencia.getParticipantes().getFirst().getTipo(), TipoParticipante.EVALUADOR);
    }
}
