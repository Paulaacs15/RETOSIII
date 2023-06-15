package RETOI.Salud.Principal;

import RETOI.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona per=new Persona();
        per.pedirDatos();
        per.mostrarPersona();
        per.calcularImc();
        per.calcularEdad();
    }
    
}
