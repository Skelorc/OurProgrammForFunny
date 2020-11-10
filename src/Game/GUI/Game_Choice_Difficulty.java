
package Game.GUI;

import GUI.BaseChildFrame;
import GUI.MainMenu;
import GameUtilities.Background;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;
import javax.swing.ButtonGroup;


public class Game_Choice_Difficulty extends BaseChildFrame {

    public static int speedGame = 0;
    Training sg;
    ButtonGroup bg = new ButtonGroup();
    
    public Game_Choice_Difficulty()
        {
        
          
            initComponents();
            bg.add(easyButton);
            bg.add(mediumButton);
            bg.add(hardButton);
            bg.clearSelection();
            bg.setSelected(bg.getSelection(), true);
            this.requestFocus();
            start.setEnabled(false);
            easyButton.setFont(MainMenu.customFont);
            mediumButton.setFont(MainMenu.customFont);
            hardButton.setFont(MainMenu.customFont);
            start.setFont(MainMenu.customFont);
            Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_choice_difficulty_back.mp3");
            this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton jButton1 = new javax.swing.JButton();
        easyButton = new javax.swing.JRadioButton();
        hardButton = new javax.swing.JRadioButton();
        mediumButton = new javax.swing.JRadioButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();
        start = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Выбери сложность, мальчуган!");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Назад");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        easyButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        easyButton.setText("НОВИЧОК");
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(easyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 100, 30));

        hardButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        hardButton.setText("ПРОФЕССИОНАЛ");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(hardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 150, -1));

        mediumButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        mediumButton.setText("ЛЮБИТЕЛЬ");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mediumButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 120, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Выбери уровень сложности:");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 0));

        start.setBackground(new java.awt.Color(51, 51, 51));
        start.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("Погнали!");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/d906948b2d2bf7816adba220824f5ab4.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/game_choice_difficulty.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hardButtonActionPerformed
    {//GEN-HEADEREND:event_hardButtonActionPerformed
      Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_choice_difficulty_radiobutton.mp3");
      start.setEnabled(true);
      speedGame = 350;
      Training.numberListQuestions = 3;
    }//GEN-LAST:event_hardButtonActionPerformed

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mediumButtonActionPerformed
    {//GEN-HEADEREND:event_mediumButtonActionPerformed
        Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_choice_difficulty_radiobutton.mp3");
        start.setEnabled(true);
         speedGame = 400;
         Training.numberListQuestions = 2;
    }//GEN-LAST:event_mediumButtonActionPerformed

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_easyButtonActionPerformed
    {//GEN-HEADEREND:event_easyButtonActionPerformed
      Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_choice_difficulty_radiobutton.mp3");
      start.setEnabled(true);
      speedGame = 500;
      Training.numberListQuestions = 1;

    }//GEN-LAST:event_easyButtonActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startActionPerformed
    {//GEN-HEADEREND:event_startActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_choice_difficulty_button-pognaly.mp3");
      
        if(easyButton.isSelected())
        {
           sg = new Training();
           sg.showFrame(this);
           sg = null;
            Training.startPractice.setEnabled(true);
            Training.startPractice.requestFocus();
        }
        else if(mediumButton.isSelected())
        {   sg = new Training();         
            sg.showFrame(this);
            sg = null;
             Training.startPractice.setEnabled(true);
             Training.startPractice.requestFocus();
        }
        else if(hardButton.isSelected())
        {
            sg = new Training();
            sg.showFrame(this);
            sg = null;
             Training.startPractice.setEnabled(true);
             Training.startPractice.requestFocus();
        }
       
        
    }//GEN-LAST:event_startActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
      Sound_Player.stopMusic();
      this.close(this);
      MainMenu mm = new MainMenu();
      mm.setVisible(true);
      mm = null;
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//        {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try
//          {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//              {
//                if ("Nimbus".equals(info.getName()))
//                  {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                  }
//              }
//          }
//        catch (ClassNotFoundException ex)
//          {
//            java.util.logging.Logger.getLogger(Game_Choice_Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//          }
//        catch (InstantiationException ex)
//          {
//            java.util.logging.Logger.getLogger(Game_Choice_Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//          }
//        catch (IllegalAccessException ex)
//          {
//            java.util.logging.Logger.getLogger(Game_Choice_Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//          }
//        catch (javax.swing.UnsupportedLookAndFeelException ex)
//          {
//            java.util.logging.Logger.getLogger(Game_Choice_Difficulty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//          }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(() ->
//          {
//            new Game_Choice_Difficulty().setVisible(true);
//          });
//        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JRadioButton easyButton;
    javax.swing.JRadioButton hardButton;
    javax.swing.JRadioButton mediumButton;
    javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
