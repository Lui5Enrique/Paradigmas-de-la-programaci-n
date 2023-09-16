package Figuras4;

//interfaz para tener los métodos que se usaran en las demas subclases.
interface FigCalculos {
    double calcularArea();

    double calcularPerimetro();

    String informacion();

    public void pintar();
}

abstract class Figuras implements FigCalculos {
    private String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
        super("[Círculo]");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String informacion() {
        return " [Área del circulo]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }

    @Override
    public void pintar() {
        System.out.println("La figura se pinta de azul");
    }
}

class Rectangulo extends Figuras {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        super("[Rectángulo]");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String informacion() {
        return " [Área del rectangulo]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }

    @Override
    public void pintar() {
        System.out.println("La figura se pinta de rojo");
    }
}

class Triangulo extends Figuras {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super("[Triángulo]");

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Los valores de los lados deben ser mayores que cero.");
        }

        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            throw new IllegalArgumentException("No se puede crear un triángulo con estos valores de lado.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {

        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String informacion() {
        return " [Área del triangulo]= " + calcularArea() + " [Perímetro]= " + calcularPerimetro();
    }

    @Override
    public void pintar() {
        System.out.println("La figura se pinta de verde");
    }
}
