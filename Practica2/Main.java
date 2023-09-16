package Practica2;

public class Main {
    public static void main(String[] args) {
        EmpleadoPorHora empleado1 = new EmpleadoPorHora("Zully", 7000.0, 2);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Jonathan", 1000, 11);
        System.out.println("Datos empleado 1");
        System.out.println(empleado1.mostrarInformacion());
        System.out.println("Salario total: " + empleado1.calcularSalario());
        System.out.println("Datos empleado 2");
        System.out.println(empleado2.mostrarInformacion());
        System.out.println("Salario total: " + empleado2.calcularSalario());
        empleado2.calcularBonificacion();
    }

}
