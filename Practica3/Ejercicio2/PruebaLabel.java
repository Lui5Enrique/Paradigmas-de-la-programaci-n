package Ejercicio2;
 // Fig. 12.7: PruebaLabel.java
// LabelFrame test.
import javax.swing.JFrame;

public class PruebaLabel {
    public static void main(String[] args) { 
        LabelFrame marcoEtiqueta = new LabelFrame();
        marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoEtiqueta.setSize(260, 180);
        marcoEtiqueta.setVisible(true);
    }
} // end of TestLabel class