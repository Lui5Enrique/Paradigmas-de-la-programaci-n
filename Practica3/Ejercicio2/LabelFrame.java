package Ejercicio2;
// Fig. 12.6: LabelFrame.java
// Jlabel components with text and icons.
import java.awt.FlowLayout; // specifies how components are sorted
import javax.swing.JFrame; // Provides the basic features of a window
import javax.swing.JLabel; // Displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; 

public class LabelFrame extends JFrame {
    private JLabel etiqueta1; // JLabel with text only
    private JLabel etiqueta2; // JLabel built with text and an icon
    private JLabel etiqueta3; // JLabel with additional text and icon
    // LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame() {
        super("Prueba de JLabel");    
        setLayout(new FlowLayout()); // Sets the framework schema
        // J Label constructor with a String argument
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1); // adds tag1 to JFrame
        // JLabel constructor with string, icon, and alignment arguments
        Icon insecto = new ImageIcon(getClass().getResource( "insecto1.png"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2); // adds tag2 to JFrame
        etiqueta3 = new JLabel(); // JLabel constructor without arguments
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto); // adds icon to JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3); // adds tag3 to JFrame
    }
} // end of the LabelFrame class