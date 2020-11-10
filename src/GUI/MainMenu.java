package GUI;


import Game.GUI.Training;
import Game.GUI.Game_Choice_Difficulty;
import Classes.Result;
import GameUtilities.Background;
import GameUtilities.Show_GIF;
import Viktorina.all.Viktorina_Questions;
import GameUtilities.Sound_Player;
import static GameUtilities.Sound_Player.playButtonSoundsShoot;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import static java.awt.Toolkit.getDefaultToolkit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.SwingUtilities.invokeLater;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;



public class MainMenu extends BaseChildFrame {

    
    //ИМЯ!!!
    public static String NAME = "";
    Game_Choice_Difficulty gcd;
    Spravka spravka = new Spravka();
    public static Font customFont;
    
    //create the font  //create the font to use. Specify the size! 
    public static Font createFont(){
    try {
    customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src\\Materials\\other\\rust.ttf")).deriveFont(Font.BOLD,14f); 
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); //register the font 
    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src\\Materials\\other\\rust.ttf")));
    return(customFont);
    } 
    catch (IOException e) {} catch(FontFormatException e) {} //use the font 
    return null;
    }
    
    

    public MainMenu() {
        if(NAME.equals(""))
                    {
                    createReg();
                    }
        initComponents();
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
        createFont();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel2 = new JLabel();
        MainMenu = new JPanel();
        jLabel1 = new JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Приложение для реального пацана");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton18.setBackground(new java.awt.Color(51, 51, 51));
        jButton18.setFont(new Font("RUSTatty Teddy", 0, 30)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 255, 102));
        jButton18.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/menu_item_2.png"))); // NOI18N
        jButton18.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 60));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new Font("RUSTatty Teddy", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/menu_item_1.png"))); // NOI18N
        jButton1.setToolTipText("НЕ для слабонервных!:)");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed1(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 250, 60));

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.setFont(new Font("RUSTatty Teddy", 0, 30)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 255, 102));
        jButton16.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/menu_item_4.png"))); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 250, 60));

        jButton17.setBackground(new java.awt.Color(51, 51, 51));
        jButton17.setFont(new Font("RUSTatty Teddy", 0, 30)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 255, 102));
        jButton17.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/menu_item_3.png"))); // NOI18N
        jButton17.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton17.setPreferredSize(new java.awt.Dimension(247, 17));
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, 60));

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/main_menu/main_man_pos1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 69, -1, 431));

        MainMenu.setBackground(new java.awt.Color(255, 255, 255));
        MainMenu.setForeground(new java.awt.Color(255, 255, 255));
        MainMenu.setFocusable(false);
        MainMenu.setOpaque(false);
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 52, 262, -1));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Materials/JPG/main.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 703, -1));

        jMenu3.setText("Справка");

        jMenuItem1.setText("Справка");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("О программе");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         playButtonSoundsShoot();

        Viktorina v = new Viktorina();
        v.setLocationRelativeTo(this);
        v.showFrame(this);
        Random r = new Random();
        v.n = r.nextInt(3);
        v=null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      spravka.setVisible(true);
      spravka.text.setText(spravka.spravkaAboutProramFromMainMenu);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        spravka.setVisible(true);
        spravka.text.setText(spravka.spravkaAboutMainMenu);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         playButtonSoundsShoot();

        DiaryBook db = new DiaryBook();
        db.showFrame(this);
        db=null;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        playButtonSoundsShoot();

        Compliments k = new Compliments();
        k.showFrame(this);
        k=null;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed1(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed1
    {//GEN-HEADEREND:event_jButton1ActionPerformed1
        jLabel2.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\main_menu\\\\main_man_pos1_shoot.png"));
        playButtonSoundsShoot();
        gcd = new Game_Choice_Difficulty();
        gcd.setLocationRelativeTo(this);
        gcd.showFrame(this);        
        gcd = null;
    }//GEN-LAST:event_jButton1ActionPerformed1

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton18MouseEntered
    {//GEN-HEADEREND:event_jButton18MouseEntered
       jLabel2.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\main_menu\\\\main_man_pos2.png"));
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton18MouseExited
    {//GEN-HEADEREND:event_jButton18MouseExited

    }//GEN-LAST:event_jButton18MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseEntered
    {//GEN-HEADEREND:event_jButton1MouseEntered
      jLabel2.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\main_menu\\\\main_man_pos1.png"));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseExited
    {//GEN-HEADEREND:event_jButton1MouseExited
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton17MouseEntered
    {//GEN-HEADEREND:event_jButton17MouseEntered
      jLabel2.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\main_menu\\\\main_man_pos3.png"));
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton16MouseEntered
    {//GEN-HEADEREND:event_jButton16MouseEntered
      jLabel2.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\main_menu\\\\main_man_pos4.png"));
    }//GEN-LAST:event_jButton16MouseEntered

    public static void main(String args[]) throws InterruptedException, InvocationTargetException {
        
        Splash ss = new Splash();
        Result result = new Result();
        
        
      
        

                  
                    Show_GIF.addGif();
                    
                    result.addResultPoints();
                    
                    
                    Sound_Player.addBadSounds();
                    Sound_Player.addButtonSounds();
                    Sound_Player.addGoodSounds();
                    Sound_Player.addSoundsForGame();    
                    
                     Training.addBadKom();
                     Training.addGoodKom();
                     Training.addEasyQuestions();
                     Training.addMediumQuestions();
                     Training.addHardQuestions();
                    
                    
//                    Viktorina_Questions.addQuestionsFromLife();
                    Viktorina_Questions.addZagadki();
                    Viktorina_Questions.addQuestionsFunny();
        
//                    Viktorina_Questions.addAnswerFromLife();
                    Viktorina_Questions.addAnswerZagadki();
                    Viktorina_Questions.addAnswerFunny();
                    
                    Background.startSplash();
                      ss.setVisible(true);
                    
                    Sound_Player.playMusic("src\\\\Materials\\\\Sounds\\\\other\\\\на заставку.mp3");
                    
                    ss.setVisible(false);
                    ss = null;
                    
                  
                    
                    
                    
                    
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(new NoireLookAndFeel());
                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(MainMenu.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        invokeLater(() ->
          {
            new MainMenu().setVisible(true);
          });


    }
    
    private void createReg(){
   
String[] options = {"OK"};
JPanel panel = new JPanel();
JLabel lbl = new JLabel("Назови себя, парень!: ");
JTextField txt = new JTextField(10);
panel.add(lbl);
panel.add(txt);
int selectedOption = JOptionPane.showOptionDialog(null, panel, "Здорова, братуха!!", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
  
if(selectedOption == 0)
{    
        if(txt.getText().equals(""))
        {
               JOptionPane.showMessageDialog(MainMenu.this, "Раз ты хочешь быть анонимом, что ж так тому и быть...","Твой выбор!",JOptionPane.OK_OPTION);
               NAME = "Аноним!";
        }
        else
        {
        NAME = txt.getText();
        }
    }
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel MainMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
