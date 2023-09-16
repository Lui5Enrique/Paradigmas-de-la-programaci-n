package Personaje1;
//Ejercicio de herencia
public class Personajes {
    private String nombre;
    private int nivel;

    // Constructor
    public Personajes(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Métodos get y set
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

    // Método que solo imprime "Atacar objetivo"
    public void atacar() {
        System.out.println("(Atacar objetivo)");
    }

    public String toString() {
        return "Nombre: " + nombre + "\nNivel: " + nivel;
    }

}

class jugador extends Personajes {
    private String clase;

    public jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    public void usarHabildadEspecial() {
        System.out.println("(Habilidad definitiva)");
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String toString() {
        return super.toString() + "\nClase: " + clase;
    }

}

class enemigo extends Personajes {
    private String tipo;

    public enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void gritar() {
        System.out.println("AHhhhhhhhhhhhhh");
    }

    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }
}
