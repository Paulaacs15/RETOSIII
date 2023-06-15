package RETOI.Salud;

import java.util.Scanner;

public class Persona {
    //ATRIBUTOS
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    Double peso;
    Double estatura;
    int edad;
    String sexo;

    //METODOS
    public void pedirDatos(){

        //INSTANCIAR CLASE SCANNER
        Scanner capturar=new Scanner(System.in);

        //SOLICITAR DATOS 
        System.out.println("Ingrese el tipo de documento");
        tipoDoc=capturar.next();
        System.out.println("Ingrese el numero de documento");
        documento=capturar.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=capturar.next();
        System.out.println("Ingrese su apellido");
        apellido=capturar.next();
        System.out.println("Ingrese su peso");
        peso=capturar.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=capturar.nextDouble();
        System.out.println("Ingrese su edad");
        edad=capturar.nextInt();
        System.out.println("Ingres su sexo");
        sexo=capturar.next();
    }
    //MOSTRAR PERSONA
    public void mostrarPersona(){

        System.out.println("Su tipo de documento es " +tipoDoc);
        System.out.println("Su documento es " +documento);
        System.out.println("Su nombre es " +nombre);
        System.out.println("Su apellido es " +apellido);
        System.out.println("Su peso es " +peso);
        System.out.println("Su estatura es " +estatura);
        System.out.println("Su edad es " +edad);
        System.out.println("Su sexo es " +sexo);

    }
    //CALCULAR IMC
    public void calcularImc(){
        Double pesoActual;
        pesoActual=Math.pow((peso/estatura),2);

        if(pesoActual<20){
            System.out.println("El peso esta debajo de lo ideal");

        }else if(pesoActual>20 && pesoActual<25){
            System.out.println("El peso es el ideal");

        }else{
            System.out.println("Esta en sobre peso");
        }
    }
    //CACULAR EDAD
    public void calcularEdad(){
        if(edad<18){
            System.out.println("Es menor de edad");
        }
        else if(edad>18){
            System.out.println("Es amyor de edad");
        }
    }
}
