package Ejercicio6;
// Fig. 12.19: MarcoBotonOpcion.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class MarcoBotonOpcion extends JFrame {
    private final JTextField campoTexto; // used to display changes in font style
    private final Font tipoLetraSimple; // font for plain text
    private final Font tipoLetraNegrita; // font for bold text
    private final Font tipoLetraCursiva; // font for italic text
    private final Font tipoLetraNegritaCursiva; // font for bold and italic text
    private final JRadioButton simpleJRadioButton; // selects plain text
    private final JRadioButton negritaJRadioButton; // selects bold text
    private final JRadioButton cursivaJRadioButton; // selects italic text
    private final JRadioButton negritaCursivaJRadioButton; // selects bold and italic text
    private ButtonGroup grupoOpciones;
    // contains the radio buttons
    public MarcoBotonOpcion() {
        super("Prueba de RadioButton");
        setLayout(new FlowLayout());
        campoTexto = new JTextField(" Observe el cambio en el estilo del tipo de letra", 25);
        add(campoTexto); // add textField to JFrame

        // create radio buttons
simpleJRadioButton = new JRadioButton("Simple", true);
negritaJRadioButton = new JRadioButton("Negrita", false);
cursivaJRadioButton = new JRadioButton("Cursiva", false);
negritaCursivaJRadioButton = new JRadioButton("Negrita/Cursiva", false);
add(simpleJRadioButton); // add plain button to JFrame
add(negritaJRadioButton); // add bold button to JFrame
add(cursivaJRadioButton); // add italic button to JFrame
add(negritaCursivaJRadioButton); // add bold and italic button to JFrame

// create a logical relationship between JRadioButtons
grupoOpciones = new ButtonGroup(); // create ButtonGroup
grupoOpciones.add(simpleJRadioButton);// add plain to group
grupoOpciones.add(negritaJRadioButton); // add bold to group
grupoOpciones.add(cursivaJRadioButton);// add italic to group
grupoOpciones.add(negritaCursivaJRadioButton); // add bold and italic
// create font objects
tipoLetraSimple = new Font("Serif", Font.PLAIN, 14);
tipoLetraNegrita = new Font("Serif", Font.BOLD, 14);
tipoLetraCursiva = new Font("Serif", Font.ITALIC, 14);
tipoLetraNegritaCursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
campoTexto.setFont(tipoLetraSimple);

// register events for JRadioButtons
simpleJRadioButton.addItemListener( 
new ManejadorBotonOpcion(tipoLetraSimple));
negritaJRadioButton.addItemListener(
new ManejadorBotonOpcion(tipoLetraNegrita));
cursivaJRadioButton.addItemListener( 
new ManejadorBotonOpcion(tipoLetraCursiva));
negritaCursivaJRadioButton.addItemListener( 
new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
} 

private class ManejadorBotonOpcion implements ItemListener {
    private Font tipoLetra; 
    public ManejadorBotonOpcion(Font f) {
        tipoLetra = f;
    }

    
    @Override
    public void itemStateChanged(ItemEvent evento)
    {
        campoTexto.setFont(tipoLetra);
    }
}
} 