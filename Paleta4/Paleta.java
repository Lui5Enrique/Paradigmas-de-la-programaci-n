package Paleta4;
//Ejercicio de interfaces
interface cambiosPaleta {
    public void cambioPrecio();

    public void agregar();

    public void informacion();

    double tamaño();
}

abstract class Paleta implements cambiosPaleta {
    private String sabor;
    private double precio;

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public void cambioPrecio(double cambioP) {
        if (cambioP <= 0) {
            throw new IllegalArgumentException("El argumento para cambioPrecio debe ser mayor que cero.");
        }
        precio += cambioP;
        System.out.println("Precio nuevo: $" + precio);
    }

    public void informacion() {
        System.out.print("Sabor: " + sabor + "\nPrecio: " + precio);
    }
}

class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("\nBase de agua: " + (baseAgua ? "Si" : "No"));
    }

    public void cambioPrecio() {
        super.cambioPrecio(2);
    }

    public void agregar() {
        System.out.println("Se ha agregado chilepiquin");
    }

    @Override
    public double tamaño() {
        return 10;

    }
}

class PaletaCrema extends Paleta {
    private boolean cremosa;
    private String cubierta;

    public PaletaCrema(String sabor, double precio, boolean cremosa, String cubierta) {
        super(sabor, precio);
        this.cremosa = cremosa;
        this.cubierta = cubierta;
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("\nEs cremosa: " + (cremosa ? "Si" : "No"));
    }

    public void cambioPrecio() {
        super.cambioPrecio(6);
    }

    public void agregar() {
        System.out.println("Se ha agregado " + cubierta);
    }

    @Override
    public double tamaño() {
        return 15;
    }
}
