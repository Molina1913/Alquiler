package Servicios;

import Entidades.Pelicula;

import java.util.Scanner;
import java.util.Arrays;

public class PeliculaService {
    private Pelicula[] peliculas=new Pelicula[10];
    private int contadorPeliculas=0;

    public int getContadorPeliculas() {
        return contadorPeliculas;
    }

    public void setContadorPeliculas(int contadorPeliculas) {
        this.contadorPeliculas = contadorPeliculas;
    }

    Scanner sc=new Scanner(System.in).useDelimiter("\n");

    public PeliculaService() {
    }


    public Pelicula crearPelicula(){
        Pelicula p1=new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula");
        p1.setTitulo(sc.next());
        System.out.println("Ingrese el genero al que pertenece");
        p1.setGenero(sc.next());
        System.out.println("Ingrese el año de la pelicula");
        p1.setAnio(sc.next());
        System.out.println("Ingrese la duración");
        p1.setDuracion(sc.next());
        return p1;
    }
    public void rellenarArregloPeliculas(Pelicula pelicula){
        if(contadorPeliculas<peliculas.length){
            peliculas[contadorPeliculas]=pelicula;
            contadorPeliculas++;
        }else{
            System.out.println("No se puede cargar mas peliculas. Capacidad máxima alncazada");
        }
    }
    public void peliculasDisponibles(){
        for (int i = 0; i < contadorPeliculas; i++) {
            System.out.println(peliculas[i]);
        }
    }
    public void buscarTitulo(Pelicula pelicula){
        String titulo;
        boolean existe=false;
        System.out.println("Ingrese un titulo de una pelicula");
        titulo=sc.next();
        for (int i = 0; i < contadorPeliculas; i++) {
            if(titulo==peliculas[i].getTitulo()){
                existe=true;
            }else{
                existe=false;
            }
        }
        if(existe==true){
            System.out.println("La pelicula está disponible");
        }else{
            System.out.println("La pelicula no está disponible");
        }
    }
    public void buscarGenero(Pelicula pelicula){
        String genero;
        boolean existe=false;
        System.out.println("Ingrese un genero de una pelicula");
        genero=sc.next();
        for (int i = 0; i < contadorPeliculas; i++) {
            if(genero==peliculas[i].getGenero()){
                existe=true;
            }else{
                existe=false;
            }
        }
        if(existe==true){
            System.out.println("Hay peliculas de este genero");
        }else{
            System.out.println("No hay peliculas de este genero");
        }
    }
}
