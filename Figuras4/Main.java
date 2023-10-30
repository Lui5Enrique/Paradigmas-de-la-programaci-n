package Figuras4;

public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(6);
    Rectangulo r1 = new Rectangulo(7, 8);
    Triangulo t1 = new Triangulo(5, 5, 5);

    FigurasGenericas<Circulo> FigCirculo = new FigurasGenericas<>(c1);
    FigurasGenericas<Rectangulo> FigRectangulo = new FigurasGenericas<>(r1);
    FigurasGenericas<Triangulo> FigTriangulo = new FigurasGenericas<>(t1);

    System.out.println("Circulo");
    FigCirculo.caracteristicas();

    System.out.println("\nRectangulo");
    FigRectangulo.caracteristicas();

    System.out.println("\nTriangulo");
    FigTriangulo.caracteristicas();
    System.out.println();
    
    }
}
