package Figuras1;

public class Main {
    public static void main(String[] args) {
        circulo c1 = new circulo();
        System.out.println(c1.getNombre() + c1.calcularArea(5));

        rectangulo r1 = new rectangulo();
        System.out.println(r1.getNombre() + r1.calcularArea(10, 8));

        triangulo t1 = new triangulo();
        System.out.println(t1.getNombre() + t1.calcularArea(8, 5));
    }

}
