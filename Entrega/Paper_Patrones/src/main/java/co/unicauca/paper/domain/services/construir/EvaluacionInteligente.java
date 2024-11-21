package co.unicauca.paper.domain.services.construir;

import co.unicauca.paper.domain.entidades.Evaluacion;
import co.unicauca.paper.domain.entidades.Temas;

import javax.swing.*;

public class EvaluacionInteligente extends EvaluacionBuilder{



    public EvaluacionInteligente(Evaluacion evaluacion) {
        super(evaluacion);
    }

    /**
     * @brief Se comparan las listas de Temas que tiene el Paper y el evaluador y se aprueba la evaluación si al menos tienen un tema en común
     */
    @Override
    public void conocimientoEvaluador() {
        int temasComun=0;
        for(Temas t : evaluacion.getPaper().getTemasPaper()){
            for(Temas t1: evaluacion.getEvaluador().getTemasEvaluador()){
                if(t==t1){
                    temasComun++;
                }
            }
        }
        if(temasComun>0){
            evaluacion.setEvaluadorAprobado(true);
        }else{
            evaluacion.setEvaluadorAprobado(false);
        }
    }
    /**
     * @brief Se comprueba si la evaluación fue aprobada y pregunta si desea calificar el Paper, ya que es opcional
     * después pide una calificación de 1-5 para el título y el cuerpo del Paper
     */

    @Override
    public void calificar() {
        if(evaluacion.isEvaluadorAprobado()){
            int opcion= JOptionPane.showConfirmDialog(null,"¿ Desea Calificar el Paper ?","Calificar Paper",JOptionPane.YES_NO_OPTION);
            if(opcion==JOptionPane.YES_OPTION){
                String calificarTitulo=JOptionPane.showInputDialog(null, "Calificar titulo Paper 1-10 ");
                String calificarCuerpo=JOptionPane.showInputDialog(null, "Calificar cuerpo Paper 1-10 ");
                evaluacion.setCalificacionTitulo(Integer.parseInt(calificarTitulo));
                evaluacion.setCalificacionCuerpo(Integer.parseInt(calificarCuerpo));
            }else{
                evaluacion.setCalificacionTitulo(0);
                evaluacion.setCalificacionCuerpo(0);
            }
        }else{
            System.out.println("Evaluador no fue aprobado");
        }

    }
    /**
     * @brief Se comprueba si el evaluador fue aprobado y después se pide ingresar un veredicto para la evaluación
     */
    @Override
    public void veredictoEvaluador() {
        if(evaluacion.isEvaluadorAprobado()) {
            String veredicto = JOptionPane.showInputDialog(null, "Ingrese el veredicto del Paper");
            evaluacion.setVeredicto(veredicto);
        }else{
            System.out.println("Evaluador no fue aprobado");
        }
    }
    /**
     * @brief Se comprueba si el evaluador fue aprobado y después se pide ingresar comentarios del evaluador
     */
    @Override
    public void comentariosEvaluador() {
        if(evaluacion.isEvaluadorAprobado()){
            String comentarios=JOptionPane.showInputDialog(null, "Comentarios para el Paper y comite de evaluadores ");
            evaluacion.setComentarios(comentarios);
        }else{
            System.out.println("Evaluador no fue aprobado");
        }
    }
}
