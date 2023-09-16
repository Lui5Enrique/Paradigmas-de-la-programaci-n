package Figuras3;

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

    // Métodos para calcular el área y el perímetro
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public String informacion() {
        return nombre;
    }
}

class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
        super("[Círculo]");
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro del círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String informacion() {
        return super.informacion() + " [Área]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }
}

class Rectangulo extends Figuras {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        super("[Rectángulo]");
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String informacion() {
        return super.informacion() + " [Área]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }
}

class Triangulo extends Figuras {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super("[Triángulo]");

        // Verificar que los lados sean mayores que cero
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Los valores de los lados deben ser mayores que cero.");
        }

        // Verificar la desigualdad triangular
        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            throw new IllegalArgumentException("No se puede crear un triángulo con estos valores de lado.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área según la fórmula de Herón
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String informacion() {
        return super.informacion() + " [Área]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }
}
