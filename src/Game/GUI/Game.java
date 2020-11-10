/*
Сыграй в это чудо, братка!
 */
package Game.GUI;

import GUI.BaseChildFrame;
import GUI.MainMenu;
import Game.Chapters.*;
import GameUtilities.Background;
import GameUtilities.Key_Listener;
import static Game.GUI.Game.answer1;
import static Game.GUI.Game.answer2;
import static Game.GUI.Game.answer3;
import GameUtilities.Sound_Player;
import java.awt.Color;
import static java.awt.Toolkit.getDefaultToolkit;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Skel&Targarian
 */
public class Game extends BaseChildFrame {
    
    
Game_Chapter_1 gChapter;
Key_Listener key_Listener = new Key_Listener();
End_Level beg;
Game_Adventure ga;


//эта цифра отвечает за выбранный пользователем ответ.
    public static int numberAnswer;
    
//номер ячейки для вывода отрицательных комментариев.
    public static int numBadWords = 0;
    
    

    

  
    public Game()
      {
        initComponents();
        
        
        createNextChapter(); 
        Background.playMusic(gChapter.setNameMusic());
        stopAnswer.setEnabled(false);
         
         viktorinaForGame.setVisible(false);
         areaForAnswerUser.setTransferHandler(null);
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
      }

  
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        viktorinaForGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        answer1 = new javax.swing.JRadioButton();
        answer2 = new javax.swing.JRadioButton();
        answer3 = new javax.swing.JRadioButton();
        answerNPC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        areaForAnswerUser = new javax.swing.JTextField();
        stopAnswer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JProgressBar();
        startAnswer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back_font = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ситуация из жизни...");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Здесь реальная жизнь, всё по - взрослому:)! Мы попробуем сгонять к твоей девушке в гости на пару чашек чая:). Для того, чтобы отправиться в путь нажми на кнопку ниже.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 0, 0));

        viktorinaForGame.setBackground(new Color(0, 204, 255));
        viktorinaForGame.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        viktorinaForGame.setText("Нажми, чтобы продолжить!");
        viktorinaForGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viktorinaForGameActionPerformed(evt);
            }
        });
        jPanel1.add(viktorinaForGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 560, 110));

        jLabel1.setText("Варианты ответов:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 400, 40));

        answer1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer1.setText("...");
        answer1.setEnabled(false);
        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });
        jPanel1.add(answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 470, 30));

        answer2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer2.setText("...");
        answer2.setEnabled(false);
        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });
        jPanel1.add(answer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 470, 30));

        answer3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answer3.setText("...");
        answer3.setEnabled(false);
        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });
        jPanel1.add(answer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 470, 30));

        answerNPC.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        answerNPC.setForeground(new Color(0, 0, 102));
        answerNPC.setRequestFocusEnabled(false);
        jPanel1.add(answerNPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 380, 80));

        jLabel2.setText("Здесь пиши ответ, который выбрал:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 30));

        areaForAnswerUser.setEditable(false);
        areaForAnswerUser.setForeground(new Color(255, 255, 255));
        areaForAnswerUser.setText("Пиши сюда то, что выбрал и не тормози, иначе встрянешь!");
        areaForAnswerUser.setToolTipText("Пиши ответ, да по - быстрее!!!");
        areaForAnswerUser.setBorder(null);
        areaForAnswerUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                areaForAnswerUserFocusGained(evt);
            }
        });
        areaForAnswerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaForAnswerUserActionPerformed(evt);
            }
        });
        jPanel1.add(areaForAnswerUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 460, 40));

        stopAnswer.setBackground(new Color(0, 102, 204));
        stopAnswer.setForeground(new Color(255, 255, 255));
        stopAnswer.setText("Ответить!");
        stopAnswer.setEnabled(false);
        stopAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(stopAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel3.setText("На что тебе отвечают:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 0, 10));

        jSlider1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jSlider1.setForeground(new Color(153, 255, 153));
        jSlider1.setFocusable(false);
        jSlider1.setRequestFocusEnabled(false);
        jSlider1.setStringPainted(true);
        jSlider1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 150, 20));

        startAnswer.setBackground(new Color(0, 102, 204));
        startAnswer.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        startAnswer.setForeground(new Color(255, 255, 255));
        startAnswer.setText("Жми Пробел, если готов!");
        startAnswer.setEnabled(false);
        startAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(startAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        jButton1.setBackground(new Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("<<В главное меню");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(back_font, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answer2ActionPerformed
    {//GEN-HEADEREND:event_answer2ActionPerformed
          Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_button-radiobuttonl.mp3");
        if(answer2.isSelected())
        {
            answer1.setSelected(false);
            answer3.setSelected(false);
            startAnswer.requestFocus();
            startAnswer.setEnabled(true);
            numberAnswer = 1;
            answer2.setEnabled(false);
            answer1.setEnabled(true);
            answer3.setEnabled(true);
            
        }
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answer3ActionPerformed
    {//GEN-HEADEREND:event_answer3ActionPerformed
         Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_button-radiobuttonl.mp3");
        if(answer3.isSelected())
        {
            answer1.setSelected(false);
            answer2.setSelected(false);
            startAnswer.requestFocus();
            startAnswer.setEnabled(true);
            numberAnswer = 2;
            answer3.setEnabled(false);
            answer1.setEnabled(true);
            answer2.setEnabled(true);
        }
    }//GEN-LAST:event_answer3ActionPerformed

    private void startAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startAnswerActionPerformed
    {//GEN-HEADEREND:event_startAnswerActionPerformed
      Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_button-probel.mp3");
      areaForAnswerUser.setText("");
      answerNPC.setText("");
      hideButtons();
      areaForAnswerUser.setEditable(true);
      areaForAnswerUser.requestFocus(true);
      stopAnswer.setEnabled(true);
      Background.startGame(jSlider1,gChapter.answerAdventure , areaForAnswerUser, numberAnswer);
      startAnswer.setEnabled(false);
    }//GEN-LAST:event_startAnswerActionPerformed

    private void hideButtons()
      {
        answer1.setEnabled(false);
        answer2.setEnabled(false);
        answer3.setEnabled(false);
      }

    private void areaForAnswerUserFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_areaForAnswerUserFocusGained
    {//GEN-HEADEREND:event_areaForAnswerUserFocusGained
      key_Listener.a = startAnswer;
      key_Listener.z = stopAnswer;
      areaForAnswerUser.addKeyListener(key_Listener);
      if(evt.equals(VK_ENTER))
        {
            
            areaForAnswerUser.removeKeyListener(key_Listener);
        }
    }//GEN-LAST:event_areaForAnswerUserFocusGained

    private void stopAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_stopAnswerActionPerformed
    {//GEN-HEADEREND:event_stopAnswerActionPerformed
        Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_button_otvet.mp3"); 
        openedButtons();
       Background.stopGame();
      startAnswer.setEnabled(true);
      startAnswer.requestFocus(true);
     //сравниваем правильность написания ответа, тот который выбран, и тот который пользователь написал.
         if(areaForAnswerUser.getText().equalsIgnoreCase(trim(gChapter.answerAdventure.get(numberAnswer))))
      {      if(gChapter.checkAnswer(areaForAnswerUser.getText())!=null)
            {
                Sound_Player.stopMusic();
                beg = new End_Level();
                this.close(this);                
                beg.goodEndGame.setVisible(false);                
                startAnswer.setEnabled(false);
                clearButtons();
                jSlider1.setForeground(Color.green);
                jSlider1.setValue(0);  
                beg.setVisible(true); 
                Background.writeAnswerNPC(gChapter.checkAnswer(areaForAnswerUser.getText()), beg.bad_End_Game);
                beg = null;
                                  
            }
            else
            {
                Sound_Player.stopMusic();
                beg = new End_Level();
                this.close(this);
                beg.setVisible(true);
                beg.badEndGame.setVisible(false);
                     Background.writeAnswerNPC(String.valueOf(gChapter.getGoodAnswerNPC()), beg.bad_End_Game);

                    createNextChapter();
                beg = null;    
                  jSlider1.setForeground(Color.green);
                    jSlider1.setValue(0);      
            }
      }
         else if( numBadWords>=gChapter.getBadAnswerNPC())
           {     Sound_Player.stopMusic();
                 clearButtons();
                 endBadGame();
                 
           }
         else if ( numBadWords<=gChapter.getBadAnswerNPC())          
           {            
                       answerNPC.setText(gChapter.getBadAnswerNPC(numBadWords));
                       numBadWords++;
                      
           }        
       
           
       areaForAnswerUser.setEditable(false);
       stopAnswer.setEnabled(false);
       
      
    }//GEN-LAST:event_stopAnswerActionPerformed

    private void openedButtons()
      {
        answer1.setEnabled(true);
        answer2.setEnabled(true);
        answer3.setEnabled(true);
      }
       
    private void answer1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answer1ActionPerformed
    {//GEN-HEADEREND:event_answer1ActionPerformed
        Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\game_button-radiobuttonl.mp3");
        if(answer1.isSelected())
        {
            answer2.setSelected(false);
            answer3.setSelected(false);
            startAnswer.requestFocus();
            startAnswer.setEnabled(true);
            numberAnswer = 0;
            answer1.setEnabled(false);
            answer2.setEnabled(true);
            answer3.setEnabled(true);
        }
    }//GEN-LAST:event_answer1ActionPerformed

    private void viktorinaForGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viktorinaForGameActionPerformed
    {//GEN-HEADEREND:event_viktorinaForGameActionPerformed
       QuestionsAfterLevels qal = new QuestionsAfterLevels();
       Sound_Player.stopMusic();
       qal.setVisible(true);
       this.setVisible(false);
       qal = null;
    }//GEN-LAST:event_viktorinaForGameActionPerformed

    private void areaForAnswerUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_areaForAnswerUserActionPerformed
    {//GEN-HEADEREND:event_areaForAnswerUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaForAnswerUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JOptionPane pane = new JOptionPane();
        
        
        
        Object[] options = { "Да, тошнит уже от всего этого дерьма...", "Нет, я всё равно дойду до конца!!!" };
               int n = pane.showOptionDialog(null, "Выйти в главное меню? Весь пройденный прогресс пропадет!!!",
			"Подтверждение", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
              
               
               if(n==0)
               {
               MainMenu mm = new MainMenu();
               mm.setVisible(true);
               this.close(this);
               mm = null;
               Sound_Player.stopMusic();
               }
               else
               {
                   this.setVisible(true);
               }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

//Метод создающий новую часть игры. Чистит все поля и значения кнопок.
 private void createNewChapter()
      {
        startAnswer.setEnabled(false);
        areaForAnswerUser.setText("");
        stopAnswer.setEnabled(true);
        clearButtons();
        
      }
//очищает кнопки от текста. Делает кнопки не видимыми.
    private void clearButtons()
      {
        answer1.setText("");
        answer1.setEnabled(false);
        answer1.setSelected(false);
        answer2.setText("");
        answer2.setEnabled(false);
        answer2.setSelected(false);
        answer3.setText("");
        answer3.setEnabled(false);
        answer3.setSelected(false);
      }
//конец игры, выводит соответствующий текст, и передаёт фокус на старт.
    private void endBadGame()
      {         this.close(this);
                beg = new End_Level();
                beg.setVisible(true);
                beg.goodEndGame.setVisible(false);
                Background.writeAnswerNPC(String.valueOf(gChapter.getBadEndGame()), beg.bad_End_Game);
                beg = null;
              
      }
    
  
    
    public void createNextChapter()
      {
        switch(Game_Adventure.level)
        {
            case 1:
                gChapter = new Game_Chapter_1();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter1.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 2:
                gChapter = new Game_Chapter_2();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter2.png"));
                createNewChapter();
                numBadWords = 0;
                
                break;
            case 3:
                gChapter = new Game_Chapter_3();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter3.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 4:
                gChapter = new Game_Chapter_4();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter4.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 5:
                gChapter = new Game_Chapter_5();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter5.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 6:
                gChapter = new Game_Chapter_6();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter6.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 7:
                gChapter = new Game_Chapter_7();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter7.png"));
                createNewChapter();
                numBadWords = 0;
                break;
           case 8:
                gChapter = new Game_Chapter_8();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter8.png"));
                createNewChapter();
                numBadWords = 0;
                break;
            case 9:
                gChapter = new Game_Chapter_9();
                back_font.setIcon(new ImageIcon("src\\\\Materials\\\\JPG\\\\Chapter9.png"));
                createNewChapter();
                numBadWords = 0;
                break;         
        }
        gChapter.addElementsForCollections();
        gChapter.addGoodAnswerNPC();
        gChapter.addBadAnswerNPC();
        
        gChapter.addTextWithAdventure();
        gChapter.addAnswerAdventure();
        gChapter.addBadEndGame();
        gChapter.addWrongAnswer();
        gChapter.addWordsNPC();
        
      }

    
    
    
    
    
    
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
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new Game().setVisible(true);
//              }
//        });
//      }
 //добавление на кнопки текста ответов   
    public static void addTextToButton()
      {
        Game.answer1.setEnabled(true);
        Game.answer2.setEnabled(true);
        Game.answer3.setEnabled(true);
        
        Game.answer1.setText(Game_Chapter_1.answerAdventure.get(0));
        Game.answer2.setText(Game_Chapter_1.answerAdventure.get(1));
        Game.answer3.setText(Game_Chapter_1.answerAdventure.get(2));
           
       
      }
    

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton answer1;
    public static javax.swing.JRadioButton answer2;
    public static javax.swing.JRadioButton answer3;
    public static javax.swing.JLabel answerNPC;
    private javax.swing.JTextField areaForAnswerUser;
    private javax.swing.JLabel back_font;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton startAnswer;
    private javax.swing.JButton stopAnswer;
    private javax.swing.JButton viktorinaForGame;
    // End of variables declaration//GEN-END:variables

  
}
