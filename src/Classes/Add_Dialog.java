

package Classes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Add_Dialog {
    private JFrame dialog = new JFrame();
    {
      dialog.setTitle("Выбери сложность для начала новой игры!");
      dialog.getContentPane().setBackground(Color.BLACK);
      dialog.setSize(new Dimension(600,400));
      dialog.getContentPane().setLayout(new BoxLayout(dialog, BoxLayout.Y_AXIS));
      dialog.setResizable(false);
       
     JButton easy = new JButton("Для слабаков!");
     JButton medium = new JButton("Если считаешь себя асом!");
     JButton hard = new JButton("Если думаешь, что ты быстрее богов!");
    
     dialog.add(easy);
     dialog.add(medium);
     dialog.add(hard);
     
     dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
       

      
       dialog.setLocationRelativeTo(null);
       dialog.validate();
       dialog.setVisible(true);
       dialog.getFocusOwner();
       
      
    }
    

}
