package Ejercicio15;

// Fig. 12.41: MarcoBorderLayout.java
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoBorderLayout extends JFrame implements ActionListener {
    private final JButton botones[]; // array of buttons to hide portions
    private static final String nombres[] = { "Ocultar Norte", "Ocultar Sur", "Ocultar Este", "Ocultar Oeste",
            "Ocultar Centro" };
    private final BorderLayout esquema;

    // set up GUI and event handling
    public MarcoBorderLayout() {
        super("Demostracion de BorderLayout");
        esquema = new BorderLayout(5, 5); 
        setLayout(esquema);
        botones = new JButton[nombres.length];

       // create JButtons and register listeners for them
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }

    // handle button events
    @Override
    public void actionPerformed(ActionEvent evento) {
        // check event source and lay out content pane accordingly
        for (JButton boton : botones) {
            if (evento.getSource() == boton)
                boton.setVisible(false); // hide pressed button
            else
                boton.setVisible(true); // show other buttons
        }
        esquema.layoutContainer(getContentPane());// layout content pane
    }
} // fin de la clase MarcoBorderLayout