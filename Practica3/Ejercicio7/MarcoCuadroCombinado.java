package Ejercicio7;
// Fig. 12.21: MarcoCuadroCombinado.java
// JComboBox that displays a list of image names.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame {
    private final JComboBox<String> imagenesJComboBox; // contains icon names
    private final JLabel etiqueta; // displays selected icon
    private static final String nombres[] = { "insecto1.gif", "insecto2.gif", "insecto3.gif", "insecto4.gif" };
    private final Icon[] iconos = {
        new ImageIcon(getClass().getResource("insecto1.gif")),
        new ImageIcon(getClass().getResource("insecto2.gif")),
        new ImageIcon(getClass().getResource("insecto3.gif")),
        new ImageIcon(getClass().getResource("insecto4.gif"))};

    public MarcoCuadroCombinado() {
        super("Prueba de JComboBox");
        setLayout(new FlowLayout());// set frame layout
        imagenesJComboBox = new JComboBox<String>(nombres); // set up JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // display three rows
        imagenesJComboBox.addItemListener(
                new ItemListener() // anonymous inner class
                { 
                    // handle JComboBox event
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                       // determine whether item selected
                        if (evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                    }
                } 
        ); 

        add(imagenesJComboBox); // add combobox to JFrame
        etiqueta = new JLabel(iconos[0]); // display first icon
        add(etiqueta); // add label to JFrame
    }
} 