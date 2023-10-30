package Ejercicio5;
// Fig. 12.17: MarcoCasillaVerificacion.java
// JCheckBox buttons and item events.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame {
    private JTextField campoTexto; // displays text in changing font styles
    private JCheckBox negritaJCheckBox; // to select/deselect bold
    private JCheckBox cursivaJCheckBox; // to select/deselect italic

    // CheckBoxFrame constructor adds JCheckBoxes to JFrame

    public MarcoCasillaVerificacion() {
        super("Prueba de JCheckBox");
        setLayout(new FlowLayout());
        // set up JTextField and set its font
        campoTexto = new JTextField("Observe como cambia el estilo de tipo de letra", 20);
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto); // add textField to JFrame
        negritaJCheckBox = new JCheckBox("Negrita");
        cursivaJCheckBox = new JCheckBox("Cursiva");
        add(negritaJCheckBox); // add bold checkbox to JFrame
        add(cursivaJCheckBox); // add italic checkbox to JFrame

        // register listener to handle checkbox events
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }

    // private inner class to handle item events for JCheckBoxes
    private class ManejadorCheckBox implements ItemListener {
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent evento) {
            Font tipoletra = null; // store the new Font

            // determine which CheckBoxes are checked and create Font
            if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (negritaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD, 14);
            else if (cursivaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.ITALIC, 14);
            else
                tipoletra = new Font("Serif", Font.PLAIN, 14);
            campoTexto.setFont(tipoletra);
        }
    }
} // end of class CheckBoxFrame