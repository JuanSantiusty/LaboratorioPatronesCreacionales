package co.unicauca.lab.domain.abstracfactory.entidades;

import java.util.List;

/**
 * @brief Interfaz con los metodos necesarios para una conferencia
 * */

public interface InterfazConferencia {

    void setSecion(Sesion secion);
    void setParticipante(Participante participante);
    List<Sesion> getSecions();
    List<Participante> getParticipantes();
    String getTitulo();
    void setTitulo(String titulo);
}
