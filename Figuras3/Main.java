package Figuras3;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de Figuras
        Figuras[] figuras = new Figuras[5];

        // Crear objetos de cada subclase y almacenarlos en el arreglo
        figuras[0] = new Circulo(2);
        figuras[1] = new Rectangulo(2, 10);
        figuras[2] = new Triangulo(8, 6, 6);
        figuras[3] = new Triangulo(10, 6, 9);
        figuras[4] = new Circulo(9);

        for (Figuras figura : figuras) {
            System.out.println(figura.informacion());
        }
    }
}
