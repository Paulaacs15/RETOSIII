package RETOIII.Salud.Principal;

import RETOI.Salud.Persona;
import RETOIII.Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        Empleado em=new Empleado();
        em.pedirDatos();
        em.registrarEmpleado();
        em.mostrarPersona();
        em.registrarEmpleado();
    }
}
