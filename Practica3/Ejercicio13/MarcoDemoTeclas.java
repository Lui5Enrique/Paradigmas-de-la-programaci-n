package Ejercicio13;

// Fig. 12.36: MarcoDemoTeclas.java
// Handling keyboard events.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    private String linea1 = ""; // first line of the text area
    private String linea2 = ""; // second line of the text area
    private String linea3 = "";// third line of the text area
    private JTextArea areaTexto; // text area to display output

    public MarcoDemoTeclas() {
        super("Demostracion de los eventos de pulsacion de teclas");
        areaTexto = new JTextArea(10, 15); // create JTextArea
        areaTexto.setText("Oprima cualquier tecla en el teclado...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK); 
        add(areaTexto); // add text area to JFrame
        addKeyListener(this); // allow frame to process key events
    }
    // handle key press event
    @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s", KeyEvent.getKeyText(evento.getKeyCode())); 
        establecerLineas2y3(evento); // set output lines two and three
    } 
    
   // handle key typed event
    @Override
    public void keyReleased(KeyEvent evento){
        linea1 = String.format("Tecla liberada: %s",
        KeyEvent.getKeyText(evento.getKeyCode())); // show released key

        establecerLineas2y3(evento); // set output lines two and three
    }
    
    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s", evento.getKeyChar());
        establecerLineas2y3(evento); 
    }
    // set output lines two and three
    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("Esta tecla %ses una tecla de accion", (evento.isActionKey() ? "" : "no "));
        String temp = KeyEvent.getModifiersExText(evento.getModifiersEx());
        linea3 = String.format("Teclas modificadoras oprimidas: %s", (temp.equals("") ? "ninguna" : temp)); // imprime modificadoras
        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3)); // imprime tres líneas de texto
    }
} // fin de la clase MarcoDemoTeclas