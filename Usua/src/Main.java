import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Instantiate the user interface
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazUsuario interfaz = new InterfazUsuario();
                interfaz.setVisible(true);
            }
        });

        // Perform some test operations with both DAO implementations
        pruebaDAOArchivo();
        pruebaDAOMySQL();
    }

    private static void pruebaDAOArchivo() {
        // Create a user for the test
        Usuario usuario1 = new Usuario(1, "Manuel", "Rodriguez", "Manuel@gmail.com", "123");

        // Create an instance of the file DAO
        UsuarioDAO usuarioDAOArchivo = new UsuarioDAOArchivo();

        // Insert the user
        usuarioDAOArchivo.crearUsuario(usuario1);
        System.out.println("Usuario creado con DAO de archivo.");

        // Insert the user
        Usuario usuarioObtenido = usuarioDAOArchivo.obtenerUsuarioPorId(1);
        if (usuarioObtenido != null) {
            System.out.println("Usuario obtenido con DAO de archivo: " + usuarioObtenido.getNombre());
        } else {
            System.out.println("No se pudo obtener el usuario con DAO de archivo.");
        }
    }

    private static void pruebaDAOMySQL() {
        // Create an instance of the MySQL DAO
        UsuarioDAOMySQL usuarioDAOMySQL = new UsuarioDAOMySQL();

        // Set test data
        usuarioDAOMySQL.id = "1";
        usuarioDAOMySQL.nom = "Luis";
        usuarioDAOMySQL.ap = "Enrique";
        usuarioDAOMySQL.correo = "luiscv2enrique@gmail.com";
        usuarioDAOMySQL.con = "Cv2enr";

        usuarioDAOMySQL.insertar();
        System.out.println("Usuario creado con DAO de MySQL.");

        // Get and display the selected user
        usuarioDAOMySQL.id = "1";
        usuarioDAOMySQL.selecreg();
        System.out.println("Usuario obtenido con DAO de MySQL: " +
                usuarioDAOMySQL.nom + " " +
                usuarioDAOMySQL.ap + " " +
                usuarioDAOMySQL.correo + " " +
                usuarioDAOMySQL.con);

        usuarioDAOMySQL.nom = "Luis Updated";
        usuarioDAOMySQL.actreg();
        System.out.println("Usuario actualizado con DAO de MySQL.");

        usuarioDAOMySQL.elimreg();
        System.out.println("Usuario eliminado con DAO de MySQL.");

    }

}
