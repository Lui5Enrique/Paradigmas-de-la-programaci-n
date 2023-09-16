package Figuras2;

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

    public double calcularArea() {
        return 0;
    }

    public String informacion() {
        return nombre;
    }
}

class circulo extends Figuras {
    private double radio;

    public circulo(double radio) {
        super("[Círculo ");
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {

        return Math.PI * Math.pow(radio, 2);
    }

    public String informacion() {
        return super.informacion() + "Area]= ";
    }
}

class rectangulo extends Figuras {
    private double base, altura;

    public rectangulo(double base, double altura) {
        super("[Rectángulo ");
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectangulo
    public double calcularArea() {
        return base * altura;
    }

    public String informacion() {
        return super.informacion() + "Area]= ";
    }
}

class triangulo extends Figuras {
    private double base, altura;

    public triangulo(double base, double altura) {
        super("[Triángulo ");
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el area del triángulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public String informacion() {
        return super.informacion() + "Area]= ";
    }
}
