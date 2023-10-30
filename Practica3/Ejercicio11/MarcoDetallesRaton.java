package Ejercicio11;

// Fig. 12.31: MarcoDetallesRaton.java
// Demonstrating mouse clicks and distinguishing between mouse buttons.
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame {
    private String detalles; // String to display in the statusBar
    private final JLabel barraEstado; // JLabel at bottom of window

    // constructor sets String in JFrame title bar and registers
    // mouse event handler
    public MarcoDetallesRaton() {
        super("Clics y botones del raton");
        barraEstado = new JLabel("Haga clic en el raton");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton()); // add handler
    }

   // inner class to handle mouse events
    private class ManejadorClicRaton extends MouseAdapter {
       // handle mouse-click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent evento) {
            detalles = String.format("Se hizo clic %d vez(veces)", evento.getClickCount());
            
            if (evento.isMetaDown()) // number of left clicks 
            detalles += " con el boton derecho del raton";
            else if (evento.isAltDown()) // the button that was clicked
            detalles += " con el boton central del raton";
            else 
            detalles += " con el boton izquierdo del raton";
            barraEstado.setText(detalles); 
        }
    }
} 