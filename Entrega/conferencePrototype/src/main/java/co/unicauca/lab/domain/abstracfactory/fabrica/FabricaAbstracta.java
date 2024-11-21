package co.unicauca.lab.domain.abstracfactory.fabrica;

import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;

/**
 * @brief Interfaz Fabrica Abstracta que con los metodos necesarios para la creación de una conferencia de algún tipo
 * */
public interface FabricaAbstracta {

    /**
     * @brief Crear el tipo de Conferencia que se requiera
     * @return Conferencia predeterminada creada
     * */
    InterfazConferencia crearConferencia();
    /**
     * @brief Asignar sesiones predeterminadas a la conferencia dependiendo del tipo de conferencia
     * */
    void crearSesiones();
    /**
     * @brief Asignar participantes predeterminadas a la conferencia dependiendo del tipo de conferencia
     * */
    void crearParticipantes();
}
