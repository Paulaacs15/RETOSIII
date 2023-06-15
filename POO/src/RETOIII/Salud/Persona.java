package RETOIII.Salud;

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

    

    
    public Persona(String tipoDoc, int documento, String nombre, String apellido, Double peso, Double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona() {
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
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
