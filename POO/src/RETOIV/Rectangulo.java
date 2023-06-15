package RETOIV;
import java.util.Scanner;

public class Rectangulo {
    
        //ATRIBUTOS
        private double lado;
        private double ancho;
    
        //METODO CONSTRUCTOR VACIO
        public Rectangulo(){

    }
        //METODO CONSTRUCTOR CON PARAMETROS
        public Rectangulo(double lado, double ancho) {
        super();
        this.lado = lado;
        this.ancho = ancho;
    }
        //METODO SOLICITAR DATOS RECTANGULO
        public void solictarDatosRectangulo(){

            //INSTANCIAR CLASE SCANNER
            Scanner capturar=new Scanner(System.in);
            System.out.println("Ingrese los lados del  rectangulo");
            lado=capturar.nextDouble();
            System.out.println("Ingrese el ancho del rectangulo");
            ancho=capturar.nextDouble();
        }
        //METODO CALCULAR AREA
        public void calcularArea(){
           Double area;
            area=(lado*ancho);

            System.out.println("El area del Rectangulo es "+area);
        }
}
