package Practica2;

abstract class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {

        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String mostrarInformacion() {
        return "";
    }
}

// Esta parte es para poder mandarlo a llamar en las subclases
class SalarioInvalidaException extends IllegalArgumentException {
    public SalarioInvalidaException(String mensaje) {
        super(mensaje);
    }
}

interface Bonificacion {
    double calcularBonificacion();
}

class EmpleadoAsalariado extends Empleado {
    int diasTrabajados;

    public EmpleadoAsalariado(String nombre, double salario, int diasTrabajados) {
        super(nombre, salario);
        this.diasTrabajados = diasTrabajados;
        // if condicional que al momento de agregar un valor menor o igual a 0 regreso
        // un mensaje de error
        if (salario <= 0) {
            throw new SalarioInvalidaException("El salario debe ser mayor a 0");
        }
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double calcularSalario() {
        return diasTrabajados * getSalario();
    }

    public void calcularBonificacion() {
        if (diasTrabajados > 10) {
            System.out.println("Gracias por siempre dar tu mejor esfuerzo");
            System.out.print("Salario total: ");
            System.out.println(calcularSalario() + 2500);
        }
    }

    @Override
    public String mostrarInformacion() {
        return "Empleado: " + getNombre() + ", Salario: " + getSalario() + ", dias trabajados: " + getDiasTrabajados();
    }

}

class EmpleadoPorHora extends Empleado {
    double horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salario, double horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        if (salario <= 0) {
            throw new SalarioInvalidaException("El salario debe ser mayor a 0");
        }
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double calcularSalario() {
        return horasTrabajadas * getSalario();
    }

    @Override
    public String mostrarInformacion() {
        return "Empleado: " + getNombre() + ", Salario: " + getSalario() + ", horas trabajadas: "
                + getHorasTrabajadas();
    }
}
