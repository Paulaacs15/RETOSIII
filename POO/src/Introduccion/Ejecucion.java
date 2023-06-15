package Introduccion;
import java.util.Scanner;
import Introduccion.Accesorio;

public class Ejecucion {

    public static void main(String[] args) {

         //VARIABLE
         /* 
        String nombreA;
        
        //INSTANCIAR LA CLASE O CREAR OBJETO
        Accesorio anillo=new Accesorio();

        //INVOCAR UN METODO
        // anillo.registrarAccesorio();
        // anillo.mostrarAccesorio();

        Collar collar=new Collar();
        collar.registrarAccesorio();
        collar.registrarCollar();
        collar.mostrarCollar();




        
        //CONSULTAR GET
        System.out.println(anillo.getNombreAccesorio());

        //ASIGNAR SET SIN SOLICITAR AL USUARIO
        anillo.setNombreAccesorio("Collar");


        //ASIGNAR SET SOLICITANDO EL DATO AL USUARIO
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el nombre del accesorio");
        nombreA=capturar.next();

        anillo.setNombreAccesorio(nombreA);
*/
        //CARA Y SELLO
        //INSTANCIAR CLASE CARA Y SELLO
        Caraysello juego=new Caraysello();

        juego.iniciar();
        juego.jugar();
        juego.finalizar();
    }

}

