package binarios;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerArchivoBinario {
    public static void main(String[] args) {
        // Name of the binary file to be read
        String nombreArchivo = "archivo.bin";

        try {
           // Create a FileInputStream object to read the binary file
            FileInputStream entrada = new FileInputStream(nombreArchivo);

            // Variable to store the byte read from the file
            int byteLeido;

            // Read each byte of the file until the end is reached (when read() returns -1)
            while ((byteLeido = entrada.read()) != -1) {
                // Print the byte read to the console
                System.out.print(byteLeido + " ");
            }

            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}