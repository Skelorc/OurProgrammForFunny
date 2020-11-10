package GUI;

import Classes.Proverka;
import GameUtilities.Key_Listener;
import GameUtilities.Show_GIF;
import static GameUtilities.Show_GIF.closeGif;
import static Viktorina.all.Viktorina_Questions.answerFunny;
import static Viktorina.all.Viktorina_Questions.answerZagadki;
import static Viktorina.all.Viktorina_Questions.questionsFunny;
import static Viktorina.all.Viktorina_Questions.zagadki;
import GameUtilities.Sound_Player;
import static GameUtilities.Sound_Player.playButtonSoundsBack;
import static GameUtilities.Sound_Player.stopMusic;
import static java.awt.Toolkit.getDefaultToolkit;
import static GameUtilities.Background.playMusic;


public class Viktorina extends BaseChildFrame {
    MainMenu mm = new MainMenu();
    Proverka proverka= new Proverka();    
    Rezultat magaz = new Rezultat();
    Show_GIF sg = new Show_GIF(); 
    Spravka spravka = new Spravka();
    Sound_Player player = new Sound_Player();
    Key_Listener kl;
    //проверка, открыта ли справка.
    boolean instance = false;
    //количество правильных ответов.
    public static int points = 0;
    public int n; 
    public boolean trueAnswer;
    
 
    
    public Viktorina()
      {
        initComponents();
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("444.png")));
        jLabel2.setText(MainMenu.NAME+", Здорова!");
        kl = new Key_Listener();
        
        
        welcome.setFont(MainMenu.customFont);
        
        welcome.setText("Приветствую тебя, " + MainMenu.NAME + "! Готов ли ты проверить свои умственные способности?!"
                + "Мы подготовили для тебя несколько разных направлений вопросов! Попробуй на них ответить!");
    
      }

    /**
    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        choiceTheme = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaForQuestion = new javax.swing.JTextArea();
        areaForAnswer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        welcome = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        timeAnswer = new javax.swing.JLabel();
        //
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Тестируем твои мозги!");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Выбери тему для вопросов:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 115, -1, 30));

        choiceTheme.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        choiceTheme.setMaximumRowCount(3);
        choiceTheme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Пошевели мозгами!", "Ответь - ка мне!" }));
        choiceTheme.setToolTipText("Выбрать тему");
        choiceTheme.setOpaque(false);
        choiceTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceThemeActionPerformed(evt);
            }
        });
        getContentPane().add(choiceTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 20));

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Посмотреть результаты!");
        jButton4.setToolTipText("Нажми, чтобы узнать результаты!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 190, 30));

        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 0, -1, 491));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 491));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("В главное меню<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Получить вопрос");
        jButton2.setToolTipText("Нажми на меня, чтобы появился вопрос!");
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 50));

        areaForQuestion.setEditable(false);
        areaForQuestion.setColumns(20);
        areaForQuestion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        areaForQuestion.setLineWrap(true);
        areaForQuestion.setRows(3);
        areaForQuestion.setText("Здесь будет вопрос");
        areaForQuestion.setWrapStyleWord(true);
        areaForQuestion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane3.setViewportView(areaForQuestion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 315, 72));

        areaForAnswer.setEditable(false);
        areaForAnswer.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        areaForAnswer.setText("Тут напиши свой ответ");
        areaForAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaForAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(areaForAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 315, 32));

        welcome.setEditable(false);
        welcome.setBackground(new java.awt.Color(60, 63, 65));
        welcome.setColumns(20);
        welcome.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        welcome.setLineWrap(true);
        welcome.setRows(5);
        welcome.setText("\n\n");
        welcome.setWrapStyleWord(true);
        welcome.setOpaque(false);
        jScrollPane1.setViewportView(welcome);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 300, 100));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Проверить ответ");
        jButton3.setToolTipText("Нажми, чтобы проверить правильность ответа!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 160, 40));

        timeAnswer.setBackground(new java.awt.Color(1, 38, 76));
        timeAnswer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/viktorina.png"))); // NOI18N
        timeAnswer.setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().add(timeAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 491));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24));
        jLabel2.setForeground(new java.awt.Color(234, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        //

        jMenu2.setText("Справка");

        jMenuItem1.setText("Справка");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        stopMusic();
        playButtonSoundsBack();
      mm.showFrame(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
      
     jButton3.setEnabled(true);
     
     areaForAnswer.setEditable(true);
     areaForAnswer.requestFocus(true);
     n++;
        stopMusic();
//        if(volume.isSelected())
//        {
//            
//        }else
//        {
//        playMusic("src\\\\Materials\\\\Sounds\\\\other\\\\thinking.mp3");
//        }
        closeGif();    
    
           
                switch (choiceTheme.getSelectedIndex()) {
                    case 0:
//                        if(questionsFromLife.isEmpty() )
//                        {
//                            areaForQuestion.setText("Ты ответил на все вопросы! Попробуй теперь что - нибудь другое, если не боишься!!!:))");
//                            areaForAnswer.setText("");
//                            jButton3.setEnabled(false);
//                            return;
//                        }
//                        
//                        if(n >= questionsFromLife.size()&& n >= answerFromLife.size())
//                        {
//                            n = 0;
//                        }
//                        proverka.vyvod(questionsFromLife, areaForQuestion, areaForAnswer, n);
//                        jButton2.requestFocus(true);
//                        break;
                        
                        if(zagadki.isEmpty())
                        {
                            areaForQuestion.setText("Ты ответил на все загадки! Думаешь, у тебя получится справиться с вопросами,а "+MainMenu.NAME+"?!");
                            areaForAnswer.setText("");
                            jButton3.setEnabled(false);
                            return;
                        }
                        
                        if(n >= zagadki.size()&& n >= answerZagadki.size())
                        {
                            n = 0;
                        }
                        proverka.vyvod(zagadki, areaForQuestion, areaForAnswer, n);
                        jButton2.requestFocus(true);
                        
                        
                        break;
                    case 1:
                        
                         if(questionsFunny.isEmpty())
                        {
                            areaForQuestion.setText(MainMenu.NAME+", твоя воля к победе просто неиссякаема! Ты ответил на все вопросы! А сможешь также легко ответить на загадки?");
                            areaForAnswer.setText("");
                            jButton3.setEnabled(false);
                            return;
                        }
                        if(n >= questionsFunny.size() && n >= answerFunny.size())
                        {
                            n = 0;
                        }
                        proverka.vyvod(questionsFunny, areaForQuestion, areaForAnswer, n);
                        jButton2.requestFocus(true);
                        break;  
                        
//                    case 2:   
                        
                    default:
                        areaForQuestion.setText("Пожалуйста, выбери тему для вопросов!");
                        break;
                                          
                          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void areaForAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_areaForAnswerActionPerformed
    {//GEN-HEADEREND:event_areaForAnswerActionPerformed
          
     
    }//GEN-LAST:event_areaForAnswerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        closeGif();
        stopMusic();
      switch(choiceTheme.getSelectedIndex())
                {
                    case 0:
//                        proverka.proverka(questionsFromLife, answerFromLife, n, areaForQuestion, areaForAnswer,jButton3);
//                        break;
                        proverka.proverka(zagadki, answerZagadki, n, areaForQuestion, areaForAnswer,jButton3);
                        break;
                        
                    case 1:
                         proverka.proverka(questionsFunny, answerFunny, n, areaForQuestion, areaForAnswer,jButton3);
                        break;
//                    case 2:
                       
                    default:
                        areaForAnswer.setText("что - то тут не понятно совсем!");
                        areaForQuestion.setText("ОШИБКА!!!");
                       
                }
                
    }//GEN-LAST:event_jButton3ActionPerformed
      
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
       
        spravka.setVisible(true);
        spravka.text.setText(spravka.spravkaForViktorina);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void choiceThemeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_choiceThemeActionPerformed
    {//GEN-HEADEREND:event_choiceThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceThemeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        stopMusic();
        playButtonSoundsBack();
      magaz.showFrame(this);
    }//GEN-LAST:event_jButton4ActionPerformed

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
//            java.util.logging.Logger.getLogger(Viktorina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Viktorina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Viktorina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Viktorina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run()
//              {
//                new Viktorina().setVisible(true);
//              }
//        });
//      }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaForAnswer;
    private javax.swing.JTextArea areaForQuestion;
    private javax.swing.JComboBox<String> choiceTheme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel timeAnswer;
    private javax.swing.JTextArea welcome;
    // End of variables declaration//GEN-END:variables
}
