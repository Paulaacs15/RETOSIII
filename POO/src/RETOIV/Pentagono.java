package RETOIV;

import java.util.Scanner;

public class Pentagono {
    //ATRIBUTOS 
    private double perimetro;
    private double apotema;

    //METODO CONSTRUCTOR VACIO
    public Pentagono(){

    }
    //METODO CONTRUCTOR CON PARAMETROS 
    public Pentagono(double perimetro, double apotema) {
        super();
        this.perimetro = perimetro;
        this.apotema = apotema;
    }
    //METODO SOLICITAR DATOS PENTAGONO
    public void solicitarDatosPentagono(){

        //INSTANCIAR CLASE SCANNER
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el perimetro del Pentagono");
        perimetro=capturar.nextDouble();
        System.out.println("Ingrese el apotema del Pentagono");
        apotema=capturar.nextDouble();
    }
    //METODO CALCULAR AREA
    public void calcularArea(){
        Double area;
        area=(perimetro*apotema)/2;
    }
    
}
