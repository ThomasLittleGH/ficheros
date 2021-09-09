import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa principal que permita el almacenamiento, escritura y lectura de archivos de texto. Esta class permite conectar las distintas clases y sirve como menu.
        // @author Thomas Little
        // Definicion de variables
        Scanner input = new Scanner(System.in);
        String opcion = "0";
        do {
            opcion = "0";
            System.out.println("*** Menu ***");
            System.out.println("1) Ingresar datos \n2) Visualisar datos \n0) Salir");
            opcion = input.nextLine();
            
            switch (opcion) {
                case "0":
                    break;
                case "1":
                    guardarDatos();
                    break;
                case "2":
                    leerDatos();
                    break;
                default: // Si el usuario no ingresa un dato valido el programa le avisa
                    System.out.println("Error 01 - seleccione un numero valido");
                    break;
            }
        } while (opcion != "0");
        
        input.close();
    }
    public static void guardarDatos(){
        // Definicion de datos
        escritura i = new escritura();
        i.escribir("datos.txt");
    }
    public static void leerDatos(){
        // Definicion de datos
        lectura j = new lectura();
        j.leer("datos.txt");
    }
}
