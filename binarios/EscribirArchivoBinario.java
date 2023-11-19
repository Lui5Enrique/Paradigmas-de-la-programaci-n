package binarios;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirArchivoBinario {
    public static void main(String[] args) {
        // Output binary file name
        String nombreArchivo = "archivo.bin";

        try {
           // Create a FileOutputStream object to write to the binary file
            FileOutputStream salida = new FileOutputStream(nombreArchivo);

            // Write values ​​to the binary file
            for (int i = 0; i < 10; i++) {
                salida.write(i); 
                // Write the value of 'i' to the file
            }

            salida.close();
        } catch (IOException e) {
            
            e.printStackTrace(); 
        }
    }
}