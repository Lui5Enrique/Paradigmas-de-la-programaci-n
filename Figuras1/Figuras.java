package Figuras1;
//Ejecicio de Herencia
public class Figuras {
    private String nombre;

    // Constructor
    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class circulo extends Figuras {
    public circulo() {
        super("CIRCULO: ");
    }

    // Método para calcular el área del círculo
    public double calcularArea(double radio) {
        // Math.PI sirve para llamar a la instancia pi 3.1416 etc.
        // Math.pow es la pontencia
        return Math.PI * Math.pow(radio, 2);
    }
}

class rectangulo extends Figuras {
    public rectangulo() {
        super("RECTÁNGULO: ");
    }

    // Método para calcular el área del rectangulo
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}

class triangulo extends Figuras {
    public triangulo() {
        super("TRIÁNGULO: ");
    }

    // Método para calcular el area del triángulo
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}
