import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Seleccionador extends JPanel implements ActionListener{
    private JButton next;
    private JCheckBox amor;
    private JCheckBox alegria;
    private JCheckBox tristeza;
    private JCheckBox frustracion;
    private JCheckBox ira;
    private JCheckBox empatia;
    private JCheckBox diversion;
    private JCheckBox tolerancia;
    private JCheckBox aburrimiento;
    private JLabel titulo;
    private JLabel titulo2;
    private JLabel titulo3;
    private JButton mostrar;
    private JTextArea campo ;
    private JLabel titulo4;
    private String [] emociones;

    public Seleccionador() {
        //construct components
        next = new JButton ("Next");
        amor = new JCheckBox ("Amor");
        alegria = new JCheckBox ("Alegría");
        tristeza = new JCheckBox ("Tristeza");
        frustracion = new JCheckBox ("Frustracion");
        ira = new JCheckBox ("Ira");
        empatia = new JCheckBox ("Empatia");
        diversion = new JCheckBox ("Diversion");
        tolerancia = new JCheckBox ("Tolerancia");
        aburrimiento = new JCheckBox ("Aburrimiento");
        titulo = new JLabel ("¿Cuáles de estas emociones sientes con más frecuencia?");
        titulo2 = new JLabel ("(Selecciona 4)");
        titulo3 = new JLabel ("Tus emociones seleccionadas");
        mostrar = new JButton ("mostrar");
        campo  = new JTextArea (5, 5);
        titulo4 = new JLabel ("fueron:");

        mostrar.addActionListener(this);
        next.addActionListener(this);
        //adjust size and set layout
        setPreferredSize (new Dimension (508, 324));
        setLayout (null);

        //add components
        add (next);
        add (amor);
        add (alegria);
        add (tristeza);
        add (frustracion);
        add (ira);
        add (empatia);
        add (diversion);
        add (tolerancia);
        add (aburrimiento);
        add (titulo);
        add (titulo2);
        add (titulo3);
        add (mostrar);
        add (campo );
        add (titulo4);

        //set component bounds (only needed by Absolute Positioning)
        next.setBounds (390, 270, 100, 30);
        amor.setBounds (50, 75, 100, 25);
        alegria.setBounds (215, 75, 100, 25);
        tristeza.setBounds (50, 120, 100, 25);
        frustracion.setBounds (375, 120, 100, 25);
        ira.setBounds (375, 75, 100, 25);
        empatia.setBounds (215, 120, 100, 25);
        diversion.setBounds (375, 165, 100, 25);
        tolerancia.setBounds (50, 165, 100, 25);
        aburrimiento.setBounds (215, 165, 100, 25);
        titulo.setBounds (85, 5, 335, 45);
        titulo2.setBounds (220, 40, 100, 25);
        titulo3.setBounds (15, 205, 220, 30);
        mostrar.setBounds (220, 225, 100, 25);
        campo .setBounds (15, 250, 175, 65);
        titulo4.setBounds (75, 225, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Seleccionador());
        frame.pack();
        frame.setVisible (true);
    }


    
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()== mostrar){
            emociones = new String [4];
            String emocionesSeleccionadas = "";
            int contador = 0;
            if(amor.isSelected()) {
                emocionesSeleccionadas += "Amor\n";
                emociones[contador++] = "Amor";
            }
            if(alegria.isSelected()) {
                emocionesSeleccionadas += "Alegría\n";
                emociones[contador++] = "Alegria";
            }
            if(tristeza.isSelected()) {
                emocionesSeleccionadas += "Tristeza\n";
                emociones[contador++] = "Tristeza";
            }
            if(frustracion.isSelected()) {
                emocionesSeleccionadas += "Frustracion\n";
                emociones[contador++] = "Frustracion";
            }
            if(ira.isSelected()) {
                emocionesSeleccionadas += "Ira\n";
                emociones[contador++] = "Ira";
            }
            if(empatia.isSelected()) {
                emocionesSeleccionadas += "Empatia\n";
                emociones[contador++] = "Empatia";
            }
            if(diversion.isSelected()) {
                emocionesSeleccionadas += "Diversion\n";
                emociones[contador++] = "Diversion";
            }
            if(tolerancia.isSelected()) {
                emocionesSeleccionadas += "Tolerancia\n";
                emociones[contador++] = "Tolerancia";
            }
            if(aburrimiento.isSelected()) {
                emocionesSeleccionadas += "Aburrimiento\n";
                emociones[contador++] = "Aburrimiento";
            }
            
            if(contador != 4) {
                campo.setText("Por favor, selecciona \n exactamente 4 emociones.");
            } else {
                campo.setText(emocionesSeleccionadas);
            }
            for (String emocion : emociones) {
                System.out.println(emocion);
            }
        }
        if(e.getSource()== next){
            JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        //numdias si = new numdias(emociones);
        frame.getContentPane().add (new numdias(emociones));
        frame.pack();
        frame.setVisible (true);
        }
       }
    }

