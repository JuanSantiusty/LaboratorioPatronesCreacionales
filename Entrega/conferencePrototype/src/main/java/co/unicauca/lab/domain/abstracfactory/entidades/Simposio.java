package co.unicauca.lab.domain.abstracfactory.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * @brief Conferencia de tipo Simposio que implementa la interfaz InterfazConferencia, tiene título y una lista de sesiones
 * y una lista de participantes
 * */

public class Simposio implements InterfazConferencia{
    private String titulo;
    private List<Participante> participantes;
    private List<Sesion> secciones;

    public Simposio(String titulo) {
        this.titulo = titulo;
        this.participantes = new ArrayList<>();
        this.secciones = new ArrayList<>();
    }

    @Override
    public void setSecion(Sesion secion) {
        this.secciones.add(secion);
    }

    @Override
    public void setParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    @Override
    public List<Sesion> getSecions() {
        return secciones;
    }

    @Override
    public List<Participante> getParticipantes() {
        return participantes;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
