package Paleta4;

public class Main {
    public static void main(String[] args) {
        PaletaAgua p1 = new PaletaAgua("Fresa", 2, true);
        p1.informacion();
        p1.cambioPrecio();
        p1.agregar();

        System.out.println("El tamaño de la paleta es: " + p1.tamaño());

        PaletaCrema p2 = new PaletaCrema("Chocolate", 20, true, "Nuez");
        p2.informacion();
        p2.cambioPrecio();
        p2.agregar();

        System.out.println("El tamaño de la paleta es: " + p2.tamaño());

    }

}
