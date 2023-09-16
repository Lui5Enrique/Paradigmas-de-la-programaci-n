package Paleta3;

public class Main {
    public static void main(String[] args) {
        PaletaAgua p1 = new PaletaAgua("Fresa", 2, true);
        p1.informacion();
        p1.cambioPrecio();
        p1.agregar();

        PaletaCrema p2 = new PaletaCrema("Chocolate", 20, true, "Nuez");
        p2.informacion();
        p2.cambioPrecio();
        p2.agregar();

    }
}
