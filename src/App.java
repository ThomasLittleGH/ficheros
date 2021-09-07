import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa principal que permita el almacenamiento, escritura y lectura de archivos de texto. Esta class permite conectar las distintas clases y sirve como menu.
        // @author Thomas Little
        // Definicion de variables
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            
            System.out.println("Lector de textos 2077");
            System.out.println("1) Ingresar datos \n2) Visualisar datos \n0) Salir");
            opcion = input.nextInt();
            input.skip("\n");
            
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    guardarDatos();
                    break;
                case 2:
                    leerDatos();
                    break;
                default: // Si el usuario no ingresa un dato valido el programa le avisa
                    System.out.println("Error 01 - seleccione un numero valido");
                    break;
            }
        } while (opcion != 0);
        
    }
    public static void guardarDatos(){
        // Definicion de datos
        escritura i = new escritura();
        i.escribir("datos.txt");
    }
    public static void leerDatos(){
        // Definicion de datos
        lectura leer = new lectura();
    }
}
