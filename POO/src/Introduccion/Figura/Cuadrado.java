package Introduccion.Figura;

public class Cuadrado {

    //ATRIBUTOS
    private int lado;

    //METODO CONSTRUCTOR VACIO
    public Cuadrado(){}

    //METODO CONSTRUCTOR CON PARAMETROS
    public Cuadrado(int lado){
        super();
        this.lado=lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public void Calcular(){
        float area=lado*lado;
        System.out.println("El valor del lado es: "+lado+"El area es"+area);
    }   
}
