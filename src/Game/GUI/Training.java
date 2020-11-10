/*
Здесь мы написали маленькую игру. Попробуй сыграть!
 */
package Game.GUI;

import GameUtilities.Background;
import GameUtilities.Key_Listener;
import Classes.Proverka;
import GUI.BaseChildFrame;
import GUI.Spravka;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.ArrayList;
import javax.swing.JProgressBar;





public class Training extends BaseChildFrame {
Object[] options = { "Да, хватит с меня...", "Нет, поехали дальше!!!" };
    Key_Listener ky = new Key_Listener();
    Proverka po = new Proverka();
    Spravka spravka = new Spravka();
    
    
    
    
    
//Номер сложности    
    static int numberListQuestions = 0;
//число ячейки коллекции для вывода вопроса.
    public static int n = 0;
    
    public static ArrayList<String> goodKom = new ArrayList<>();
    public static void addGoodKom()
    {
        goodKom.add("Молодчина, паря!");
        goodKom.add("Красава! Давай ещё!");
        goodKom.add("Четко! А ты не плох!");
        goodKom.add("Удивляешь меня!");
        goodKom.add("Стучи пальцами, как никогда не стучал!");
        goodKom.add("Черт возьми, ты действительно хочешь победить?");
        goodKom.add("Респект, пацанчик! Далеко пойдешь!");
        goodKom.add("Вот это ты конечно молоток! Забил уже столько гвоздей!");
        goodKom.add("Упорство и труд...Как там говорят, че то не помню? Короче, по красоте шагаешь!");
        goodKom.add("Бьешь по мордам врагов также быстро?");
    }
    
    public static ArrayList<String> badKom = new ArrayList<>();
    public static void addBadKom()
    {
        badKom.add("А ты не тормозок случаем?");
        badKom.add("ЛОПУХ!");
        badKom.add("Моя бабуля и та быстрее пишет на андроиде, чем ты на клаве!");
        badKom.add("Опять мимо...Ну это не удивительно, СЛАБАК!");
        badKom.add("ХА - ХА - ХА! И снова мимо, СЫНОК!");
        badKom.add("Че то кривовато, посмотри на плечи, может руки не с того места растут?");
        badKom.add("Сдавайся! Ты всё равно не пройдешь эту игру!");
        badKom.add("Снова проиграл! Брось ты это дело, как ты любишь всё бросать на половине пути!");
        badKom.add("Я ставлю на твой проигрыш! И моя ставка принесет мне выйгрыш!");
        badKom.add("Ухахахах, как ты там написал? Что - то типа этого: тавылдпатдыпткд");
        badKom.add("Пальцы по моему у тебя не для этого созданы...");
    }
    
    public static ArrayList<String> easyQuestions = new ArrayList<>();
    public static void addEasyQuestions()
    {
        easyQuestions.add(0,"Ну - ка поясни за дерзость!");
        easyQuestions.add(1,"Ты кто есть то такой, слышь?!");
        easyQuestions.add(2,"Слышь, ты че уставился?! Че глаза лишние?");
        easyQuestions.add(3,"Ты не догоняешь что - ли?! А ну потерялся отсюда, оболтус!");
        easyQuestions.add(4,"Я не понятно сказал? Смылся, быстро!!!");
        easyQuestions.add(5,"У тебя плохо с сообразительностью? Или самосохранение отсутствует?");
        easyQuestions.add(6,"По - хорошему не понимаешь, да?");
        easyQuestions.add(7,"Короче у тебя сейчас проблемы будут!");
        easyQuestions.add(8,"Ещё раз, и я тебя размотаю!");
        easyQuestions.add(9,"Ну всё, иди сюда, пацанчик!!!");
    }
    
    public static ArrayList<String> mediumQuestions = new ArrayList<>();
    public static void addMediumQuestions()
    {
        mediumQuestions.add(0,"Попробуй реще, сынок!");
        mediumQuestions.add(1,"Ты не успеешь, пацанчик!");
        mediumQuestions.add(2,"Че то слабоват ты, паря!");
        mediumQuestions.add(3,"Шевели своими мотовилами побыстрее!");
        mediumQuestions.add(4,"Да неее, ты не вывезешь!");
        mediumQuestions.add(5,"Ты прошёл половину! Не пугай меня, и сдайся!");
        mediumQuestions.add(6,"Иди лучше телевизор посмотри!!! Ты проиграешь!");
        mediumQuestions.add(7,"Какой упорный! Далеко пойдешь... Может быть...");
        mediumQuestions.add(8,"Ты дошёл до сюда? Странно, я думал таких как ты уже не осталось...");
        mediumQuestions.add(9,"Крайняя бойня! Это последний этап! Тебе не победить!");
    }
    
    public static ArrayList<String> hardQuestions = new ArrayList<>();
    public static void addHardQuestions()
    {
        hardQuestions.add(0,"Ха - ха - ха, ты по моему не туда зашёл!!!");
        hardQuestions.add(1,"Ну давай, давай, сыночек, попробуй обойти меня!");
        hardQuestions.add(2,"Я даже слепой и без рук пишу быстрее!");
        hardQuestions.add(3,"Ну что ты тут делаешь? По - моему ты потерялся!");
        hardQuestions.add(4,"Ты ещё не закрыл эту игру?! Закрывай, ты всё равно не выйграешь!");
        hardQuestions.add(5,"Половина пройдена. Никак не угомонишься, да?! Ну мы ещё посмотрим, кто кого...");
        hardQuestions.add(6,"Пальцы не сломал? Клавиатуру не разбил? Нет? Ну давай, давай...");
        hardQuestions.add(7,"Как считаешь, с такой скоростью ты сможешь поймать рукой пулю?");
        hardQuestions.add(8,"О_о, ты ещё не выдохся?! Четко идёшь, я начал уважать тебя!");
        hardQuestions.add(9,"Последний уровень!!! Тут то тебе и придет капец, СыНоЧек! Это ПРоВаЛ!");
    }
    
    

    public Training()
      {                
        initComponents();
        startPractice.setVisible(true);
        stopPractice.setVisible(true);
        startPractice.setEnabled(false);
        startPractice.setDefaultCapable(true);
        startPractice.setToolTipText("Выбери сложность, чтобы побороться!");
        stopPractice.setEnabled(false);
        jMenu1.setVisible(false);   
        startAdventure.setVisible(false);
        answerUser.setTransferHandler(null);
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
         Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\training_back.mp3");
        
      }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        startAdventure = new javax.swing.JButton();
        startPractice = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        answerUser = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        answerProgram = new javax.swing.JTextArea();
        stopPractice = new javax.swing.JButton();
        jSlider1 = new JProgressBar(JProgressBar.VERTICAL);
        jScrollPane2 = new javax.swing.JScrollPane();
        areaForQuestions = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        kommentarii = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        easy = new javax.swing.JRadioButtonMenuItem();
        medium = new javax.swing.JRadioButtonMenuItem();
        hard = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Потренируемся!");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<<Назад");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Ну проверим на что ты способен. Сначала пройди тренировку!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 60));

        startAdventure.setBackground(new java.awt.Color(0, 102, 153));
        startAdventure.setForeground(new java.awt.Color(255, 255, 255));
        startAdventure.setText("Перейти в реальный мир!");
        startAdventure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startAdventureActionPerformed(evt);
            }
        });
        jPanel1.add(startAdventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 230, 50));

        startPractice.setBackground(new java.awt.Color(225, 225, 225));
        startPractice.setForeground(new java.awt.Color(51, 51, 51));
        startPractice.setText("Старт(Пробел)");
        startPractice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startPracticeMouseClicked(evt);
            }
        });
        startPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPracticeActionPerformed(evt);
            }
        });
        startPractice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startPracticeKeyPressed(evt);
            }
        });
        jPanel1.add(startPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 220, 30));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        answerUser.setEditable(false);
        answerUser.setBackground(new java.awt.Color(0, 0, 51));
        answerUser.setColumns(20);
        answerUser.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answerUser.setLineWrap(true);
        answerUser.setRows(3);
        answerUser.setText("                \n             \n         > Здесь пишешь ты\n\n * для того, чтобы начать         битву - нажми \"Пробел\"");
        answerUser.setWrapStyleWord(true);
        answerUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerUserFocusGained(evt);
            }
        });
        answerUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerUserKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(answerUser);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, 110));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        answerProgram.setEditable(false);
        answerProgram.setBackground(new java.awt.Color(0, 0, 51));
        answerProgram.setColumns(20);
        answerProgram.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        answerProgram.setLineWrap(true);
        answerProgram.setRows(3);
        answerProgram.setText("\n                    \n             > Здесь пишу я \n\n  *  после ввода фразы -                 нажми \"Enter\"");
        answerProgram.setWrapStyleWord(true);
        jScrollPane4.setViewportView(answerProgram);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 180, 110));

        stopPractice.setBackground(new java.awt.Color(51, 51, 51));
        stopPractice.setForeground(new java.awt.Color(51, 51, 51));
        stopPractice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/enter.png"))); // NOI18N
        stopPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopPracticeActionPerformed(evt);
            }
        });
        jPanel1.add(stopPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 70, 60));

        jSlider1.setBackground(new java.awt.Color(51, 51, 51));
        jSlider1.setForeground(new java.awt.Color(51, 255, 51));
        jSlider1.setBorderPainted(false);
        jSlider1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jSlider1.setEnabled(false);
        jSlider1.setFocusable(false);
        jSlider1.setRequestFocusEnabled(false);
        jSlider1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 20, 160));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        areaForQuestions.setEditable(false);
        areaForQuestions.setBackground(new java.awt.Color(9, 9, 9));
        areaForQuestions.setColumns(20);
        areaForQuestions.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        areaForQuestions.setForeground(new java.awt.Color(102, 255, 0));
        areaForQuestions.setLineWrap(true);
        areaForQuestions.setRows(3);
        areaForQuestions.setText("> В этой строке будет появляться фраза, которую мы будем писать\n> наперегонки. Пиши в точности, как здесь, с знаками препинания и  \n> большими буквами!");
        areaForQuestions.setToolTipText("");
        areaForQuestions.setWrapStyleWord(true);
        areaForQuestions.setDoubleBuffered(true);
        areaForQuestions.setDragEnabled(true);
        jScrollPane2.setViewportView(areaForQuestions);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 76, 570, -1));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setHorizontalScrollBar(null);

        kommentarii.setEditable(false);
        kommentarii.setBackground(new java.awt.Color(0, 0, 51));
        kommentarii.setColumns(20);
        kommentarii.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        kommentarii.setForeground(new java.awt.Color(204, 255, 255));
        kommentarii.setLineWrap(true);
        kommentarii.setRows(5);
        kommentarii.setWrapStyleWord(true);
        jScrollPane5.setViewportView(kommentarii);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/game.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 610, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/game_back.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        jMenu2.setText("Справка по игре");

        jMenuItem1.setText("Открыть справку");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Сложность");
        jMenu1.setEnabled(false);

        easy.setText("Для простака!");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, easy, org.jdesktop.beansbinding.ELProperty.create("${selected}"), easy, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyActionPerformed(evt);
            }
        });
        jMenu1.add(easy);

        medium.setText("Серьёзно");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, medium, org.jdesktop.beansbinding.ELProperty.create("${selected}"), medium, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        jMenu1.add(medium);

        hard.setText("Ты не пройдешь!");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, hard, org.jdesktop.beansbinding.ELProperty.create("${selected}"), hard, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardActionPerformed(evt);
            }
        });
        jMenu1.add(hard);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startPracticeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startPracticeActionPerformed
    {//GEN-HEADEREND:event_startPracticeActionPerformed
      Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\training_button-probel.mp3");  
      answerUser.setEnabled(true);
      answerUser.setEditable(true);
      answerProgram.setText("");
      answerUser.setText("");
      answerUser.requestFocus(true);
      po.proverkaLevelDifficult(numberListQuestions, jSlider1, areaForQuestions,answerProgram, answerUser);
      startPractice.setEnabled(false);
      stopPractice.setEnabled(true);
      
    }//GEN-LAST:event_startPracticeActionPerformed

    private void startPracticeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_startPracticeMouseClicked
    {//GEN-HEADEREND:event_startPracticeMouseClicked
      
      
        
    }//GEN-LAST:event_startPracticeMouseClicked

    private void stopPracticeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_stopPracticeActionPerformed
    {//GEN-HEADEREND:event_stopPracticeActionPerformed
      Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\training_button-enter.mp3");
      answerUser.setEnabled(false);
      answerUser.removeKeyListener(ky);
      po.proverkaOtvetaGame(areaForQuestions, answerUser, kommentarii,goodKom,badKom);
      stopPractice.setEnabled(false);
      Background.stopGame();
      startPractice.setEnabled(true);
      startPractice.requestFocus(true);
    }//GEN-LAST:event_stopPracticeActionPerformed

    private void startPracticeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_startPracticeKeyPressed
    {//GEN-HEADEREND:event_startPracticeKeyPressed
        
    }//GEN-LAST:event_startPracticeKeyPressed

    private void answerUserFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_answerUserFocusGained
    {//GEN-HEADEREND:event_answerUserFocusGained

        ky.z = stopPractice;
        ky.a = startPractice;
        answerUser.addKeyListener(ky);
        if(evt.equals(VK_ENTER))
        {
            answerUser.removeKeyListener(ky);
        }
    }//GEN-LAST:event_answerUserFocusGained

    private void answerUserKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_answerUserKeyPressed
    {//GEN-HEADEREND:event_answerUserKeyPressed
      
    }//GEN-LAST:event_answerUserKeyPressed

    private void hardActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hardActionPerformed
    {//GEN-HEADEREND:event_hardActionPerformed
        if(hard.isSelected())
        {
            answerProgram.setText("");
            answerUser.setText("");
            kommentarii.setText("");
            easy.setSelected(false);
            medium.setSelected(false);

            startPractice.setEnabled(true);
            startPractice.requestFocus(true);

            stopPractice.setEnabled(true);

            startPractice.setToolTipText("Нажимай, для драки!");
            numberListQuestions = 3;
            stopPractice.setEnabled(false);
            n = 0;
            Background.stopGame();
        }
    }//GEN-LAST:event_hardActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mediumActionPerformed
    {//GEN-HEADEREND:event_mediumActionPerformed
        if(medium.isSelected())
        {
            answerProgram.setText("");
            answerUser.setText("");
            kommentarii.setText("");
            easy.setSelected(false);
            hard.setSelected(false);

            startPractice.setEnabled(true);
            startPractice.requestFocus(true);

            stopPractice.setEnabled(true);

            startPractice.setToolTipText("Нажимай, для драки!");
            numberListQuestions = 2;
            stopPractice.setEnabled(false);
            n = 0;
            Background.stopGame();
        }
    }//GEN-LAST:event_mediumActionPerformed

    private void easyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_easyActionPerformed
    {//GEN-HEADEREND:event_easyActionPerformed
        if(easy.isSelected())
        {
            answerProgram.setText("");
            answerUser.setText("");
            kommentarii.setText("");
            medium.setSelected(false);
            hard.setSelected(false);

            startPractice.setEnabled(true);
            startPractice.requestFocus(true);

            stopPractice.setEnabled(true);

            startPractice.setToolTipText("Нажимай, для драки!");
            numberListQuestions = 1;
            stopPractice.setEnabled(false);
            n = 0;
            Background.stopGame();
        }
    }//GEN-LAST:event_easyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        Sound_Player.stopMusic();
        Background.stopGame();
        Game_Choice_Difficulty gcd = new Game_Choice_Difficulty();
       
        gcd.setVisible(true);
        this.close(this);
        gcd = null;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void startAdventureActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startAdventureActionPerformed
    {//GEN-HEADEREND:event_startAdventureActionPerformed
          Sound_Player.stopMusic();
          Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\sounds\\\\training_button-realworld.mp3");
          Game_Adventure game = new Game_Adventure();
          Sound_Player.stopMusic();
          game.setVisible(true);
          super.close(this);          
          game = null;
    }//GEN-LAST:event_startAdventureActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        spravka.setVisible(true);
        spravka.text.setText(spravka.spravkaForTraining);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            getLogger(Simple_Game.class.getName()).log(SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        invokeLater(() ->
//          {
//            new Simple_Game().setVisible(true);
//          });
//      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerProgram;
    private javax.swing.JTextArea answerUser;
    private javax.swing.JTextArea areaForQuestions;
    public static javax.swing.JRadioButtonMenuItem easy;
    public static javax.swing.JRadioButtonMenuItem hard;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private JProgressBar jSlider1;
    private javax.swing.JTextArea kommentarii;
    public static javax.swing.JRadioButtonMenuItem medium;
    public static javax.swing.JButton startAdventure;
    public static javax.swing.JButton startPractice;
    public static javax.swing.JButton stopPractice;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
