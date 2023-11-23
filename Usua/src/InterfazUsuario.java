import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame {

    private JTextField textId, textNombre, textApellido, textCorreo, textContrasena;
    private UsuarioDAOMySQL usuarioDAO;

    public InterfazUsuario() {
        usuarioDAO = new UsuarioDAOMySQL();

        // Interface configuration
        setTitle("Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create dashboard
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        // Create labels
        crearEtiqueta(panel, "ID:", 10, 20);
        crearEtiqueta(panel, "Nombre:", 10, 60);
        crearEtiqueta(panel, "Apellido:", 10, 100);
        crearEtiqueta(panel, "Correo:", 10, 140);
        crearEtiqueta(panel, "Contraseña:", 10, 180);

        // Create text boxes
        textId = crearCajaTexto(panel, 100, 20);
        textNombre = crearCajaTexto(panel, 100, 60);
        textApellido = crearCajaTexto(panel, 100, 100);
        textCorreo = crearCajaTexto(panel, 100, 140);
        textContrasena = crearCajaTexto(panel, 100, 180);

        // Create buttons
        crearBoton(panel, "Insertar", 250, 20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarUsuario();
            }
        });

        crearBoton(panel, "Seleccionar", 250, 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarUsuario();
            }
        });

        crearBoton(panel, "Actualizar", 250, 100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarUsuario();
            }
        });

        crearBoton(panel, "Eliminar", 250, 140, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
            }
        });
    }

    private void crearEtiqueta(JPanel panel, String texto, int x, int y) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, 80, 25);
        panel.add(etiqueta);
    }

    private JTextField crearCajaTexto(JPanel panel, int x, int y) {
        JTextField textField = new JTextField(20);
        textField.setBounds(x, y, 120, 25);
        panel.add(textField);
        return textField;
    }

    private void crearBoton(JPanel panel, String texto, int x, int y, ActionListener actionListener) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, 100, 25);
        boton.addActionListener(actionListener);
        panel.add(boton);
    }

    private void insertarUsuario() {
        // Get the values ​​of the text boxes and perform the insertion
        usuarioDAO.id = textId.getText();
        usuarioDAO.nom = textNombre.getText();
        usuarioDAO.ap = textApellido.getText();
        usuarioDAO.correo = textCorreo.getText();
        usuarioDAO.con = textContrasena.getText();

        usuarioDAO.insertar();

        // Clear fields after insertion
        limpiarCampos();
    }

    private void seleccionarUsuario() {
       // Get the ID of the text box and make the selection
        usuarioDAO.id = textId.getText();
        usuarioDAO.selecreg();

        // Show selected data in text boxes
        textNombre.setText(usuarioDAO.nom);
        textApellido.setText(usuarioDAO.ap);
        textCorreo.setText(usuarioDAO.correo);
        textContrasena.setText(usuarioDAO.con);
    }

    private void actualizarUsuario() {
        // Get the values ​​of the text boxes and perform the update
        usuarioDAO.id = textId.getText();
        usuarioDAO.nom = textNombre.getText();
        usuarioDAO.ap = textApellido.getText();
        usuarioDAO.correo = textCorreo.getText();
        usuarioDAO.con = textContrasena.getText();

        usuarioDAO.actreg();

        // Clear fields after update
        limpiarCampos();
    }

    private void eliminarUsuario() {
        // Get the ID of the text box and perform the deletion
        usuarioDAO.id = textId.getText();
        usuarioDAO.elimreg();

        // Clear fields after deletion
        limpiarCampos();
    }

    private void limpiarCampos() {
        textId.setText("");
        textNombre.setText("");
        textApellido.setText("");
        textCorreo.setText("");
        textContrasena.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }
}