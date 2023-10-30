package Ejercicio1;
import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        // gets user input from JOptionPane input dialogs
        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");

        // converts string entries to int values for use in a calculation
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        // displays the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "La suma es " + suma,
                "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
}
