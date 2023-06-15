package Introduccion;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements juego{

    //ATRIBUTOS
    private int moneda;
    private int eleccion;
    private String jugador;

    //METODO CONSTRUCTOR VACIO
    public Caraysello(){

    }

    //METODO CONTRUSCTOR CON PARAMETROS
    public Caraysello(int moneda, int elccion, String jugador) {
        this.moneda = moneda;
        this.eleccion = elccion;
        this.jugador = jugador;
    }
    //METODO INICIAR
    public void iniciar(){

        //INSTANCIAR CLASE SCANNER
        Scanner capturar=new Scanner(System.in);

        //SOLICITAR NOMBRE
        System.out.println("Ingrese su nombre");
        jugador=capturar.next();
    }

    //METODO JUGAR 
    public void jugar(){

        //INSTANCIAR CLASE SCANNER
        Scanner capturar=new Scanner(System.in);

        //SOLICITAR ELECCION
        System.out.println(jugador+"Realice su eleccion 1.Cara 2.Sello");
        eleccion=capturar.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("MONEDA GIRANDO");
    }

    //METODO FINALIZAR
    public void finalizar(){

        //CONDICIONALES 
        if(moneda==1 && eleccion==1){
            System.out.println("Cayo Cara, GANASTE" +jugador);
        }
        else if(moneda==2 && eleccion==2){
            System.out.println("Cayo Sello, GANASTE" +jugador);
        }
        else if(moneda==1 && eleccion==2){
            System.out.println("Cayo Cara, PERDISTE" +jugador);
        }
        else if(moneda==2 && eleccion==1){
            System.out.println("Cayo Sello, PERDISTE" +jugador);
  
        }
    }  
}
