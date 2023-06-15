package RETOV;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelyTijera implements juego {
    //ATRIBUTOS 
    private int eleccion;
    private int opcion;
    private String jugador;

    //METODO CONSTRUCTOR VACIO
    public PiedraPapelyTijera(){

    }

        //METODO CONSTRUCTOR CON PARAMETROS
    public PiedraPapelyTijera(int eleccion, int opcion, String jugador) {
        this.eleccion = eleccion;
        this.opcion = opcion;
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
            System.out.println(jugador+ "Realice su eleccion 1. Piedra 2.Papel 3.Tijera");
            eleccion=capturar.nextInt();
            Random aleatorio=new Random();
            opcion=aleatorio.nextInt(2)+1;
            System.out.println("Empieza el juego");
        }  
        //METODO FINALIZAR
        public void finalizar(){
            
            //CONDICIONALES
        if(opcion==1 && eleccion==2){
            System.out.println("Haz GANADO" +jugador);
        }
        else if(opcion==1 && eleccion==3){
            System.out.println("Haz PERDIDO" +jugador);   
        }
        else if(opcion==1 && eleccion==1){
            System.out.println("Haz EMPATADO" +jugador); 
        }
        else if(opcion==2 && eleccion==1){
            System.out.println("Haz GANADO" +jugador);  
        }
        else if(opcion==2 && eleccion==3){
            System.out.println("Haz PERDIDO" +jugador);   
        }
        else if(opcion==2 && eleccion==2){
            System.out.println("Haz EMPATADO" +jugador); 
        }
        else if(opcion==3 && eleccion==1){
            System.out.println("Haz GANADO" +jugador);  
        }
        else if(opcion==3 && eleccion==2){
            System.out.println("Haz PERDIDO" +jugador);    
        }
        else if(opcion==3 && eleccion==3){
            System.out.println("Haz EMPATADO" +jugador);    
        }
    }
}
