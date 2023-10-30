package Ejercicio10;

// Fig. 12.28: MarcoRastreadorRaton.java
// Demonstrating mouse events.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelRaton; // panel en el que ocurrirán los eventos de ratón
    private final JLabel barraEstado; 

   
    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");
        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // add panel to JFrame
        barraEstado = new JLabel("Raton fuera de JPanel");
        add(barraEstado, BorderLayout.SOUTH); // add label to JFrame

       // create and register listener for mouse and mouse motion events
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }
// inner class to handle mouse events
    private class ManejadorRaton implements MouseListener, MouseMotionListener {

         // MouseListener event handlers
        // handle event when mouse released immediately after press
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Se hizo clic en [%d, %d]", evento.getX(), evento.getY()));
        }

        // handle event when mouse pressed
        @Override
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Se oprimio en [%d, %d]", evento.getX(), evento.getY()));
        }

       // handle event when mouse released
        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Se solto en [%d, %d]", evento.getX(), evento.getY()));
        }

        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Raton entro en [%d, %d]", evento.getX(), evento.getY()));
            panelRaton.setBackground(Color.GREEN);
        }

        // handle event when mouse exits area
        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Raton fuera de JPanel");
            panelRaton.setBackground(Color.WHITE);
        }

        // MouseMotionListener event handlers
        // handle event when user drags mouse with button pressed
        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastro en [%d, %d]", evento.getX(), evento.getY()));
        }

       // handle event when user moves mouse
        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Se movio en [%d, %d]", evento.getX(), evento.getY()));
        }
    } 
}