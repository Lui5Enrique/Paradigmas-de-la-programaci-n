package Personaje3;
//Ejercicio de excepciones
public class Personajes {
    private String nombre;
    private int nivel;

    public Personajes(String nombre, int nivel) {
        this.nombre = nombre;
        if (nivel <= 1) {
            throw new IllegalArgumentException("No debe ser nivel 1.");
        }
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void atacar() {
        if (nivel < 5) {
            throw new IllegalArgumentException("El nivel debe ser igual o mayor que 5.");
        }
        System.out.println("(Atacar objetivo)");
    }

    public void usarHabilidadEspecial() {
        System.out.println("Uso habilidad especial");
    }

    public void gritar() {
        System.out.println("Grita");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Nivel: " + nivel;
    }
}

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
    public void gritar() {
        System.out.println("AAAAAAAAaaaaaaa");
    }

    @Override
    public void atacar() {
        if (getNivel() < 5) {
            throw new IllegalArgumentException("El nivel debe ser igual o mayor que 5.");
        }
        System.out.println("Atacar al enemigo");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Campo Antigravedad");
    }

    @Override
    public String toString() {
        return super.toString() + " Clase: " + clase;
    }
}

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
    public void gritar() {
        System.out.println("AHhhhhhhhhhhhhh");
    }

    @Override
    public void atacar() {
        if (getNivel() < 5) {
            throw new IllegalArgumentException("El nivel debe ser igual o mayor que 5.");
        }
        System.out.println("Matar al jugador");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Levitación");
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}
