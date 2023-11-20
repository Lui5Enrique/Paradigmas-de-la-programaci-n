import java.util.List;

public interface AlumnoDao extends DAO<Alumno> {

    void setAlumnos(List<Alumno> alumnos);

    List<Alumno> getAlumnos();
    
}
