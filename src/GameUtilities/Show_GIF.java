package GameUtilities;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Show_GIF {
               
      Random random = new Random();
      static ArrayList<ImageIcon> goodGif = new ArrayList<ImageIcon>();
      static ArrayList<ImageIcon> badGif = new ArrayList<ImageIcon>();
      private static JDialog dialogG;
      private static JDialog dialogB;
      private static JLabel LabelGood = new JLabel();
      private static JLabel LabelBad = new JLabel();
      static int g = 0;
      static int b = 0;
      
    public static void addGif()
      {
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\класс.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\в очках хлопает в лодоши.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\бин врач.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\парень класс.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\все рады.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\бензопила ок.gif"));  
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\башкой кивает.gif")); 
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\лео.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\макгрэг.gif"));        
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\пляшут.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\радость.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\отлично.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\йес.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\танцуер.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\престол.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\десятка.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\палецвверх.gif"));      
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\розовая.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\респект.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\стадион.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\парк.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\лайк.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\псих.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\сталон.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\лысый класс.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\девушка класс.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\тату класс.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\в очках круто.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\девушка смеется.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\ода.gif"));
        goodGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\1ZNW.gif"));

               
        
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\керри не доволен.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\терминатор не правильно.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\профессор не доволен.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\печаль.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\башкой об стол.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\за башку.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\сезам.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\панда.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\девушка.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\ведущий.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\девчушка.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\седой.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\барышня.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\грозный.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\тренер.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\котэ.gif"));     
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\уиллсмит.gif"));           
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\девка.gif"));        
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\скайли.gif"));
        badGif.add(new ImageIcon("src\\\\Materials\\\\GIF\\\\пальцемнет.gif"));
      }
    
            
    public static void showGoodGif()
            
    {  
    if(g >= goodGif.size())
       {
           g=0;
       } 
      
       dialogG = new JDialog();
       dialogG.setTitle("Правильно!!!");
       dialogG.setSize(new Dimension(250,300));
       dialogG.getContentPane().setLayout(new BorderLayout());
       dialogG.setResizable(false);
       
       LabelGood = new JLabel(goodGif.get(g));
       LabelGood.setLocation(70,0);
       
       dialogG.getContentPane().add(LabelGood, CENTER);
       dialogG.setLocationRelativeTo(null);
       dialogG.validate();
       dialogG.setVisible(true);
       dialogG.getFocusOwner();
       g++;
       
    }
        
    public static void showBadGif()
            
    { 
     if(b >= badGif.size())
       {
           b=0;
       }
       dialogB = new JDialog();
       dialogB.setTitle("Неверно!!!");
       dialogB.setSize(new Dimension(250,300));
       dialogB.getContentPane().setLayout(new BorderLayout());
       dialogB.setResizable(false);
             
       LabelBad = new JLabel(badGif.get(b));
       LabelBad.setLocation(70,0);
       
       dialogB.getContentPane().add(LabelBad, CENTER);
       dialogB.setLocationRelativeTo(null);
       dialogB.validate();
       dialogB.setVisible(true);
       b++;
       
    }
    public static void closeGif()
      {
        LabelGood.setVisible(false);
        LabelBad.setVisible(false);
        if (dialogG != null)
        {
        dialogG.setVisible(false);
        dialogG.dispose();
        }
        if(dialogB != null)
        {
        dialogB.setVisible(false);
        dialogB.dispose();
        }
                               
      }
       
}
