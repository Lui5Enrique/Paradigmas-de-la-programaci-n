package Paleta4;

public class Main {
    public static void main(String[] args) {
        PaletaAgua paletaAgua = new PaletaAgua("Fresa", 8.0, true);
        PaletaCrema paletaCrema = new PaletaCrema("Chocolate", 10.0, true, "Nuez");

        PaletasGenericas<PaletaAgua> manejadorPaletasAgua = new PaletasGenericas<>();
        PaletasGenericas<PaletaCrema> manejadorPaletasCrema = new PaletasGenericas<>();

        System.out.println("Información de la paleta de agua:");
        manejadorPaletasAgua.mostrarInformacion(paletaAgua);
        manejadorPaletasAgua.aplicarCambios(paletaAgua, 2.0);

        System.out.println("\nInformación de la paleta de crema:");
        manejadorPaletasCrema.mostrarInformacion(paletaCrema);
        manejadorPaletasCrema.aplicarCambios(paletaCrema, 3.0);
    }
}