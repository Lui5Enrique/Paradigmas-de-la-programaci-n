package Paleta2;

public class Paleta {
    private String sabor;
    private double precio;

    // Constructor
    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    // Métodos get y set
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void informacion() {
        System.out.print("Sabor: " + sabor + "\nPrecio: " + precio);

    }

    public void cambioPrecio(double cambioP) {
        precio += cambioP;
        System.out.println("Precio nuevo: $" + precio);
    }

    public void agregar() {
        System.out.println("Se agrego ");
    }

}

class paletaAgua extends Paleta {
    boolean baseAgua;

    public paletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;

    }

    public void informacion() {
        System.out.println("----------------------------------------");
        System.out.println("Paleta de agua");
        super.informacion();
        System.out.println("\nBase de agua: " + (baseAgua ? "Si" : "No"));
    }

    // método para cambiar precio
    public void cambioPrecio() {
        super.cambioPrecio(2);
    }

    // método para agregar chilito a la paleta de agua
    public void agregar() {
        System.out.println("Se ha agregado chilepiquin");
    }

}

class paletaCrema extends Paleta {
    boolean cremosa;
    private String cubierta;

    public paletaCrema(String sabor, double precio, boolean cremosa, String cubierta) {
        super(sabor, precio);
        this.cremosa = cremosa;
        this.cubierta = cubierta;
    }

    public void informacion() {
        System.out.println("----------------------------------------");
        System.out.println("Paleta de crema");
        super.informacion();
        System.out.println("\nEs cremosa: " + (cremosa ? "Si" : "No"));
    }

    public void cambioPrecio() {
        super.cambioPrecio(6);
    }

    // Método para agregar cubiertas a la paleta de crema
    public void agregar() {
        System.out.println("Se ha agregado " + cubierta);
    }
}
