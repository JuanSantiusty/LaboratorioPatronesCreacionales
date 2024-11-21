package co.unicauca.paper.domain.entidades;

import java.util.List;

public class Evaluador {
    private String name;
    private List<Temas> temasEvaluador;

    public Evaluador() {}

    public Evaluador(String name, List<Temas> temasEvaluador) {
        this.name = name;
        this.temasEvaluador = temasEvaluador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Temas> getTemasEvaluador() {
        return temasEvaluador;
    }

    public void setTemasEvaluador(List<Temas> temasEvaluador) {
        this.temasEvaluador = temasEvaluador;
    }

    @Override
    public String toString() {
        return "Evaluador{" +
                "name='" + name + '\'' +
                ", temasEvaluador=" + temasEvaluador +
                '}';
    }
}
