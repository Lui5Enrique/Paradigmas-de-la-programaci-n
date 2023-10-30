package Ejercicio9;

// Fig. 12.25: MarcoSeleccionMultiple.java
// JList that allows multiple selections.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MarcoSeleccionMultiple extends JFrame {
    private final JList<String> listaJListColores; // list to hold color names
    private final JList<String> listaJListCopia; // list to copy color names
    private JButton botonJButtonCopiar; // button to copy selected names
    private static final String[] nombresColores = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde",
            "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };

    public MarcoSeleccionMultiple() {
        super("Listas de seleccion multiple");
        setLayout(new FlowLayout());
        listaJListColores = new JList<String>(nombresColores); // list of color names
        listaJListColores.setVisibleRowCount(5); // show five rows
        listaJListColores.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListColores)); // add list with scrollpane
        botonJButtonCopiar = new JButton("Copiar >>>");
        botonJButtonCopiar.addActionListener(new ActionListener() {

            // handle button event
            @Override
            public void actionPerformed(ActionEvent evento) {

                listaJListCopia.setListData(
                        listaJListColores.getSelectedValuesList().toArray(new String[0]));
            }
        });
        add(botonJButtonCopiar); // add copy button to JFrame
        listaJListCopia = new JList<String>(); // list to hold copied color names
        listaJListCopia.setVisibleRowCount(5); // show 5 rows
        listaJListCopia.setFixedCellWidth(100); // set width
        listaJListCopia.setFixedCellHeight(15); // set height
        listaJListCopia.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListCopia)); /// add list with scrollpane
    }
} 