package Introduccion;

import java.util.Scanner;
public class EjecucionCal {
    public static void main(String[] args) {

        

        Calculadora operacion=new Calculadora();
        Scanner capturar=new Scanner(System.in);

        //solicitar numeros
        System.out.println("ingrese primer numero");
        Double n1=capturar.nextDouble();
        System.out.println("ingrese segundo numero");
        Double n2=capturar.nextDouble();

        operacion.sumar(n1, n2);
        operacion.restar(n1, n2);
        operacion.multiplicacion(n1, n2);
        operacion.division(n1, n2);


    }
}
