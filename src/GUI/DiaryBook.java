
package GUI;


import Classes.AbstractDiaryBook;
import GameUtilities.Background;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static javax.swing.JFileChooser.APPROVE_OPTION;


public class DiaryBook extends BaseChildFrame {
    
    
    AbstractDiaryBook adb = new AbstractDiaryBook();
    
    ReadAndChange rac = new ReadAndChange();
    
    
    ArrayList<String> questions; 
    
    Iterator it;
    public void addQuestions()
      {
        questions.add("Ну расскажи мне, друже, что тебе запомнилось за сегодня?");
        questions.add("Что ты сделал полезного для себя?");
        questions.add("Чему ты научился за сегодня?");
        questions.add("Какие поступки ты совершал, и к чему они могут привести?");
        questions.add("Может есть такие люди, которые тебе запомнились сегодня? ");
        questions.add("Подумай, какой опыт ты получил за этот день?");
        questions.add("Что надо сделать для того, чтобы ты добился лучшего?");
       
      }
    
    int a = 0;
//для чтение из файла.
   public static String selectedFile;
    
    
    public DiaryBook()
      {
        
        initComponents();
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("222.png")));
        questions = new ArrayList<>(); 
        addQuestions();
        it = questions.iterator();
        
        Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\dnevnik_back.mp3");
        
        
        
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jRadioButton1 = new javax.swing.JRadioButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        question = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        saveAnswer = new javax.swing.JButton();
        open = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        jFileChooser1.setCurrentDirectory(new File("C:\\"));

            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            setTitle("Твой личный дневник!");
            setResizable(false);

            jPanel1.setAlignmentX(0.0F);
            jPanel1.setAlignmentY(0.0F);
            jPanel1.setOpaque(false);

            back.setBackground(new java.awt.Color(0, 102, 102));
            back.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
            back.setForeground(new java.awt.Color(0, 255, 255));
            back.setText("Вернуться назад<<");
            back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            back.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backActionPerformed(evt);
                }
            });

            jLabel6.setOpaque(true);

            jButton2.setBackground(new java.awt.Color(51, 51, 51));
            jButton2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
            jButton2.setForeground(new java.awt.Color(220, 240, 246));
            jButton2.setText("Нажми, чтобы я спросила тебя...");
            jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            question.setBackground(new java.awt.Color(255, 255, 255));
            question.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
            question.setForeground(new java.awt.Color(0, 0, 153));
            question.setText("Здравствуй, жиганчик! Я буду вести твой дневник.");
            question.setOpaque(true);

            answer.setColumns(5);
            answer.setLineWrap(true);
            answer.setRows(4);
            answer.setWrapStyleWord(true);
            jScrollPane1.setViewportView(answer);

            jLabel7.setText(" Здесь ты можешь написать ответ на вопрос:");

            saveAnswer.setBackground(new java.awt.Color(0, 153, 204));
            saveAnswer.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
            saveAnswer.setForeground(new java.awt.Color(255, 255, 255));
            saveAnswer.setText("Сохранить запись в дневник!");
            saveAnswer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    saveAnswerActionPerformed(evt);
                }
            });

            open.setBackground(new java.awt.Color(0, 153, 204));
            open.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
            open.setForeground(new java.awt.Color(255, 255, 255));
            open.setText("Посмотреть записи!");
            open.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    openActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 482, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(saveAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addComponent(saveAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
            );

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/diary.png"))); // NOI18N
            jLabel1.setText("jLabel1");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        Background.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\dnevnik_buttons-saveandlook.mp3");
        File f = new File("Дневник настоящего мужика");
            jFileChooser1.setCurrentDirectory(f);
             jFileChooser1.setMultiSelectionEnabled(false);

               
            
            int result = jFileChooser1.showOpenDialog(this);
            if(result == APPROVE_OPTION)//если нажата клавиша ок.
            {
                 DiaryBook.selectedFile = jFileChooser1.getSelectedFile().getAbsolutePath();  
               
                try {
                    rac.setVisible(true);
                    FileReader reader = new FileReader(selectedFile);
                    rac.myText.read(reader,selectedFile);
                            
                } catch (IOException ex) {
                    getLogger(DiaryBook.class.getName()).log(SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_openActionPerformed

    private void saveAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAnswerActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\dnevnik_buttons-saveandlook.mp3");
        
        try {
            adb.newRecord();
            adb.writeToFileDate();
            adb.writeToFile(this.question.getText(), this.answer.getText());
        } catch (IOException ex) {
            getLogger(DiaryBook.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveAnswerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\dnevnik_button-vopros.mp3");
        
        if(it.hasNext())
        {
            question.setText((String)it.next());
        }
        else
        {
            question.setText("Теперь, если хочешь, можешь написать просто свои мысли!");
        }
        try {

            adb.createDirectory();
            adb.createNewFile();

            answer.setText("");
        } catch (IOException ex) {
            Logger.getLogger(DiaryBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        MainMenu mm = new MainMenu();        
        mm.showFrame(this);
        mm = null;
        Sound_Player.stopMusic();
    }//GEN-LAST:event_backActionPerformed

  
    
    
//    public static void main(String args[])
//      {
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
//            java.util.logging.Logger.getLogger(DiaryBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DiaryBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DiaryBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DiaryBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run()
//              {
//                new DiaryBook().setVisible(true);
//              }
//        });
//      }

 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton open;
    private javax.swing.JLabel question;
    private javax.swing.JButton saveAnswer;
    // End of variables declaration//GEN-END:variables
}
