package Personaje4;
interface HabilidadesMagicas {
    void manipularTiempo();
    void hechiceria();
    double recuperacion();
}

interface HabilidadesFisicas {
    void mejorar();
    void desarrollar();
    double aumentoNivel();
}

// Generic interface for displaying information and performing actions
interface PersonajeInterface<T extends Personajes> {
    void mostrarInformacion(T personaje); // Method to display character information
    void realizarAcciones(T personaje); // Method to perform character actions
}

// Implementation of the generic interface
class PersonajeGenerico<T extends Personajes> implements PersonajeInterface<T> {
    @Override
    public void mostrarInformacion(T personaje) {
        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Nivel: " + personaje.getNivel());
        System.out.println("Tipo: " + personaje.getClass().getSimpleName());
    }

    @Override
    public void realizarAcciones(T personaje) {
        System.out.println("\nControl de personaje:");
        System.out.print("Accion: ");
        personaje.gritar();
        System.out.print("Accion: ");
        personaje.atacar();
        System.out.print("Usas: ");
        personaje.usarHabilidadEspecial();
        System.out.println("Recuperación: " + personaje.recuperacion());
        System.out.print("Realizas: ");
        personaje.manipularTiempo();
        System.out.print("Lanzas: ");
        personaje.hechiceria();
        System.out.print("haz obtenido: ");
        personaje.mejorar();
        System.out.println("Aumento de nivel: " + personaje.aumentoNivel());
        personaje.desarrollar();
    }
}

// Abstract class for Characters
abstract class Personajes implements HabilidadesFisicas, HabilidadesMagicas {
    private String nombre;
    private int nivel;

    public Personajes(String nombre, int nivel) {
        this.nombre = nombre;
        if (nivel <= 1) {
            throw new IllegalArgumentException("El nivel debe ser mayor que 1.");
        }
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void gritar() {
        System.out.println("¡Grita!");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Nivel: " + nivel;
    }

    public abstract void atacar();
    public abstract void usarHabilidadEspecial();
    public abstract void manipularTiempo();
    public abstract void hechiceria();
    public abstract void mejorar();
    public abstract void desarrollar();
}

// Player class extending Characters and implementing interfaces
class Jugador extends Personajes {
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public void atacar() {
        System.out.println("Atacar al enemigo");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Campo Antigravedad");
    }

    @Override
    public double recuperacion() {
        return 100;
    }

    @Override
    public void manipularTiempo() {
        System.out.println("Tiempo relentizado por 10 segundos");
    }

    @Override
    public void hechiceria() {
        System.out.println("bola de fuego");
    }

    @Override
    public void mejorar() {
        System.out.println("+10 de fuerza");
    }

    @Override
    public double aumentoNivel() {
        return 5;
    }

    @Override
    public void desarrollar() {
        System.out.println("Desarrollas una mejor destreza");
    }
}

// Enemy class extending Characters and implementing interfaces
class Enemigo extends Personajes {
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void atacar() {
        System.out.println("Matar al jugador");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Levitación");
    }

    @Override
    public double recuperacion() {
        return 150;
    }

    @Override
    public void manipularTiempo() {
        System.out.println("Congelacion de tiempo");
    }

    @Override
    public void hechiceria() {
        System.out.println("baba corrosiva");
    }

    @Override
    public void mejorar() {
        System.out.println("Mejora en la capacidad de almacenamiento");
    }

    @Override
    public double aumentoNivel() {
        return 10;
    }

    @Override
    public void desarrollar() {
        System.out.println("Obtienes: Sigilo");
    }
}