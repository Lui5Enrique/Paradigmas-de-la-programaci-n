package binarios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoTexto {
    public static void main(String[] args) {
        // Output file name
        String nombreArchivo = "archivo_salida.txt";

        try {
            
            // Create a FileWriter to write to the file
            FileWriter archivo = new FileWriter(nombreArchivo);

            // Create a BufferedWriter to improve writing efficiency
            BufferedWriter escritor = new BufferedWriter(archivo);

            // Write to file
            escritor.write("Hola, mundo!"); 
            escritor.newLine(); 
            escritor.write("Estoy aquí de nuevo");

           // Close the BufferedWriter (this also closes the FileWriter implicitly)
            escritor.close();
        } catch (IOException e) {
           // Handle input/output exceptions, such as problems opening or closing the file
            e.printStackTrace();
        }
    }
}