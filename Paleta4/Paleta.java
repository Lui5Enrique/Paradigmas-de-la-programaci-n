package Paleta4;

// Interface for handling palette methods
interface CambiosPaleta {
    void cambioPrecio(double cambioP); 
    void agregar();
    void informacion();
    double tamaño();
}

// Abstract class for palettes
abstract class Paleta implements CambiosPaleta {
    private String sabor;
    private double precio;

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    @Override
    public void cambioPrecio(double cambioP) {
        if (cambioP <= 0) {
            throw new IllegalArgumentException("El argumento para cambioPrecio debe ser mayor que cero.");
        }
        precio += cambioP;
        System.out.println("Precio nuevo: $" + precio);
    }

    @Override
    public void informacion() {
        System.out.print("Sabor: " + sabor + "\nPrecio: $" + precio);
    }
}

// Class for water-based palettes
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

    @Override
    public void agregar() {
        System.out.println("Se ha agregado chilepiquin");
    }

    @Override
    public double tamaño() {
        return 10;
    }
}

// Class for cream-based palettes
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

    @Override
    public void agregar() {
        System.out.println("Se ha agregado " + cubierta);
    }

    @Override
    public double tamaño() {
        return 15;
    }
}
// Generic class
class PaletasGenericas<T extends CambiosPaleta> {
    void mostrarInformacion(T paleta) {
        paleta.informacion(); // Calls the information method of PaletteChanges
    }

    void aplicarCambios(T paleta, double cambioPrecio) {
        paleta.cambioPrecio(cambioPrecio); // Calls the changePrice method of PaletteChanges
        paleta.agregar(); // Calls the addIngredient method of PaletteChanges
        System.out.println("Tamaño: " + paleta.tamaño() + " cm");
    }
}