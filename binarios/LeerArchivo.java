package binarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        // Name of the file to be read
        String nombreArchivo = "archivo_salida.txt";

        try {
            // Create a FileReader to read the file
            FileReader archivo = new FileReader(nombreArchivo);

           //Create a BufferedReader to improve reading efficiency
            BufferedReader lector = new BufferedReader(archivo);

            // Variable to store each line read from the file
            String linea;

            // Read each line of the file until the end of the file is reached (null)
            while ((linea = lector.readLine()) != null) {
                // Print the line read in the console
                System.out.println(linea);
            }

            // Close the BufferedReader (this also closes the FileReader implicitly)
            lector.close();
        } catch (IOException e) {
            // Handle input/output exceptions, such as problems opening or closing the file
            e.printStackTrace();
        }
    }
}