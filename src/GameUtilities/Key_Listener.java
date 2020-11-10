

package GameUtilities;

import Game.GUI.Game;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComponent;



public class Key_Listener implements KeyListener {

    public JComponent a; 
    public JButton z;
    public JComponent b;
    
    @Override
    public void keyTyped(KeyEvent e)
      {
            
      }

    @Override
    public void keyPressed(KeyEvent e)
      {
      
      }

    @Override
    public void keyReleased(KeyEvent e)
      {
         if(e.getKeyCode() == VK_ENTER)
        {
            a.requestFocus();
            z.doClick();
                       
        }
         
      }

}
