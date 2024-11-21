package co.unicauca.paper.adaptadores;

import co.unicauca.paper.domain.entidades.Evaluacion;
import co.unicauca.paper.domain.entidades.Evaluador;
import co.unicauca.paper.domain.entidades.Paper;
import co.unicauca.paper.domain.entidades.Temas;
import co.unicauca.paper.domain.services.ServiciosEvalaucion;
import co.unicauca.paper.domain.services.construir.EvaluacionBuilder;
import co.unicauca.paper.puertos.ServicesEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class ServicePaperPort {
    public static void main(String[] args) {
        List<Temas> listemas1Articulo = new ArrayList<>();
        listemas1Articulo.add(Temas.MATEMATICAS);
        listemas1Articulo.add(Temas.FISICA);
        listemas1Articulo.add(Temas.PEDADOGIA);
        List<Temas> listemas1Evaluador = new ArrayList<>();
        listemas1Evaluador.add(Temas.MATEMATICAS);
        listemas1Evaluador.add(Temas.FISICA);
        listemas1Evaluador.add(Temas.INFORMATICA);
        ServicesEvaluacion evaluacion=new ServiciosEvalaucion();
        Paper paper=evaluacion.crearPaper("Matemáticas Avanzadas","Julio Alvarado","Aplicación de Teoremas fundamentales para problematicas Actuales",listemas1Evaluador);
        Evaluador evaluador=evaluacion.crearEvaluador("Camilo Sanchez",listemas1Evaluador);
        Evaluacion ex=evaluacion.crearEvaluacion(paper,evaluador);
        ex=evaluacion.crear_y_ConstruirEvaluacion("inteligente",ex);
        evaluacion.verEvaluacion(ex);
    }
}
