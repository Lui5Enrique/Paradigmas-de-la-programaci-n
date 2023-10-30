package Ejercicio3;

// Fig. 12.9: TextFieldFrame.java
// JTextField and JPasswordField components.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1; // text field with fixed size
    private final JTextField campoTexto2; // text field with text
    private final JTextField campoTexto3; // text field with text and size
    private final JPasswordField campoContrasenia; // password field with text

    // TextFieldFrame constructor adds JTextFields to JFrame
    public CampoTextoMarco() {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());
       // construct text field with 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // add textField1 to JFrame
        // construct text field with default text
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2); // add textField2 to JFrame
        // construct text field with default text and 21 columns
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false); // disable editing
        add(campoTexto3); // add textField3 to JFrame
        // construct password field with default text
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia); // add passwordField to JFrame
        // register event handlers
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    }

    // private inner class for event handling
    private class ManejadorCampoTexto implements ActionListener {
       // process text field events
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";

            // user pressed Enter in JTextField textField1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());

            // user pressed Enter in JTextField textField2
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());
            // user pressed Enter in JTextField textField3
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());
           // user pressed Enter in JPasswordField passwordField
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia: %s", evento.getActionCommand());
            // display JTextField's content
            JOptionPane.showMessageDialog(null, cadena);
        }
    }// end of private inner class TextFieldHandler
} // end of class TextFieldFrame