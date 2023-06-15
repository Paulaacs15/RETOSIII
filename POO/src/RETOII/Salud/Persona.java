package RETOII.Salud;
import java.util.Scanner;

public class Persona {
    
    //ATRIBUTOS
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    //METODOS
    Scanner capturar=new Scanner(System.in);

    public void pedirDatos(){
        System.out.println("ingrese el tipo de  documento");
        tipoDoc=capturar.next();
        System.out.println("ingrese el numero de documento");
        documento=capturar.nextInt();
        System.out.println("ingrese su nombre");
        nombre=capturar.next();
        System.out.println("ingrese su apellido");
        apellido=capturar.next();
        System.out.println("ingrese su peso");
        edad=capturar.nextInt();
        System.out.println("ingrese su sexo");
        sexo=capturar.next();

    
    }
    public Double solicitarP(){
        Scanner capturar=new Scanner(System.in);

        Double peso;
        System.out.println("ingrese su peso");
        peso=capturar.nextDouble();
        return peso;
    }
    public Double solicitarE(){
        Scanner capturar=new Scanner(System.in);

        Double estatura;
        System.out.println("ingrese su estatura");
        estatura=capturar.nextDouble();
        return estatura;
    }
    public void mostrarPersona(Double peso, Double estatura){

        System.out.println("Su tipo de documento es " +tipoDoc);
        System.out.println("Su documento es " +documento);
        System.out.println("Su nombre es " +nombre);
        System.out.println("Su apellido es " +apellido);
        System.out.println("Su peso es " +peso);
        System.out.println("Su estatura es " +estatura);
        System.out.println("Su edad es " +edad);
        System.out.println("Su sexo es " +sexo);
    }
    public Double calcularImc(Double peso, Double estatura){
    
        Double pesoActual=Math.pow((peso/estatura),2);
        return pesoActual;
        



    }
}
