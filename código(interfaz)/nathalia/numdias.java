import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class numdias extends JPanel implements ActionListener {
    private JButton next;
    private JLabel titulo4;
    private JTextField num1;
    private JTextField num2;
    private JTextField num4;
    private JTextField num3;
    private JLabel emo1;
    private JLabel emo2;
    private JLabel emo3;
    private JLabel emo4;
    private JLabel titulo5;
    private JButton mostrar;
    private String[] emociones = new String[4]; // Inicializar el arreglo emociones

    public numdias(String[] emociones) {
        //construct components
        next = new JButton("Next");
        titulo4 = new JLabel("Ingresa el numero de dias en los que esta emoción te domino");
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        num4 = new JTextField(5);
        num3 = new JTextField(5);
        emo1 = new JLabel("Emoción1");
        emo2 = new JLabel("Emoción2");
        emo3 = new JLabel("Emoción3");
        emo4 = new JLabel("Emoción4");
        titulo5 = new JLabel("en el mes");
        mostrar = new JButton("mostrar info.");
        this.emociones =emociones;
        mostrar.addActionListener(this);
        next.addActionListener(this);

        //adjust size and set layout
        setPreferredSize(new Dimension(534, 308));
        setLayout(null);

        //add components
        add(next);
        add(titulo4);
        add(num1);
        add(num2);
        add(num4);
        add(num3);
        add(emo1);
        add(emo2);
        add(emo3);
        add(emo4);
        add(titulo5);
        add(mostrar);

        //set component bounds (only needed by Absolute Positioning)
        next.setBounds(415, 260, 100, 30);
        titulo4.setBounds(95, 20, 365, 35);
        num1.setBounds(125, 150, 100, 25);
        num2.setBounds(315, 150, 100, 25);
        num4.setBounds(315, 220, 100, 25);
        num3.setBounds(125, 220, 100, 25);
        emo1.setBounds(145, 125, 100, 25);
        emo2.setBounds(330, 125, 100, 25);
        emo3.setBounds(145, 195, 100, 25);
        emo4.setBounds(335, 195, 100, 25);
        titulo5.setBounds(250, 45, 100, 25);
        mostrar.setBounds(215, 90, 110, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new numdias(new String[4])); // Pasar un arreglo vacío
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mostrar) {
            for (String emocion : emociones) {
                System.out.println(emocion);
            }

            String emoci1 = emociones[0];
            String emoci2 = emociones[1];
            String emoci3 = emociones[2];
            String emoci4 = emociones[3];

            emo1.setText(emoci1);
            emo2.setText(emoci2);
            emo3.setText(emoci3);
            emo4.setText(emoci4);
        }
        String nume1 = num1.getText();
        String nume2 = num2.getText();
        String nume3 = num3.getText();
        String nume4 = num4.getText();

         int numee1 = Integer.parseInt(nume1);
         int numee2 = Integer.parseInt(nume2);
         int numee3 = Integer.parseInt(nume3);
         int numee4 = Integer.parseInt(nume4);

         int mayor;
         String emo;

          if(numee1 > numee2 && numee1 > numee3 && numee1 > numee4){
          mayor = numee1;
          emo = emociones[0];
          }else if(numee2 > numee1 && numee2 > numee3 && numee2 > numee4){
          mayor = numee2;
          emo = emociones [1];
          }else if(numee3 > numee1 && numee3 > numee2 && numee3 > numee4){
           mayor = numee3;
           emo = emociones [2];
          } else {
           mayor = numee4;
           emo = emociones [3];
}

        if(e.getSource()== next){
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Final(mayor,emo));
        frame.pack();
        frame.setVisible (true);
        }
    }
}

