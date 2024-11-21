package co.unicauca.paper.domain.services.construir;

import co.unicauca.paper.domain.entidades.Evaluacion;

/**
 * @brief Clase abstracta que define los métodos para la construcción de una evaluación
 */

public abstract class EvaluacionBuilder {

    protected Evaluacion evaluacion;

    /**
     * @brife Constructor que se encarga de construir la evaluación
     * @param evaluacion Evaluación a evaluar
     * */
    EvaluacionBuilder(Evaluacion evaluacion) {
        init(evaluacion);
        conocimientoEvaluador();
        calificar();
        veredictoEvaluador();
        comentariosEvaluador();
    }

    /**
     * @brief Iniciar la construcción recibiendo la evaluación a ser construida
     */
    public EvaluacionBuilder init(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
        return this;
    }
    /**
     * @brief Metodo para definir el conocimiento que tiene el evaluador con respecto a un Paper
     */
    public abstract void conocimientoEvaluador();
    /**
     * @brief Metodo para calificar el título y el cuerpo de un Paper
     */
    public abstract void calificar();
    /**
     * @brief Metodo para dar un veredicto del Paper
     */
    public abstract void veredictoEvaluador();
    /**
     * @brief Metodo ingresar comentarios del Evaluador
     */
    public abstract void comentariosEvaluador();

    /**
     * @brief Metodo para recuperar la evaluación
     */
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }
}
