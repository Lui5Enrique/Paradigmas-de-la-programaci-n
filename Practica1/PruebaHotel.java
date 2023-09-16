public class PruebaHotel {
    public static void main(String[] args) {
        Habitacion habitacion1 = new habitacionIndividual(5, 250, 4, true);
        Habitacion habitacion2 = new habitacionDoble(202, 180.0, 7, 2);
        Habitacion habitacion3 = new suites(20, 500, 3, true);
        Habitacion habitacion4 = new habitacionesFamiliares(6, 200, 3);

        System.out.println("Información de la primera habitación: ");
        habitacion1.mostrarInformacion();
        habitacion1.PrecioTotal();
        System.out.println();

        System.out.println("Información de la segunda habitación: ");
        habitacion2.mostrarInformacion();
        habitacion2.PrecioTotal();
        System.out.println();

        System.out.println("Información de la tercera habitación: ");
        habitacion3.mostrarInformacion();
        habitacion3.PrecioTotal();
        System.out.println();

        System.out.println("Información de la cuarta habitación: ");
        habitacion4.mostrarInformacion();
        habitacion4.PrecioTotal();

    }
}
