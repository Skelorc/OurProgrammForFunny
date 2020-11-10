
package Game.GUI;

import GUI.BaseChildFrame;
import GUI.MainMenu;
import static Game.GUI.Game_Adventure.level;
import GameUtilities.Background;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;

/**
 *
 * @author Skel&Targarian
 */
public class End_Level extends BaseChildFrame {

   
    public End_Level()
      {                
        initComponents();
        Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\end_level_back.mp3");
        bad_End_Game.setFont(MainMenu.customFont);
         this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bad_End_Game = new javax.swing.JTextArea();
        goodEndGame = new javax.swing.JButton();
        badEndGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ну посмотрим, куда привел твой ответ...");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bad_End_Game.setEditable(false);
        bad_End_Game.setColumns(20);
        bad_End_Game.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        bad_End_Game.setLineWrap(true);
        bad_End_Game.setRows(5);
        bad_End_Game.setWrapStyleWord(true);
        jScrollPane1.setViewportView(bad_End_Game);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 230));

        goodEndGame.setBackground(new java.awt.Color(0, 102, 0));
        goodEndGame.setForeground(new java.awt.Color(255, 255, 255));
        goodEndGame.setText("Отлично, давай дальше!!!");
        goodEndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodEndGameActionPerformed(evt);
            }
        });
        jPanel1.add(goodEndGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 180, 70));

        badEndGame.setBackground(new java.awt.Color(204, 0, 0));
        badEndGame.setForeground(new java.awt.Color(255, 255, 255));
        badEndGame.setText("Начать заново");
        badEndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badEndGameActionPerformed(evt);
            }
        });
        jPanel1.add(badEndGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 69));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/end_level.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void badEndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badEndGameActionPerformed
       Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\end_level_back_button.mp3");
        Game_Adventure ga = new Game_Adventure();
        ga.setVisible(true);
        this.close(this);
        ga = null;
        Sound_Player.stopMusic();
    }//GEN-LAST:event_badEndGameActionPerformed

    private void goodEndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodEndGameActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\end_level_back_button.mp3");
        if(level<=8)
        {
            QuestionsAfterLevels qal = new QuestionsAfterLevels();
            qal.setVisible(true);
            this.close(this);
            qal = null;
        }
        else
        {
            Game_Final gf = new Game_Final();
            gf.setVisible(true);
            this.close(this);
            gf = null;
            Sound_Player.stopMusic();
        }
    }//GEN-LAST:event_goodEndGameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//      {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(End_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(End_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(End_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(End_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run()
//              {
//                new End_Game().setVisible(true);
//              }
//        });
//      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton badEndGame;
    public javax.swing.JTextArea bad_End_Game;
    public javax.swing.JButton goodEndGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
