package Paleta1;

public class Main {
    public static void main(String[] args) {
        paletaAgua p1 = new paletaAgua("Fresa", 10, true);
        p1.informacion();
        p1.cambioPrecio();
        p1.agregarChilito();

        paletaCrema p2 = new paletaCrema("Chocolate", 10, false);
        p2.informacion();
        p2.cambioPrecio();
        p2.AgregarCubierta("Chocolate");
    }
}
