import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class escritura {
   // Clase que permite la escritura y almacenamiento de datos en un fichero de texto
   // @author Thomas Little
   public void escribir(String nombreArchivo) {
       try {
            // Definicion de variables
            // Se genera el objeto fisico del archivo con FileWriter y se usa BufferedWriter para trabajar con el fichero en el codigo
            FileWriter fw = new FileWriter(nombreArchivo, true); // true -> usa el fichero ya existente. false -> borra el fichero existente y crea una nuevo
            BufferedWriter archivoEscritura = new BufferedWriter(fw); 
            Scanner input = new Scanner(System.in);
            String codigo, nombre, fono;

            // Ingreso de datos
            System.out.println("Ingrese codigo: ");
            codigo = input.nextLine();
            System.out.println("Ingrese nombre: ");
            nombre = input.nextLine();
            System.out.println("Infrese fono: ");
            fono = input.nextLine();

            // Guardar datos en el fichero (se concatenan las palabras)
            archivoEscritura.write(codigo + ", " + nombre + ", " + fono + System.getProperty("line.separator")); // line separator = \n

            // Cerrar los objetos
            archivoEscritura.close();
        } catch (Exception e) {
           System.out.println("Error 02 - no se puede escribir el archivo");
        }
   } 
}
