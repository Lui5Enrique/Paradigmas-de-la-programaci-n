package Figuras2;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de Figuras
        Figuras[] figuras = new Figuras[5];

        // Crear objetos de cada subclase y almacenarlos en el arreglo
        figuras[0] = new circulo(8);
        figuras[1] = new rectangulo(10, 5);
        figuras[2] = new triangulo(6, 8);
        figuras[3] = new triangulo(10, 6);
        figuras[4] = new circulo(9);

        // for que recorre el arreglo uno por uno, tanto del método información() como
        // calcularArea().
        for (Figuras figura : figuras) {
            System.out.println(figura.informacion() + figura.calcularArea());
        }
    }
}
