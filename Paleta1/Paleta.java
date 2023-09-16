package Paleta1;
//Ejercicio de herencia
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

}

class paletaAgua extends Paleta {
    boolean baseAgua;

    public paletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;

    }

    public void informacion() {
        System.out.println("	");
        System.out.println("Paleta de agua");
        // llamamos al metodo informacion de la clase Paleta super.informacion();
        // el metodo baseAgua? "Si" : "No" nos indica si colocamos verdadero(true) nos
        // imprime "Si"
        // en el caso contrario si indicamos que baseAgua es falso(False) nos imprime
        // "No"
        System.out.println("\nBase de agua: " + (baseAgua ? "Si" :

                "No"));

    }

    // método para cambiar precio
    public void cambioPrecio() {
        super.cambioPrecio(2);
    }

    // método para agregar chilito a la paleta de agua
    public void agregarChilito() {
        System.out.println("Se ha agregado chilepiquin");
    }

}

class paletaCrema extends Paleta {
    boolean cremosa;

    public paletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    public void informacion() {
        System.out.println("	");
        System.out.println("Paleta de crema");
        super.informacion();
        System.out.println("\nEs cremosa: " + (cremosa ? "Si" : "No"));
    }

    public void cambioPrecio() {
        super.cambioPrecio(6);
    }

    // Método para agregar cubiertas a la paleta de crema
    public void AgregarCubierta(String cubierta) {
        System.out.println("Se ha agregado " + cubierta);
    }
}
