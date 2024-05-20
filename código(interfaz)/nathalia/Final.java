import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Final extends JPanel implements ActionListener {
    private JLabel titulo7;
    private JButton mostrar;
    private JTextArea campofin;
    private static int mayor;
    private static String emo;

    public Final(int mayor, String emo) {
        //construct components
        titulo7 = new JLabel ("Tus resultados son:");
        mostrar = new JButton ("Mostrar resultados");
        campofin = new JTextArea (5, 5);
        this.mayor = mayor;
        this.emo = emo;
        mostrar.addActionListener(this);
        


        //adjust size and set layout
        setPreferredSize (new Dimension (514, 302));
        setLayout (null);

        //add components
        add (titulo7);
        add (mostrar);
        add (campofin);

        //set component bounds (only needed by Absolute Positioning)
        titulo7.setBounds (15, 20, 120, 35);
        mostrar.setBounds (175, 35, 145, 35);
        campofin.setBounds (60, 85, 410, 185);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Final(mayor, emo));
        frame.pack();
        frame.setVisible (true);
    }


    public void actionPerformed(ActionEvent e) {
        String texdef= "";
        if(e.getSource() == mostrar){
         
         String mayor1 =Integer.toString(mayor);
         String showemo = " Tu emocion dominante fue: " + emo;
         String mostrarr = "El numero de veces que experimientaste en el mes esta emoción fue: " + mayor1;
         
         

         if (emo == "Alegria"){
            String textale ="Que tu alegría ilumine cada rincón de tu vida y contagie a todos \n a tu alrededor. ¡Disfruta cada momento con una sonrisa!";
            texdef= textale;
         }
         else if(emo == "Tristeza"){
            String textris = " En los momentos de tristeza, recuerda que está bien sentirte así.\n Permítete sanar y busca el consuelo en los pequeños detalles y \n en quienes te quieren." + 
         "Igual recuerda que si necesitas ayuda para \n regular esta emoción puedes recurrir a:"+
         "\n- El escuchadero de la universidad\n"+
         "- ⁠La atención psicológica que te brinda la universidad en el Bloque 3\n"+
         "- ⁠La linea 24/7: 018000521021 (llamadas), 3166011106 (WhatsApp)\n";
         texdef = textris;
         }
         else if (emo == " Ira"){
            String texira= "La ira puede ser intensa, pero respira profundo y busca calmarte. \n Canaliza esa energía en algo positivo y recuerda que la serenidad trae claridad.\n" +
         "Igual recuerda que si necesitas ayuda para regular esas emociones puedes recurrir a:\n" +
         "- El escuchadero de la universidad\n" +
         "- ⁠La atención psicológica que te brinda la universidad en el Bloque 3\n" +
         "- ⁠La linea 24/7: 018000521021 (llamadas), 3166011106 (WhatsApp)\n";
          texdef = texira;
         }
         else if (emo == "Frustracion"){
            String texfru = " La frustración es parte del camino hacia el éxito. No te desanimes,\n cada obstáculo es una oportunidad para aprender y crecer.\n" +
             "Igual recuerda que si necesitas ayuda para regular esas emociones puedes recurrir a:\n" +
             "- El escuchadero de la universidad\n" +
             "- ⁠La atención psicológica que te brinda la universidad en el Bloque 3\n" +
             "- ⁠La linea 24/7: 018000521021 (llamadas), 3166011106 (WhatsApp)\n";
             texdef = texfru;
         }
         else if (emo == "Amor"){
            String texamo =" El amor es la fuerza más poderosa que tenemos.\n Ámate a ti mismo y comparte ese amor con los demás;\n es el mejor regalo que puedes dar y recibir. ";
            texdef = texamo;
         }
         else if (emo == "Empatia"){
            String texemp = " La empatía nos conecta y nos hace más humanos.\n Escucha con el corazón y ponte en el lugar del otro,\n pues todos llevamos nuestras propias batallas. ";
            texdef = texemp;
         }
         else if (emo == " Diversion"){
            String texdiv = "La diversión es esencial para una vida equilibrada.\n Permítete momentos de risa y disfrute,\n son el respiro necesario para el alma. ";
            texdef = texdiv;
         }
         else if (emo == "Tolerancia"){
            String textol = " La tolerancia es la clave para convivir en armonía.\n Acepta las diferencias y aprende de ellas,\n cada persona tiene una historia única que contar." ;
            texdef= textol;
         }
         else if (emo == "Aburrimiento"){
            String texabu = " El aburrimiento puede ser una puerta a la creatividad.\n Usa ese tiempo para explorar nuevas ideas,\n hobbies o simplemente descansar tu mente.";
            texdef = texabu;
         }
         String textofin = showemo + "\n" + mostrarr +"\n"+ texdef;
         campofin.setText(textofin);
         

        }
    }


}