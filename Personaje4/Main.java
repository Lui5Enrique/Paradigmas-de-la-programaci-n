package Personaje4;

public class Main {
    public static void main(String[] args) {
        // Aqui creamos un objeto de la clase jugador
        Jugador jugador1 = new Jugador("EzMor", 7, "Tanque");
        System.out.println("Recuperaste " + jugador1.recuperacion() + " puntos de vida");
        jugador1.manipularTiempo();
        jugador1.desarrollar();

        Enemigo enemigo1 = new Enemigo("Darka", 6, "Mago");
        System.out.println("El enemigo se regenero " + enemigo1.recuperacion() + " puntos de vida");
        enemigo1.hechiceria();

    }
}
