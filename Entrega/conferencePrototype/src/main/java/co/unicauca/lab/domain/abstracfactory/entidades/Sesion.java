package co.unicauca.lab.domain.abstracfactory.entidades;

import co.unicauca.lab.domain.abstracfactory.tipos.TipoSesion;

/**
 * @brief Sesion de una conferencia con nombre y tipo de Sesión
 * */

public class Sesion {
    private String nombre;
    private TipoSesion tipoSecion;


    public Sesion(String nombre, TipoSesion tipoSecion) {
        this();
        this.nombre = nombre;
        this.tipoSecion = tipoSecion;
    }

    public Sesion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSesion getTipoSecion() {
        return tipoSecion;
    }

    public void setTipoSecion(TipoSesion tipoSecion) {
        this.tipoSecion = tipoSecion;
    }
}
