import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Inicio extends JPanel implements ActionListener{
    private JButton jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JTextField jcomp8;
    private JLabel jcomp9;
    private JTextField jcomp10;
    private JLabel jcomp11;
    private JLabel jcomp12;
    private JTextField jcomp13;
    private JLabel jcomp14;

    public Inicio() {
        //construct components
        jcomp1 = new JButton ("Save");
        jcomp2 = new JLabel ("Emotions App");
        jcomp3 = new JLabel ("Welcome!");
        jcomp4 = new JLabel ("to");
        jcomp5 = new JLabel ("Ingresa tus datos:");
        jcomp6 = new JTextField (5);
        jcomp7 = new JLabel ("Nombre");
        jcomp8 = new JTextField (5);
        jcomp9 = new JLabel ("Edad");
        jcomp10 = new JTextField (5);
        jcomp11 = new JLabel ("Correo");
        jcomp12 = new JLabel ("Crea una ");
        jcomp13 = new JTextField (5);
        jcomp14 = new JLabel ("Contraseña");
        jcomp1.addActionListener(this);

        //adjust size and set layout
        setPreferredSize (new Dimension (480, 284));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (195, 220, 110, 35);
        jcomp2.setBounds (205, 55, 100, 40);
        jcomp3.setBounds (220, 25, 100, 25);
        jcomp4.setBounds (240, 40, 25, 30);
        jcomp5.setBounds (10, 105, 110, 30);
        jcomp6.setBounds (15, 170, 100, 25);
        jcomp7.setBounds (40, 140, 50, 25);
        jcomp8.setBounds (130, 170, 100, 25);
        jcomp9.setBounds (165, 140, 40, 30);
        jcomp10.setBounds (245, 170, 100, 25);
        jcomp11.setBounds (275, 140, 50, 25);
        jcomp12.setBounds (380, 130, 60, 25);
        jcomp13.setBounds (360, 170, 100, 25);
        jcomp14.setBounds (375, 145, 100, 25);
    }
    

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Inicio());
        frame.pack();
        frame.setVisible (true);
    }

    public void actionPerformed(ActionEvent e) {
        String nombre = jcomp6.getText();
        String edad = jcomp8.getText();
        String correo = jcomp10.getText();
        String contraseña = jcomp13.getText();

        if (e.getSource()== jcomp1){
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();

            JFrame frame = new JFrame ("MyPanel");
            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add (new Seleccionador());
            frame.pack();
             frame.setVisible (true);
        }
        
    }
}