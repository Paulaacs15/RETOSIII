package RETOIV;

import java.util.Scanner;

public class Ejecucion {
    
    public static void main(String[] args) {

       //INSTANCIAR CLASE SCANNER}
       Scanner capturar=new Scanner(System.in); 

       //VARIABALE 
       int iteraciones=0;
       int eleccion;
       int opcion;

       //CICLOS
       do{
        System.err.println("Que figura desea calcular 1.Triangulo, 2.Rectangulo, 3.Pentagono, 4.Circulo");
        eleccion=capturar.nextInt();
            if(eleccion ==1){
                Triangulo tri=new Triangulo();
                tri.solicitarDatosTriangulo();
                tri.calcularArea();
            }
            if(eleccion==2){
                Rectangulo rec=new Rectangulo();
                rec.solictarDatosRectangulo();
                rec.calcularArea();
            }
            else if(eleccion==3){
                Pentagono pen=new Pentagono();
                pen.solicitarDatosPentagono();
                pen.calcularArea();

            }else{
                Circulo cir=new Circulo();
                cir.solicitarDatosCirculo();
                cir.calcularArea();
            }
            iteraciones=iteraciones+1;
            System.out.println("¿Desea calcular otra area? 1.Si, 2.No");
            opcion=capturar.nextInt();
        } 
        while(opcion==1);
            System.out.println("Usted calculo un total "+iteraciones);
        }

       }
    

