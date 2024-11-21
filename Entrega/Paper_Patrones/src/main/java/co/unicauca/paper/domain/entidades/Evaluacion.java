package co.unicauca.paper.domain.entidades;

public class Evaluacion {
    private Paper paper;
    private Evaluador evaluador;
    private int calificacionTitulo;
    private int calificacionCuerpo;
    private String veredicto;
    private String comentarios;
    private boolean evaluadorAprobado;


    public Evaluacion(Paper paper, Evaluador evaluador) {
        this.paper = paper;
        this.evaluador = evaluador;
    }

    public Evaluacion() {
    }

    public Paper getPaper() {
        return paper;
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public int getCalificacionTitulo() {
        return calificacionTitulo;
    }

    public int getCalificacionCuerpo() {
        return calificacionCuerpo;
    }

    public String getVeredicto() {
        return veredicto;
    }

    public String getComentarios() {
        return comentarios;
    }

    public boolean isEvaluadorAprobado() {
        return evaluadorAprobado;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public void setCalificacionTitulo(int calificacionTitulo) {
        this.calificacionTitulo = calificacionTitulo;
    }

    public void setCalificacionCuerpo(int calificacionCuerpo) {
        this.calificacionCuerpo = calificacionCuerpo;
    }

    public void setVeredicto(String veredicto) {
        this.veredicto = veredicto;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setEvaluadorAprobado(boolean evaluadorAprobado) {
        this.evaluadorAprobado = evaluadorAprobado;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "paper=" + paper +
                ", evaluador=" + evaluador +
                ", calificacionTitulo=" + calificacionTitulo +
                ", calificacionCuerpo=" + calificacionCuerpo +
                ", veredicto='" + veredicto + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", evaluadorAprobado=" + evaluadorAprobado +
                '}';
    }
}
