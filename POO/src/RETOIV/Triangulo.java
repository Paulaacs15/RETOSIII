package RETOIV;
import java.util.Scanner;

public class Triangulo {
    //ATRIBUTOS
    private double base;
    private double altura;


    //METODO CONSTRUCTOR VACIO
    public Triangulo(){

    }
    //METODO CONSTRUCTOR CON PARAMETROS
    
    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    //METODO SOLICTAR DATOS TRIANGULO
    public void solicitarDatosTriangulo(){

        //INSTANCIAR CLASE SCANNER
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        base=capturar.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura=capturar.nextDouble();
    }
        //METODO CALCULAR AREA
        public void calcularArea(){
            Double area;
            area=(base*altura)/2;

            System.out.println("El area del triangulo es "+area);
        }

    
}
