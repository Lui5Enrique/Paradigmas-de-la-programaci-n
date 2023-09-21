package Ejercicio18;
// Fig. 12.48: DemoAreaTexto.java
// Prueba de MarcoAreaTexto. 
import javax.swing.JFrame;

public class DemoAreaTexto {
    public static void main(String[] args) { 
        MarcoAreaTexto marcoAreaTexto = new MarcoAreaTexto(); 
        marcoAreaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoAreaTexto.setSize(425, 200);
        marcoAreaTexto.setVisible(true);
    } 
} // fin de la clase DemoAreaTexto