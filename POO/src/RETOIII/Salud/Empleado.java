package RETOIII.Salud;
import java.util.Scanner;
public class Empleado extends Persona {
    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String departamento;

public Empleado(){

}
public Empleado(String tipoDoc, int numerodoc, String nombres, String apellidos, String cargo, int valorhora, int horastrabajadas, String departamento){
    this.cargo=cargo;
    this.valorhora=valorhora;
    this.horastrabajadas=horastrabajadas;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public int getValorhora() {
    return valorhora;
}
public void setValorhora(int valorhora) {
    this.valorhora = valorhora;
}
public int getHorastrabajadas() {
    return horastrabajadas;
}
public void setHorastrabajadas(int horastrabajadas) {
    this.horastrabajadas = horastrabajadas;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
public void registrarEmpleado(){
    Scanner capturar=new Scanner(System.in);
    System.out.println("Ingrese el cargo que tiene ");
    cargo=capturar.next();
    System.out.println("Ingrese el valor de hora");
    valorhora=capturar.nextInt();
    System.out.println("Ingrese las horas trabajadas");
    horastrabajadas=capturar.nextInt();
    System.out.println("Ingrese el departamento");
    departamento=capturar.next();
    
   }
public void mostrarEmpleado() {
System.out.println("Su cargo  es: "+cargo);
System.out.println("El valor de hora es: "+ valorhora);
System.out.println("Las horas trabajadas son: "+ horastrabajadas);
System.out.println("El departamento es: "+ departamento);
}

}
