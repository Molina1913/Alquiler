package Entidades;

import java.util.Arrays;

public class Pelicula {
    private String titulo;
    private String genero;
    private String anio;
    private String duracion;


    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, String anio, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula" +
                "titulo='" + titulo ;
    }
}
