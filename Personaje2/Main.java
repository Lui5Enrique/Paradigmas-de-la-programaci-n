package Personaje2;

public class Main {
    public static void main(String[] args) {
        // Aqui creamos un objeto de la clase jugador
        jugador jugador1 = new jugador("EzMor", 88, "Tanque");
        System.out.println(jugador1.toString());
        jugador1.gritar();
        jugador1.atacar();
        jugador1.usarHabildadEspecial();
        System.out.println();

        enemigo enemigo1 = new enemigo("Darka", 150, "Mago");
        System.out.println(enemigo1.toString());
        enemigo1.gritar();
        enemigo1.atacar();
        enemigo1.usarHabildadEspecial();
        System.out.println();
    }

}
