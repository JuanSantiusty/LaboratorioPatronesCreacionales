package co.unicauca.paper.puertos;

import co.unicauca.paper.domain.entidades.Evaluacion;
import co.unicauca.paper.domain.entidades.Evaluador;
import co.unicauca.paper.domain.entidades.Paper;
import co.unicauca.paper.domain.entidades.Temas;
import co.unicauca.paper.domain.services.construir.EvaluacionBuilder;

import java.util.List;

public interface ServicesEvaluacion {
    Paper crearPaper(String titulo, String author, String cuerpo, List<Temas> temas);
    Evaluacion crearEvaluacion(Paper paper,Evaluador evaluador);
    Evaluador crearEvaluador(String nombre,List<Temas> temas);
    Evaluacion crear_y_ConstruirEvaluacion(String tipoEvaluacion,Evaluacion evaluacion);
    Evaluacion construirEvalaucion(EvaluacionBuilder evaluacionBuilder,Evaluacion evaluacion);
    void verEvaluacion(Evaluacion evaluacion);
}
