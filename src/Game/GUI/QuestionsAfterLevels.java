/*

 */
package Game.GUI;

import GUI.BaseChildFrame;
import GUI.MainMenu;
import Game.QuestionsForLevel.*;
import GameUtilities.Background;
import GameUtilities.Key_Listener;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;
import static java.awt.event.KeyEvent.VK_ENTER;
import static jdk.nashorn.internal.objects.NativeString.trim;


/**
 *
 * @author Skel&Targarian
 */
public class QuestionsAfterLevels extends BaseChildFrame {

    Key_Listener key_Listener = new Key_Listener();
    public Questions_For_Level_1 qChapter;
    
  
    
    public QuestionsAfterLevels()
      {
        createViktorinaForGame();
        initComponents();
        start.requestFocus(true);
        Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\questions_after_level_back.mp3");
        textMain.setFont(MainMenu.customFont);
       this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
        
        
        
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        start = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaForQuestion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textMain = new javax.swing.JTextArea();
        areaForAnswer = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        back = new javax.swing.JButton();
        kommentari = new javax.swing.JTextField();
        nextLevel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Проверим твою внимательность!");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Ты прошёл уровень. А теперь посмотрим, насколько ты был внимателен! Я задам тебе несколько вопросов, по пройденному тобой, приключению. Без правильных ответов, дальше путь закрыт. Все ответы писать в им. падеже и ед.числе, без точки на конце ответа.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 65, 0, 0));

        start.setBackground(new java.awt.Color(51, 51, 51));
        start.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        start.setForeground(new java.awt.Color(102, 255, 0));
        start.setText("Давай вопрос!");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 179, 154, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        areaForQuestion.setEditable(false);
        areaForQuestion.setColumns(20);
        areaForQuestion.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        areaForQuestion.setLineWrap(true);
        areaForQuestion.setRows(5);
        areaForQuestion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaForQuestion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 159, 306, 67));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Здесь пиши ответ:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 218, 138, 32));

        textMain.setEditable(false);
        textMain.setColumns(20);
        textMain.setLineWrap(true);
        textMain.setRows(5);
        textMain.setText("Ты прошёл уровень! Теперь посмотрим, насколько ты был внимателен! \nЯ задам тебе несколько вопросов, по пройденному тобой, приключению. Без правильных ответов дальше путь закрыт.\nВсе ответы писать в им.падеже и ед.числе, без точки в конце ответа!\n\n");
        textMain.setWrapStyleWord(true);
        textMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textMain.setFocusable(false);
        textMain.setHighlighter(null);
        textMain.setOpaque(false);
        textMain.setRequestFocusEnabled(false);
        textMain.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(textMain);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 480, 110));

        areaForAnswer.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        areaForAnswer.setForeground(new java.awt.Color(51, 255, 255));
        areaForAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                areaForAnswerFocusGained(evt);
            }
        });
        jPanel1.add(areaForAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 244, 263, -1));

        check.setBackground(new java.awt.Color(51, 51, 51));
        check.setForeground(new java.awt.Color(102, 255, 0));
        check.setText("Проверить!");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel1.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 275, 104, -1));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setForeground(new java.awt.Color(51, 255, 255));
        back.setText("<< Начать пройденный уровень заново ");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        kommentari.setEditable(false);
        kommentari.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        kommentari.setForeground(new java.awt.Color(102, 255, 0));
        kommentari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kommentariActionPerformed(evt);
            }
        });
        jPanel1.add(kommentari, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 337, 347, -1));

        nextLevel.setBackground(new java.awt.Color(51, 51, 51));
        nextLevel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        nextLevel.setForeground(new java.awt.Color(51, 255, 255));
        nextLevel.setText("Погнали дальше!!!");
        nextLevel.setVisible(false);
        nextLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelActionPerformed(evt);
            }
        });
        jPanel1.add(nextLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 380, 166, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/questions_after_level.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 536, 448));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelActionPerformed
        Sound_Player.stopMusic();
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\questions_after_level-button-pognali.mp3");
        Game_Adventure game = new Game_Adventure();
        game.setVisible(true);
        game = null;
        this.setVisible(false);
    }//GEN-LAST:event_nextLevelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Sound_Player.stopMusic();
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\questions_after_level-button-nazad.mp3");
        Game_Adventure game = new Game_Adventure();
        game.setVisible(true);
        game = null;
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        checkAnswer();       
    }//GEN-LAST:event_checkActionPerformed

    private void areaForAnswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaForAnswerFocusGained
        
        
        
        if(evt.equals(VK_ENTER))
        {
            if(checkAnswer()==true)
            {
            check.requestFocus(false);
            start.requestFocus(true);
            
            
//            areaForAnswer.removeKeyListener(key_Listener);
            }
            else{
               
                
            }
        }
    }//GEN-LAST:event_areaForAnswerFocusGained

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\questions_after_level_button-vopros.mp3");
        areaForAnswer.addKeyListener(key_Listener);
        key_Listener.a = check;
        key_Listener.z = check;
        if(qChapter.sortQuestions()==null)
        {
            start.setEnabled(false);
            check.setEnabled(false);
            back.setEnabled(false);
            areaForAnswer.setText("");
            areaForQuestion.setText("Ну всё, красавчик, " + MainMenu.NAME + ", ты ответил на все вопросы! Если готов дальше, жми кнопку ниже!" );
            kommentari.setText("");
            areaForAnswer.setEditable(false);
            nextLevel.setVisible(true);
            Game_Adventure.level++;
        }
        else
        {
            areaForQuestion.setText(qChapter.getQuestions());
            areaForAnswer.setText("");
            areaForAnswer.requestFocus();
            check.setEnabled(true);
            kommentari.setText("");
            start.setEnabled(false);
        }
    }//GEN-LAST:event_startActionPerformed

    private void kommentariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kommentariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kommentariActionPerformed

//метод для проверки правильности ответов на вопросы 
public Boolean checkAnswer()
  {   
       Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\questions_after_level_button-proverit.mp3");

       if(qChapter.getAnswers().equalsIgnoreCase(trim(areaForAnswer.getText())))
    {      
      kommentari.setText(qChapter.sortGoodKommentarii());
      check.setEnabled(false);
      start.setEnabled(true);
      qChapter.number++;
      return true;
      
    }     
    else
            {  
               areaForAnswer.requestFocus(true);
               kommentari.setText(qChapter.sortBadKommentarii());  
               return false;
            }
   }

  public void createViktorinaForGame()
      {
        switch(Game_Adventure.level)
        {
            case 1:
                qChapter = new Questions_For_Level_1();        
                qChapter.addElementsToTheCollections();
                break;
            case 2:
                qChapter = new Questions_For_Level_2();              
                qChapter.addElementsToTheCollections();
                break;
            case 3:
                qChapter = new Questions_For_Level_3();
                qChapter.addElementsToTheCollections();
                break;
            case 4:
                qChapter = new Questions_For_Level_4();
                qChapter.addElementsToTheCollections();
                break;
            case 5:
                qChapter = new Questions_For_Level_5();
                qChapter.addElementsToTheCollections();
                break;
            case 6:
                qChapter = new Questions_For_Level_6();
                qChapter.addElementsToTheCollections();
                break;
            case 7:
                qChapter = new Questions_For_Level_7();
                qChapter.addElementsToTheCollections();
                break;
            case 8:
                qChapter = new Questions_For_Level_8();
                qChapter.addElementsToTheCollections();
                break;
                
                
                
        }
      }
      
//    
//    public static void main(String args[])
//      {
//        
//        
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
//            java.util.logging.Logger.getLogger(QuestionsAfterLevels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuestionsAfterLevels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuestionsAfterLevels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuestionsAfterLevels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//      
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run()
//              {
//                new QuestionsAfterLevels().setVisible(true);
//              }
//        });
//      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaForAnswer;
    private javax.swing.JTextArea areaForQuestion;
    private javax.swing.JButton back;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField kommentari;
    private javax.swing.JButton nextLevel;
    private javax.swing.JButton start;
    private javax.swing.JTextArea textMain;
    // End of variables declaration//GEN-END:variables
}
