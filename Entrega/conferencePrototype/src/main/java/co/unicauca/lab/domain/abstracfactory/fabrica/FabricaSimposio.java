package co.unicauca.lab.domain.abstracfactory.fabrica;

import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;
import co.unicauca.lab.domain.abstracfactory.entidades.Participante;
import co.unicauca.lab.domain.abstracfactory.entidades.Sesion;
import co.unicauca.lab.domain.abstracfactory.entidades.Simposio;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoParticipante;
import co.unicauca.lab.domain.abstracfactory.tipos.TipoSesion;

/**
 * @brief Fabrica encargada de crear conferencias de tipo simposio
 * */

public class FabricaSimposio implements FabricaAbstracta{

    private InterfazConferencia conferencia;

    @Override
    public InterfazConferencia crearConferencia() {
        this.conferencia=new Simposio("Titulo Simposio Predeterminado");
        crearSesiones();
        crearParticipantes();
        return conferencia;
    }

    @Override
    public void crearSesiones() {
        conferencia.setSecion(new Sesion("Apertura", TipoSesion.APERTURA));
        conferencia.setSecion(new Sesion("Ponencia magistral", TipoSesion.PONENCIAMAGISTRAL));
        conferencia.setSecion(new Sesion("Panel de discusión", TipoSesion.PANELDEDISCUSION));
    }

    @Override
    public void crearParticipantes() {
        conferencia.setParticipante(new Participante("Orador", TipoParticipante.ORADOR));
        conferencia.setParticipante(new Participante("Asistente", TipoParticipante.ASISTENTE));

    }
}
