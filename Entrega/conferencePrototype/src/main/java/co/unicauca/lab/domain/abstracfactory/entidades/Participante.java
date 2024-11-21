package co.unicauca.lab.domain.abstracfactory.entidades;

import co.unicauca.lab.domain.abstracfactory.tipos.TipoParticipante;

/**
 * @brief Participante de una conferencia con nombre y tipo de Participante
 *
 * */

public class Participante {
    private String nombre;
    private TipoParticipante tipo;

    public Participante(String nombre, TipoParticipante tipo) {
        this();
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Participante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoParticipante getTipo() {
        return tipo;
    }

    public void setTipo(TipoParticipante tipo) {
        this.tipo = tipo;
    }
}
