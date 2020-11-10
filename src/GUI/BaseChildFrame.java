

package GUI;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public abstract class BaseChildFrame extends JFrame{
    
  
    
    public BaseChildFrame()
    {
        setCloseOperation();
    }
    
    private JFrame parentFrame;
    
    public JFrame getParentFrame()
    {
        return parentFrame;
    }
    
    public void showFrame(JFrame parent)
    {
        this.parentFrame = parent;
        parent.setVisible(false);
        super.setVisible(true);
    }
    
   protected void closeFrame()
   {
       if(parentFrame == null) throw new IllegalArgumentException("parent frame not be null");
       super.setVisible(false);
       parentFrame.setVisible(true);    
   }
   
   protected void close(JFrame obj)
     {
        
        obj.setVisible(false);
        obj = null;   
     }
   
//подтверждения закрытия окна.


   
   protected void setCloseOperation()
   {
       super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       super.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e){
               Object[] options = { "Да, хватит с меня...", "Нет, поехали дальше!!!" };
               int n = JOptionPane.showOptionDialog(e.getWindow(), "Точно хочешь убежать?",
			"Подтверждение", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
               if(n==0)
               {
               e.getWindow().setVisible(false);
               System.exit(0);
               }
//               closeFrame();
           }
       });
   }

    
      }
   
  
  
   
           
           
           
           
           