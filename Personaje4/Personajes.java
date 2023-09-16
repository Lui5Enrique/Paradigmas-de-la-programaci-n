package Personaje4;

interface habilidadesMagicas {
    public void manipularTiempo();

    double recuperacion();

    public void hechiceria();
}

interface habilidadesFisicas {
    public void mejorar();

    double aumentoNivel();

    public void desarrollar();

}

abstract class Personajes implements habilidadesMagicas, habilidadesFisicas {
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

    @Override
    public double recuperacion() {
        return 100;
    }

    @Override
    public void manipularTiempo() {
        System.out.println("Has parado el tiempo 10 segundos");
    }

    @Override
    public void hechiceria() {
        System.out.println("Lanzaste una bola de fuego");
    }

    @Override
    public void mejorar() {
        System.out.println("Te pones a hacer rutinas de ejercicio");
    }

    @Override
    public double aumentoNivel() {
        return 5;
    }

    public void desarrollar() {
        System.out.println("Desarrollas una mejor destreza");
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

    @Override
    public double recuperacion() {
        return 150;
    }

    @Override
    public void manipularTiempo() {
        System.out.println("El tiempo se paralizó ");
    }

    @Override
    public void hechiceria() {
        System.out.println("Se lanza baba corrosiva");
    }

    @Override
    public void mejorar() {
        System.out.println("Mejora capacidad de almacenamiento");
    }

    @Override
    public double aumentoNivel() {
        return 10;
    }

    @Override
    public void desarrollar() {
        System.out.println("Sigilo");
    }
}
