package Servicios;

import Entidades.Alquiler;

import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
    private Alquiler[] alquileres=new Alquiler[10];
    private int contadorAlquileres=0;

    public AlquilerService() {
    }

    Scanner sc=new Scanner(System.in);
    public Alquiler crearAlquiler(){
        int diaI;
        int mesI;
        int anioI;
        int diaF;
        int mesF;
        int anioF;
        Date fechaI;
        Date fechaF;
        Alquiler a1=new Alquiler();
        System.out.println("Cual es la pelicula que se va a alquilar?");
        a1.setPeliculaAlquilada(sc.next());
        System.out.println("Ingrese el año del alquiler");
        anioI=sc.nextInt();
        System.out.println("Ingrese el mes del alquiler");
        mesI= sc.nextInt();
        System.out.println("Ingrese el dia del alquiler");
        diaI=sc.nextInt();
        fechaI=new Date((anioI-1900),(mesI-1),diaI);
        a1.setFechaInicio(fechaI);
        System.out.println("Ingrese el año final del alquiler");
        anioF=sc.nextInt();
        System.out.println("Ingrese el mes final del alquiler");
        mesF=sc.nextInt();
        System.out.println("Ingrese el dia final del alquiler");
        diaF=sc.nextInt();
        fechaF=new Date((anioF-1900),(mesF-1),diaF);
        a1.setFechaFin(fechaF);
        System.out.println("ingrese el precio del alquiler");
        a1.setPrecio(sc.nextDouble());
        return a1;
    }
    public void rellenarArregloAlquiler(Alquiler alquiler){
        if(contadorAlquileres<alquileres.length){
            alquileres[contadorAlquileres]=alquiler;
            contadorAlquileres++;
        }else{
            System.out.println("No hay mas alquileres disponibles");
        }
    }
    public void listarAlquileres(){
        for (int i = 0; i < contadorAlquileres; i++) {
            System.out.println(alquileres[i]);
        }
    }
    public void alquilerFecha(Alquiler alquiler){
        Date fecha;
        int dia;
        int mes;
        int anio;
        int contador=0;
        System.out.println("Ingrese el año en la que se alquiló");
        anio=sc.nextInt();
        System.out.println("Ingrese el mes en el que se alquiló");
        mes=sc.nextInt();
        System.out.println("Ingrese el dia en el que se alquiló");
        dia=sc.nextInt();
        fecha=new Date((anio-1900),(mes-1),dia);
        for (int i = 0; i < contadorAlquileres; i++) {
            if(fecha==alquileres[i].getFechaInicio()){
                System.out.println(alquileres[i].toString());
                contador++;
            }
        }
        if(contador==0){
            System.out.println("No hay alquileres en esta fecha");
        }
    }
    


}
