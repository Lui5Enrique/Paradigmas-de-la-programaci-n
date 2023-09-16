package Personaje3;

public class Main {
    public static void main(String[] args) {
        // Aqui creamos un objeto de la clase jugador
        Jugador jugador1 = new Jugador("EzMor", 4, "Tanque");
        System.out.println(jugador1.toString());
        jugador1.gritar();
        jugador1.atacar();
        jugador1.usarHabilidadEspecial();
        System.out.println();

        Enemigo enemigo1 = new Enemigo("Darka", 6, "Mago");
        System.out.println(enemigo1.toString());
        enemigo1.gritar();
        enemigo1.atacar();
        enemigo1.usarHabilidadEspecial();
        System.out.println();

    }
}
