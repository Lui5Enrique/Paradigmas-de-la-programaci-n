package Ejercicio12;
// Fig. 12.34: PanelDibujo.java
// Demonstrating mouse clicks and distinguishing between mouse buttons.
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
    // String to display in the statusBar
    private final ArrayList<Point> puntos = new ArrayList<>();
    // set up the GUI and register the mouse event handler

    public PanelDibujo() {
        // handle mouse motion event in the frame
        addMouseMotionListener(new MouseMotionAdapter() {
            // store drag coordinates and repaint
            @Override
            public void mouseDragged(MouseEvent evento) {
                puntos.add(evento.getPoint());
                repaint(); // redraw the JFrame
            }
        });
    }

    // draw ovals in a 4-by-4 bounding box at specified locations in the window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clear the drawing area

        // draw all the points
        for (Point punto : puntos)
            g.fillOval(punto.x, punto.y, 4, 4);
    }
} 