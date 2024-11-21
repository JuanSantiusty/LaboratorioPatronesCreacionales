import co.unicauca.lab.domain.prototype.ConferencePrototype;
import co.unicauca.lab.domain.prototype.Session;
import co.unicauca.lab.domain.prototype.Workshop;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPatronPrototipo {
    /**
     * @brief Prueba unitaria para la clonación simple verificando los nombres de las conferencias y si el número de sesiones es igual
     * ya qué se agrega una nueva sesión a la conferencia clonada y como es una clonación simple ambas instancias
     * de conferencias tiene la misma referencia a una lista de sesiones
     * */
    @Test
    public void clonacionSimple() throws InstantiationException, IllegalAccessException {
        ConferencePrototype defaultConference= new Workshop();
        ConferencePrototype quality =  defaultConference.makeClone();
        quality.setName("Third Worlshop Prototipe");
        quality.getMySession().add(new Session("C","Session C"));
        assertEquals("Third Worlshop Prototipe",quality.getName());
        assertEquals("Default Workshop",defaultConference.getName());
        assertEquals(defaultConference.getMySession().size(),quality.getMySession().size());
    }

    /**
     * @brief Prueba unitaria para la clonación profunda verificando los nombres de las conferencias y si el número de sesiones es diferente
     * ya qué se agrega una nueva sesión a la conferencia clonada
     * */
    @Test
    public void clonacionDetallada() throws InstantiationException, IllegalAccessException {
        ConferencePrototype defaultConference= new Workshop();
        ConferencePrototype quality =  defaultConference.makeDeepClone();
        quality.setName("Third Worlshop Prototipe");
        quality.getMySession().add(new Session("C","Session C"));
        assertEquals("Third Worlshop Prototipe",quality.getName());
        assertEquals("Default Workshop",defaultConference.getName());
        Boolean diferentes=defaultConference.getMySession().size()<quality.getMySession().size();
        assertTrue(diferentes);
    }
}
