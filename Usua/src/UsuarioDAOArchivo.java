import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOArchivo implements UsuarioDAO {

    // Name of the file where user data will be stored
    private static final String ARCHIVO_USUARIOS = "usuarios.dat";

    // Method to create a new user
    @Override
    public void crearUsuario(Usuario usuario) {
        // Get the current list of users from the file
        List<Usuario> usuarios = leerUsuariosDesdeArchivo();

        // Check if the user already exists in the list
        if (!usuarios.contains(usuario)) {
            // Add the new user to the list
            usuarios.add(usuario);
            escribirUsuariosEnArchivo(usuarios);
        } else {
            System.out.println("El usuario ya existe.");
        }
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        // Get the current list of users from the file
        List<Usuario> usuarios = leerUsuariosDesdeArchivo();
        // Iterate over the list to find the user with the given ID
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return leerUsuariosDesdeArchivo();
    }

    @Override
    public void actualizarUsuario(Usuario usuarioActualizado) {
        List<Usuario> usuarios = leerUsuariosDesdeArchivo();
        // Iterate over the list to find and update the user with the same ID
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuarioActualizado.getId()) {
                usuarios.set(i, usuarioActualizado);
                escribirUsuariosEnArchivo(usuarios);
                return;
            }
        }
    }

    @Override
    public void eliminarUsuario(int id) {
        List<Usuario> usuarios = leerUsuariosDesdeArchivo();
        // Remove the user with the given ID from the list
        usuarios.removeIf(usuario -> usuario.getId() == id);
        // Write the updated list of users to the file
        escribirUsuariosEnArchivo(usuarios);
    }

    private List<Usuario> leerUsuariosDesdeArchivo() {
        List<Usuario> usuarios = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_USUARIOS))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions according to your needs (the file may not exist initially)
        }
        // Return the list of users, which may be empty if there is an error reading the
        // file
        return usuarios;
    }

    private void escribirUsuariosEnArchivo(List<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_USUARIOS))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
        }
    }
}
