package co.unicauca.lab.domain.abstracfactory.fabrica;

import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;
import co.unicauca.lab.domain.abstracfactory.entidades.Participante;
import co.unicauca.lab.domain.abstracfactory.entidades.Poster;
import co.unicauca.lab.domain.abstracfactory.entidades.Sesion;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoParticipante;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoSesion;

/**
 * @brief Fabrica encargada de crear conferencias de tipo Poster
 *
 * */

public class FabricaPoster implements FabricaAbstracta{

    private InterfazConferencia conferencia;

    @Override
    public InterfazConferencia crearConferencia() {
        this.conferencia=new Poster("Titulo Poster Predeterminado");
        crearSesiones();
        crearParticipantes();
        return conferencia;
    }

    @Override
    public void crearSesiones() {
        conferencia.setSecion(new Sesion("Apertura", TipoSesion.APERTURA));
        conferencia.setSecion(new Sesion("Visita Guiada", TipoSesion.VISITAGUIADA));
        conferencia.setSecion(new Sesion("Posters destacados", TipoSesion.POSTERSDESTACADOS));
    }

    @Override
    public void crearParticipantes() {
        conferencia.setParticipante(new Participante("Evaluador", TipoParticipante.EVALUADOR));
        conferencia.setParticipante(new Participante("Asistente",TipoParticipante.ASISTENTE));
    }
}
