package co.unicauca.paper.domain.entidades;

import java.util.List;

public class Paper {
    private String titulo;
    private String autor;
    private String cuerpo;
    private List<Temas> temasPaper;


    public Paper(String titulo, String autor, String cuerpo, List<Temas> temasPaper) {
        this.titulo = titulo;
        this.autor = autor;
        this.cuerpo = cuerpo;
        this.temasPaper = temasPaper;
    }

    public Paper() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public List<Temas> getTemasPaper() {
        return temasPaper;
    }

    public void setTemasPaper(List<Temas> temasPaper) {
        this.temasPaper = temasPaper;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", temasPaper=" + temasPaper +
                '}';
    }
}
