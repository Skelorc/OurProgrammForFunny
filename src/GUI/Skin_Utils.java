

package GUI;

import java.awt.Component;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.LookAndFeel;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;


public class Skin_Utils {
    
    
public static void changeSkin(Component comp, String laf) {

        try {
            try {
                setLookAndFeel(laf);
            } catch (UnsupportedLookAndFeelException ex) {
                getLogger(Skin_Utils.class.getName()).log(SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            getLogger(Skin_Utils.class.getName()).log(SEVERE, null, ex);
        }
}
    public static void shangeSkin(Component comp, LookAndFeel laf) 
      {
        try {
            setLookAndFeel(laf);
                     
        } catch (UnsupportedLookAndFeelException ex) {
            getLogger(Skin_Utils.class.getName()).log(SEVERE, null, ex);
        }
         updateComponentTreeUI(comp);
}

}
    


    
    
    

