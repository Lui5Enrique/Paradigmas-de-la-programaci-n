package Ejercicio8;

// Fig. 12.23: MarcoLista.java
// JList that displays a list of colors.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class MarcoLista extends JFrame {
    private final JList<String> listaJListColores; // list to display colors
    private static final String[] nombresColores = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde",
            "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
    private static final Color[] colores = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
            Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
            Color.YELLOW };

    // ListFrame constructor adds JScrollPane containing JList to JFrame
    public MarcoLista() {
        super("Prueba de JList");
        setLayout(new FlowLayout());
        listaJListColores = new JList<String>(nombresColores); // list of colorNames
        listaJListColores.setVisibleRowCount(5); // display five rows at once
        // do not allow multiple selections
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(listaJListColores));
        listaJListColores.addListSelectionListener(new ListSelectionListener() {
           
            @Override
            public void valueChanged(ListSelectionEvent evento) {
                getContentPane().setBackground(
                        colores[listaJListColores.getSelectedIndex()]);
            }
        });
    }
} 