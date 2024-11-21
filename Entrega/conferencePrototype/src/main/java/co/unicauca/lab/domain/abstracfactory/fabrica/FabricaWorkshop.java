package co.unicauca.lab.domain.abstracfactory.fabrica;

import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;
import co.unicauca.lab.domain.abstracfactory.entidades.Participante;
import co.unicauca.lab.domain.abstracfactory.entidades.Sesion;
import co.unicauca.lab.domain.abstracfactory.entidades.Workshop;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoParticipante;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoSesion;

/**
 * @brief Fabrica encargada de crear conferencias de tipo Workshop
 * */

public class FabricaWorkshop implements FabricaAbstracta{

    private InterfazConferencia conferencia;

    @Override
    public InterfazConferencia crearConferencia() {
        conferencia=new Workshop("Titulo Workshop Predeterminado");
        crearSesiones();
        crearParticipantes();
        return conferencia;
    }

    @Override
    public void crearSesiones() {
        conferencia.setSecion(new Sesion("Sesión de apertura", TipoSesion.APERTURA));
        conferencia.setSecion(new Sesion("Sesión interactiva", TipoSesion.INTERACTIVA));
        conferencia.setSecion(new Sesion("Sesión de grupos de trabajo", TipoSesion.GRUPOSDETRABAJO));
    }

    @Override
    public void crearParticipantes() {
        conferencia.setParticipante(new Participante("Mentor", TipoParticipante.MENTOR));
        conferencia.setParticipante(new Participante("Experto", TipoParticipante.EXPERTO));
    }
}
