package Introduccion;

import java.util.Scanner;

import Introduccion.Accesorio;

public class Collar extends Accesorio{

    //ATRIBUTOS
    private int tamaño;
    private String color;
    

    //METODO CONSTRUCTOR VACIO
    
    public Collar(){

    }
    //METODO CONSTRUCTOR CON PARAMETROS
    public Collar(int idAccesorio, String nombreAccesorio, int precio, int tamaño, String color){
        super(idAccesorio, nombreAccesorio, precio);
        this.tamaño=tamaño;
        this.color=color;

    }
    public void registrarCollar(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del collar");
        tamaño=capturar.nextInt();
        System.out.println("Ingrese el color del collar");
        color=capturar.next();
    }   
    public void mostrarCollar(){
        System.out.println("El codigo del Acceosrio es: "+getIdAccesorio());
        System.out.println("El nombre del Accesrio es "+getNombreAccesorio());
        System.out.println("El precio del Accesorio es: "+getPrecio());
        System.out.println("El tamaño del Accesorio es: "+tamaño);
        System.out.println("El color del Acceosrio es: "+color);

    }
}
