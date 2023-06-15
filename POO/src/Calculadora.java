package Introduccion;
import java.util.Scanner;

public class Calculadora {

    private  Double n1;
    private Double n2;


public Calculadora(){

}

public Calculadora(Double n1, Double n2){
    this.n1=n1;
    this.n2=n2;
}



    public Double sumar(Double n1,Double n2){
        Double suma;
        suma=n1+n2;
        return suma;

    }
    public Double restar(Double n1,Double n2){
        Double resta;
        resta=n1-n2;
        return resta;
    }
    public Double multiplicacion(Double n1,Double n2){
        Double multiplicacion;
        multiplicacion=n1*n2;
        return multiplicacion;
    }
    public Double division(Double n1,Double n2){
        Double division;
        division=n1/n2;
        return division;
    }

}
