package co.unicauca.paper.domain.services.construir;

import co.unicauca.paper.domain.entidades.Evaluacion;

/**
 * @brief Clase Director que se encarga de la construcción de la evaluación
 * */

public class WorkSpace {

    private EvaluacionBuilder builder;

    /**
     * @brief Inicializar el espacio de trabajo recibiendo una instancia de EvalucionBuilder
     * @param builder Instancia para la construcción de la evaluación
     */
    public WorkSpace init(EvaluacionBuilder builder) {
        this.builder = builder;
        return this;
    }
    /**
     * @brief Metodo que se encarga de construir la evalucion y despues devolverla
     * @param evaluacion Evaluación a construir
     * @return evalaución construida
     */
    public Evaluacion construir(Evaluacion evaluacion) {
        builder.init(evaluacion);
        builder.conocimientoEvaluador();
        builder.calificar();
        builder.veredictoEvaluador();
        builder.comentariosEvaluador();
        return builder.getEvaluacion();
    }
}
