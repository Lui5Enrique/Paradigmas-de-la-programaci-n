package Ejercicio10;

// Fig. 12.29: MarcoRastreadorRaton.java

import javax.swing.JFrame;
public class RastreadorRaton {
    public static void main(String[] args) { 
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton(); 
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(300, 100);
        marcoRastreadorRaton.setVisible(true); 
    }
} 