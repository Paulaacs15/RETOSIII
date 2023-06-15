package RETOII.Principal;
import RETOII.Salud.*;

public class Inicio {
    public static void main(String[] args) {
        Persona mostrar=new Persona();

        mostrar.pedirDatos();
        Double p=mostrar.solicitarP();
        Double e=mostrar.solicitarE();
        mostrar.mostrarPersona(p, e);
        Double pesoActual=mostrar.calcularImc(p, e);

        if(pesoActual<20){
            System.out.println("El peso esta debajo de lo ideal");

        }else if(pesoActual>20 && pesoActual<25){
            System.out.println("El peso es el ideal");

        }else{
            System.out.println("Esta en sobre peso");
        }
    }
    
}
