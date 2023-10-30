package Ejercicio16;

// Fig. 12.43: MarcoGridLayout.java
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener {
    private final JButton[] botones; 
    private static final String[] nombres = { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
    private boolean alternar = true; 
    private Container contenedor; 
    private GridLayout cuadricula1; 
    private GridLayout cuadricula2; 

   // constructor without arguments
    public MarcoGridLayout() {
        super("Demostracion de GridLayout");
        cuadricula1 = new GridLayout(2, 3, 5, 5); 
        cuadricula2 = new GridLayout(3, 2); 
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this); // register listener
            add(botones[cuenta]); // add button to JFrame
        }
    }

    // handle button events by toggling between layouts
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (alternar) // set layout based on alternate
            contenedor.setLayout(cuadricula2);
        else
            contenedor.setLayout(cuadricula1);
        alternar = !alternar;
        contenedor.validate(); // re-layout container
    }
} // fin de la clase MarcoGridLayout