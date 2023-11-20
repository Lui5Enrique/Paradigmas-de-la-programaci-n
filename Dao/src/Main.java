import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Name of the text file to save student data
        String nombreArchivo = "alumnos.txt";
        AlumnoDao alumnoDao = new AlumnoDaoImp();
        int opcion;
        Scanner consola = new Scanner(System.in);

        do {
            System.out.println("-------------------");
            System.out.println("Menu de operaciones");
            System.out.println("1.- Agregar un Alumno.");
            System.out.println("2.- Buscar un Alumno.");
            System.out.println("3.- Actualizar Alumno.");
            System.out.println("4.- Borrar Alumno.");
            System.out.println("5.- Mostrar Alumnos");
            System.out.println("6.- Salir");
            System.out.println("Elige tu opcion:");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    ingresarAlumno(alumnoDao, consola);
                    guardarAlumnosEnArchivo(alumnoDao, nombreArchivo);
                    break;
                case 2:
                    buscarAlumno(alumnoDao, consola);
                    break;
                case 3:
                    actualizarAlumno(alumnoDao, consola);
                    break;
                case 4:
                    borrarAlumno(alumnoDao, consola);
                    break;
                case 5:
                    mostrarAlumnos(alumnoDao);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 6);
    }

    private static void ingresarAlumno(AlumnoDao alumnoDao, Scanner consola) {
        int noCuenta;
        String nombre, apellido, situacionAcademica;
        double altura;

        System.out.print("Ingresa el número de cuenta: ");
        noCuenta = consola.nextInt();
        consola.nextLine();

        System.out.print("Ingresa el nombre: ");
        nombre = consola.nextLine();

        System.out.print("Ingresa el apellido: ");
        apellido = consola.nextLine();

        System.out.print("Ingresa la altura: ");
        altura = consola.nextDouble();
        consola.nextLine();

        System.out.print("Ingrese la situación academica (REGULAR , IRREGULAR O BAJA): ");
        situacionAcademica = consola.nextLine();
        SituacionAcademica situacion = SituacionAcademica.valueOf(situacionAcademica.toUpperCase());

        Alumno alumno1 = new Alumno(noCuenta, nombre, apellido, altura, situacion);
        try {
            alumnoDao.insert(alumno1);
            System.out.println("Alumno insertado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al insertar el alumno: " + e.getMessage());
        }
    }

    private static void buscarAlumno(AlumnoDao alumnoDao, Scanner consola) {
        int noCuenta;
        System.out.println("Alumno a buscar");
        System.out.println("Introduce el número de cuenta:");
        noCuenta = consola.nextInt();
        System.out.println();

        try {
            Alumno alumnoBuscado = alumnoDao.get(noCuenta);
            if (alumnoBuscado != null) {
                System.out.println("Alumno encontrado:\n" + alumnoBuscado);
            } else {
                System.out.println("No se encontró ningún alumno");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el alumno " + e.getMessage());
        }
    }

    private static void actualizarAlumno(AlumnoDao alumnoDao, Scanner consola) {
        int noCuentaActualizacion;
        System.out.print("Ingresar el número de cuenta del alumno: ");
        noCuentaActualizacion = consola.nextInt();
        consola.nextLine();

        try {
            Alumno actualizarAl = alumnoDao.get(noCuentaActualizacion);
            if (actualizarAl != null) {
                System.out.println("Alumno " + actualizarAl);

                String nombre, apellido, situacionAcademica;
                double altura;

                System.out.println("Actualización de datos");
                System.out.print("Ingrese el nombre: ");
                nombre = consola.nextLine();

                System.out.print("Ingrese el apellido:");
                apellido = consola.nextLine();

                System.out.print("Ingrese la altura:");
                altura = consola.nextDouble();
                consola.nextLine();

                System.out.print("Ingrese la situación academica (REGULAR , IRREGULAR O BAJA): ");
                situacionAcademica = consola.nextLine();
                SituacionAcademica situacionAcademica1 = SituacionAcademica.valueOf(situacionAcademica.toUpperCase());

                // Update student information
                actualizarAl.setNombre(nombre);
                actualizarAl.setApellido(apellido);
                actualizarAl.setAltura(altura);
                actualizarAl.setSituacionAcademica(situacionAcademica1);
                // Update the student in the database
                int resultadoActualizacion = alumnoDao.update(actualizarAl);
                System.out.println("Resultado de la actualización: " + resultadoActualizacion);
                System.out.println("Alumno después de la actualización: " + actualizarAl);

            } else {
                System.out.println("No se encontro el alumno");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar " + e.getMessage());
        }
    }

    private static void borrarAlumno(AlumnoDao alumnoDao, Scanner consola) {
        System.out.println("Eliminar alumno");
        System.out.println("Número de cuenta del alumno a eliminar:");
        int noCuenta = consola.nextInt();

        try {
            Alumno alumnoAEliminar = alumnoDao.get(noCuenta);

            if (alumnoAEliminar != null) {
                System.out.println("Estás seguro de eliminar este alumno? (Si/No)");
                String opcion = consola.next().toLowerCase();

                if (opcion.equals("si")) {
                    int eliminar = alumnoDao.delete(alumnoAEliminar);
                    System.out.println("Alumno eliminado con éxito. Registros afectados: " + eliminar);
                } else {
                    System.out.println("Operación cancelada. No se eliminó el alumno.");
                }
            } else {
                System.out.println("No se encontró el alumno con el número de cuenta proporcionado.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar al alumno: " + e.getMessage());
        }
    }

    private static void mostrarAlumnos(AlumnoDao alumnoDao) {
        try {
            List<Alumno> alumnos = alumnoDao.getAll();

            if (!alumnos.isEmpty()) {
                System.out.println("Listado de Alumnos:");
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                }
            } else {
                System.out.println("No hay alumnos registrados.");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la lista de alumnos: " + e.getMessage());
        }
    }

    private static void guardarAlumnosEnArchivo(AlumnoDao alumnoDao, String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            List<Alumno> alumnos = alumnoDao.getAll();

            for (Alumno alumno : alumnos) {
                String linea = String.format("%d,%s,%s,%.2f,%s",
                        alumno.getNoCuenta(), alumno.getNombre(), alumno.getApellido(),
                        alumno.getAltura(), alumno.getSituacionAcademica());
                writer.println(linea);
            }

            System.out.println("Datos guardados en el archivo.");
        } catch (IOException | SQLException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

}