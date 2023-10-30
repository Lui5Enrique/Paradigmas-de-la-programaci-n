package Ejercicio14;

// Fig. 12.39: MarcoFlowLayout.java
// FlowLayout allows components to flow over multiple lines.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda; // button to set alignment left
    private final JButton botonJButtonCentro; // button to set alignment center
    private final JButton botonJButtonDerecha; // button to set alignment right
    private final FlowLayout esquema; // layout object
    private final Container contenedor; // container to set layout

    // set up GUI and register button listeners
    public MarcoFlowLayout() {
        super("Demostracion de FlowLayout");
        esquema = new FlowLayout();
        contenedor = getContentPane(); // get container to set layout
        setLayout(esquema);
       // set up leftButton and register listener
        botonJButtonIzquierda = new JButton("Izquierda");
        add(botonJButtonIzquierda); // add Left button to frame
        botonJButtonIzquierda.addActionListener(new ActionListener() {
           // process leftButton event
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.LEFT);
                // realign attached components
                esquema.layoutContainer(contenedor);
            }
        });
        // set up centerButton and register listener
        botonJButtonCentro = new JButton("Centro");
        add(botonJButtonCentro); // add Center button to frame
        botonJButtonCentro.addActionListener(new ActionListener() // process leftButton event
        {
           
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.CENTER);
                // realign attached components
                esquema.layoutContainer(contenedor);
            }
        });

       // set up rightButton and register listener
        botonJButtonDerecha = new JButton("Derecha");
        add(botonJButtonDerecha);// add Right button to frame
        botonJButtonDerecha.addActionListener(new ActionListener() 
        { // process rightButton event
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.RIGHT);
                // realign attached components
                esquema.layoutContainer(contenedor);
            }
        });
    } 
} 