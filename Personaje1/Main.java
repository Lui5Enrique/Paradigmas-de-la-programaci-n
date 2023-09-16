package Personaje1;

public class Main {
    public static void main(String[] args) {
        // Aqui creamos un objeto de la clase jugador
        jugador jugador1 = new jugador("EzMor", 88, "Tanque");
        System.out.println(jugador1.toString());
        // Le indicamos los métodos que nos permite como atacar que es de la clase
        // personajes
        jugador1.atacar();
        // Ademas de indicar el método propio de la clase jugador
        jugador1.usarHabildadEspecial();
        System.out.println();

        // Hacemos lo mismo para la clase enemigo con su propio método
        enemigo enemigo1 = new enemigo("Darka", 150, "Mago");
        System.out.println(enemigo1.toString());
        enemigo1.atacar();
        enemigo1.gritar();
        System.out.println();
    }

}
