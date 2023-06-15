package Introduccion;
import java.util.Scanner;

public class Accesorio {

    //ATRIBUTOS
    private int idAccesorio;
    private String nombreAccesorio;
    private int precio;

    //METODO CONSTRUCTOR VACIO
    public Accesorio(){
        
    }

    //METODO CONSTRUCTOR CON PARAMETROS
    public Accesorio(int idAccesorio, String nombreAccesorio, int precio){
        this.idAccesorio=idAccesorio;
        this.nombreAccesorio=nombreAccesorio;
        this.precio=precio;
    }
    
    //METODOS

    public void registrarAccesorio(){
        Scanner capturar=new Scanner(System.in);

        System.out.println("Ingrese el codigo del Accesorio");
        idAccesorio=capturar.nextInt();
        System.out.println("ingrese el nombre del Accesorio");
        nombreAccesorio=capturar.next();
        System.out.println("ingrese el precio del Accesorio");
        precio=capturar.nextInt();
    }
    
    //METODO
    public void mostrarAccesorio(){
        System.out.println("El codigo del Accesorio es" +idAccesorio);
            System.out.println("El nombre del Accesorio es " +nombreAccesorio);
            System.out.println("El precio del Accesorio es " +precio);

    }

    public int getIdAccesorio() {
        return idAccesorio;
    }

    public void setIdAccesorio(int idAccesorio) {
        this.idAccesorio = idAccesorio;
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
