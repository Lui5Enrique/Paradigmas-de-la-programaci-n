package Ejercicio4;

// Fig. 12.15: MarcoBoton.java
// Command buttons and action events.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; // button with text only
    private final JButton botonJButtonElegante; // button with icons

    // ButtonFrame adds JButtons to JFrame
public MarcoBoton()
 {
    
    super("Prueba de botones");
 setLayout(new FlowLayout());
 
 botonJButtonSimple = new JButton("Boton simple"); // button with text
 add(botonJButtonSimple); // add simpleJButton to JFrame

 Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
Icon insecto2 = new ImageIcon(getClass().getResource("insecto3.gif"));
 botonJButtonElegante = new JButton("Boton elegante", insecto1); // set image
 botonJButtonElegante.setRolloverIcon(insecto2); // set rollover image
 add(botonJButtonElegante); // add fancyJButton to JFrame

 // create new ButtonHandler to handle button events
 ManejadorBoton manejador = new ManejadorBoton();
 botonJButtonElegante.addActionListener(manejador);
 botonJButtonSimple.addActionListener(manejador);
 }

    // private inner class for button event handling
    private class ManejadorBoton implements ActionListener {
        // handle button event
 @Override
 public void actionPerformed(ActionEvent evento)
 {
JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
 "Usted oprimio: %s", evento.getActionCommand()));
 }
    }
} // end of class ButtonFrame