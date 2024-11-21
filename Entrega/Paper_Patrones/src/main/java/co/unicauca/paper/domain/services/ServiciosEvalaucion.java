package co.unicauca.paper.domain.services;

import co.unicauca.paper.domain.entidades.Evaluacion;
import co.unicauca.paper.domain.entidades.Evaluador;
import co.unicauca.paper.domain.entidades.Paper;
import co.unicauca.paper.domain.entidades.Temas;
import co.unicauca.paper.domain.services.construir.EvaluacionBuilder;
import co.unicauca.paper.domain.services.construir.EvaluacionInteligente;
import co.unicauca.paper.domain.services.construir.WorkSpace;
import co.unicauca.paper.puertos.ServicesEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class ServiciosEvalaucion implements ServicesEvaluacion {

    @Override
    public Paper crearPaper(String titulo, String author, String cuerpo, List<Temas> temas) {
        return new Paper(titulo, author, cuerpo,temas);
    }

    @Override
    public Evaluacion crearEvaluacion(Paper paper, Evaluador evaluador) {
        return new Evaluacion(paper, evaluador);
    }

    @Override
    public Evaluador crearEvaluador(String nombre, List<Temas> temas) {
        return new Evaluador(nombre, temas);
    }

    @Override
    public Evaluacion crear_y_ConstruirEvaluacion(String tipoEvaluacion, Evaluacion evaluacion) {
        if(tipoEvaluacion.toLowerCase()=="inteligente"){
            EvaluacionBuilder builder=new EvaluacionInteligente(evaluacion);
            return builder.getEvaluacion();
        }
        return null;
    }

    @Override
    public Evaluacion construirEvalaucion(EvaluacionBuilder evaluacionBuilder, Evaluacion evaluacion) {
        WorkSpace workSpace = new WorkSpace();
        workSpace.init(evaluacionBuilder);
        return workSpace.construir(evaluacion);
    }

    @Override
    public void verEvaluacion(Evaluacion evaluacion) {
        System.out.println(evaluacion);
    }
}
