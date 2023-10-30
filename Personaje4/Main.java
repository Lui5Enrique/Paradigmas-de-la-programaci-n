package Personaje4;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("EzMOR", 10, "Guerrero");
        Enemigo enemigo = new Enemigo("Yasuo", 8, "Monstruo");

        PersonajeInterface<Jugador> jugadorInterface = new PersonajeGenerico<>();
        PersonajeInterface<Enemigo> enemigoInterface = new PersonajeGenerico<>();

        System.out.println("Información del Jugador:");
        jugadorInterface.mostrarInformacion(jugador);
        jugadorInterface.realizarAcciones(jugador);

        System.out.println("\nInformación del Enemigo:");
        enemigoInterface.mostrarInformacion(enemigo);
        enemigoInterface.realizarAcciones(enemigo);
    }
}