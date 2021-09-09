import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class lectura {
    //  Clase que permite la lectura del fichero previamente creado
    // @author Thomas Little
    public void leer(String nombreArchivo) {
        try {
            // clase file permite preguntar por valores del fichero externo
            File archivo = new File(nombreArchivo);
            // Si el archivo no existe o esta vacio manda error y detiene el codigo
            if (archivo.exists() & archivo.length() > 0) {
                // Se genera el objeto logico con la relacion al objeto fisico
                FileReader fr = new FileReader(nombreArchivo);
                BufferedReader archivoLectura = new BufferedReader(fr);
                archivoLectura.read();

                String linea = null;
                System.out.println("Los valores son: (codigo / nombre / fono)");

                //traspaso a la variable linea de la lectura de la primera linea del fichero
                while ((linea = archivoLectura.readLine()) != null) {
                    // Clase que permite reconocer el caracter que se utiliza de separador
                    StringTokenizer token = new StringTokenizer(linea, ",");

                    // traspasa hasta antes de la coma el caracter o string especificado
                    String codigo = token.nextToken().trim(),
                           nombre = token.nextToken().trim(),
                           fono = token.nextToken().trim();

                    // impresion de los datos del archivo
                    System.out.println("================================================");
                    System.out.println(" > Codigo: " + codigo + "\n > Nombre: " + nombre + "\n > Fono: " + fono);
                }
                archivoLectura.close();
            } else {
                System.out.println("Error 03 - el archivo no existe o no contiene datos");
            }
        } catch (Exception e) {
            System.out.println("Error 04 - el archivo no pudo ser leido");
        }
    }       
}
    
