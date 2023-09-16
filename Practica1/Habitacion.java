public class Habitacion {
    private int numero;
    private double precioNoche, nochesTotal;

    public Habitacion(int numero, double precioNoche, double nochesTotal) {
        this.numero = numero;
        this.precioNoche = precioNoche;
        this.nochesTotal = nochesTotal;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public double getnochesTotal() {
        return nochesTotal;
    }

    public double PrecioTotal() {
        return precioNoche * nochesTotal;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio por noche: $" + precioNoche);
        System.out.println("Noches alquiladas: " + nochesTotal);
        System.out.println("Precio total: $" + PrecioTotal());
    }
}

class habitacionDoble extends Habitacion {
    private int numDeCamas;

    public habitacionDoble(int numero, double precioNoche, double nochesTotal, int numDeCamas) {
        super(numero, precioNoche, nochesTotal);
        this.numDeCamas = numDeCamas;
    }

    public int getNumeroDeCamas() {
        return numDeCamas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numDeCamas);
    }
}

class habitacionIndividual extends Habitacion {
    private boolean tieneVistaAlMar;

    public habitacionIndividual(int numero, double precioNoche, double nochesTotal, boolean tieneVistaAlMar) {
        super(numero, precioNoche, nochesTotal);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean isTieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
    }
}

class suites extends Habitacion {
    private boolean servicioHabitacion;

    public suites(int numero, double precioNoche, double nochesTotal, boolean servicioHabitacion) {
        super(numero, precioNoche, nochesTotal);
        this.servicioHabitacion = servicioHabitacion;
    }

    public boolean isServicioHabitacion() {
        return servicioHabitacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene servicio a la habitación: " + (servicioHabitacion ? "Si" : "No"));
    }

}

class habitacionesFamiliares extends Habitacion {
    public habitacionesFamiliares(int numero, double precioNoche, double nochesTotal) {
        super(numero, precioNoche, nochesTotal);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Compartimento familiar");
    }

}
