package Ejercicio7;
// Fig. 12.21: MarcoCuadroCombinado.java
// Objeto JComboBox que muestra una lista de nombres de imágenes.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame {
    private final JComboBox<String> imagenesJComboBox; // contiene los nombres de los iconos
    private final JLabel etiqueta; // muestra el icono seleccionado
    private static final String nombres[] = { "insecto1.gif", "insecto2.gif", "insecto3.gif", "insecto4.gif" };
    private final Icon[] iconos = {
        new ImageIcon(getClass().getResource("insecto1.gif")),
        new ImageIcon(getClass().getResource("insecto2.gif")),
        new ImageIcon(getClass().getResource("insecto3.gif")),
        new ImageIcon(getClass().getResource("insecto4.gif"))};



    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public MarcoCuadroCombinado() {
        super("Prueba de JComboBox");
        setLayout(new FlowLayout()); // establece el esquema del marco
        imagenesJComboBox = new JComboBox<String>(nombres); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // muestra tres filas
        imagenesJComboBox.addItemListener(
                new ItemListener() // clase interna anónima
                {// maneja evento de JComboBox
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        // determina si está seleccionado el elemento
                        if (evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                    }
                } // fin de la clase interna anónima
        ); // fin de la llamada a addItemListener

        add(imagenesJComboBox); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]); // muestra el primer icono
        add(etiqueta); // agrega etiqueta a JFrame
    }
} // fin de la clase MarcoCuadroCombinado