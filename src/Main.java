import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.AlquilerService;
import Servicios.PeliculaService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PeliculaService ps=new PeliculaService();
        //Pelicula p1=ps.crearPelicula();
        //Pelicula p2=ps.crearPelicula();

        AlquilerService as=new AlquilerService();
        Alquiler a1=as.crearAlquiler();

        as.rellenarArregloAlquiler(a1);

        as.listarAlquileres();




        //ps.rellenarArregloPeliculas(p1);
        //ps.rellenarArregloPeliculas(p2);

        ps.peliculasDisponibles();
    }
}