package RETOIV;

import java.util.Scanner;

public class Circulo {
        //ATRIBUTOS 
        private double radio;

        //METODO CONSTRUCTOR VACIO
        public Circulo(){

        }
        //METODO CONTRUCTOR CON PARAMETROS 

        public Circulo(double radio) {
            super();
            this.radio = radio;
        }
        
        //SOLICTAR DATOS CIRCULO
        public void solicitarDatosCirculo(){

            //INSTANCIAR CLASE SCANNER
            Scanner capturar=new Scanner(System.in);
            System.out.println("Ingrese el radio del circuclo");
            radio=capturar.nextDouble();
        }
        //METODO CALCULAR AREA
        public void calcularArea(){
            Double area;
            area=3.1416*Math.pow(radio,2);

            System.out.println("El area del circulo es "+area);
        }
    
    
}
