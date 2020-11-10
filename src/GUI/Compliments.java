
package GUI;



import GameUtilities.Background;
import GameUtilities.Sound_Player;
import static java.awt.Toolkit.getDefaultToolkit;
import java.util.ArrayList;
import java.util.Iterator;




public class Compliments extends BaseChildFrame {
    MainMenu mm = new MainMenu();
    
   protected ArrayList<String> randevu;
   protected ArrayList<String> money;
   protected ArrayList<String> car;
   protected ArrayList<String> battle ;
   protected ArrayList<String> sport;
   protected ArrayList<String> friends;
   
     protected Iterator itR;
     protected Iterator itM;
     protected Iterator itC;
     protected Iterator itB;
     protected Iterator itS;
     protected Iterator itF;
    
            
    public void addRandevu()
      {
        randevu.add("Ну, коли собрался ты, братишка, со своею ненаглядною на прогулочку, не забывай, что твоя, как всевидящее око Саурона, всегда начеку!!!  Так что смотри на чужие юбки аккуратнее, как бы  тебя не спалили!");
        randevu.add("Помни то, что твоё мужское должно проявляться в поступках. Сопли и нюни оставь женщинам.");
        randevu.add("Если немножко теряешься при девушке, ничего страшного. Это пройдет с опытом, главное накапливай опыт!)");
        randevu.add("Знай, братуха, чем больше ты делаешь для неё, тем меньше она ценит. Так что делай редко, но качественно!!!))))");
        randevu.add("Самое главное всегда оставайся мужиком, не падай ниц перед красоткой, не лебези перед ней и не заглядывай в глаза как собака хозяину. Ты мужик, но не тряпка!!!");
        randevu.add("Время, проведённое с женщиной нельзя считать потерянным.");
        randevu.add("Братан, девушки - они как нефть. Сначала разведываешь, потом буришь, а потом...А потом пользуй её на благо!");
        randevu.add("Если она отказала тебе раз, попробуй ещё, только поменяй фронт атаки. Тут как на войне, братан, меняй тактику. Если она действительно этого стоит!");
        randevu.add("Знай, что незамених людей не существует. Девушки тоже люди!!!))))");
        randevu.add("Лучше сразу приучи её к каким то моментам твоей жизни, с которыми она должна согласиться и не пытаться их регулировать. Иначе со временем ты умаешься это делать!");
        randevu.add("В споре с женщиной, надо всё время улыбаться, как бы показывая своё превосходство. Послушай, что она говорит, может она в чем то права. ТОГДА, перефразируй её слова, и выдай их за свои!Железный вариант!");
        randevu.add("Не гоняйся за каждой юбкой, не собирай весь хлам, что валяется, но ищи, возможно там есть что - то ценное!!!)))");
        randevu.add("Получай удовольствие на раннем этапе знакомства от общения с ней, тогда всё это будет проходить ещё интереснее!!!");
        randevu.add("Когда познакомишься - главное покажи, что потолок твоих интересов находится выше уровня полового вопроса... Короче не доставай причендал раньше времени!");
        randevu.add("Если девушка ушла от тебя, никогда не отчаивайся, не пиши ей сопливые SMS, не бегай за ней, как дворняга за людьми. Поверь мне, брат, появится другая, и будет ещё лучше. Так уж устроен мир!");
       }
    public void addMoney()
      {
        money.add("Если ты думаешь, что когда - нибудь ты станешь зарабатывать столько, что хватит на всё, ты заблуждаешься, т.к. меняются и цели и планы,и наконец цены:). НО, самое главное, всё равно стремись к тому, чтобы хватило на всё!");
        money.add("Говорят что всех денег не заработать. Согласен, зачем тебе все деньги, оставь и нам немножко!!!:)))");
        money.add("Друг, помни, лучше пару единиц с нулями на карту, чем большое спасибо.");
        money.add("Старайся как можно меньше брать в долг. В нынешнее время очень легко попасть в долговую яму, но вылезти из неё крайне тяжело. Помни это!");
        money.add("Запомни, не играй с друзьями на деньги, потеряешь друзей.");
        money.add("Отдых должен ровняться количеству заработанного. Если ты не зарабатываешь даже себе на отдых, значит надо что - то менять в жизни!!!");
        money.add("Деньги не зло, они средство достижения целей. Без них никак, помни это, и старайся, чтобы они всегда были у тебя в наличии!");
        
      }
    public void addCar()
      {
        car.add("Помни, что ты должен быть всегда уверен в своей тачке, ведь не известно, что будет завтра! Возможно тебе потребуется рвать когти на край земли!");
        car.add("Старайся следить за внешним видом твоей ласточки, она ведь не должна быть похожа на болотистую жабу?");
        car.add("Старайся не нарушать, это дорого и опасно для жизни, но бывают различные ситуации, главное без фанатизма!");
        car.add("Если ты везешь пассажира(-ов), поверь, не всем нравиться, когда от скорости желудок давит на позвоночник! Так что не стоит гнать, как последний раз в жизни!");
        car.add("При помощи денежных знаков можно многое решить, даже если другие знаки создали тебе проблемы!");
        car.add("НЕ экономь на насущных вещах для твоей малышки, не заливай плохое масло и некачественный бензин, и она не отплатит тебе поломкой где - нибудь ночью в лесу!");
        car.add("Луковые кольца, чипсы, и куриные крылышки, упавшие и застрявшие где - нибудь между сиденьями в машине, лучше со временем не пахнут!");
        car.add("Наличие колеи говорит хотя бы о том, что тут ездят!");
        car.add("Дави своим авторитетом, но уж никак не автомобилем!");
        car.add("Если посмотришь в зеркало, когда стоишь в пробке, то заметишь, как растет щетина."); 
        car.add("Если поставишь на свою тачилу сигнализацию, громко издающую звуки женского оргазма, то сотня свидетелей попытки её угона обеспечена.");
        car.add("Не сигналь тачке с буквой У, если она не так едет, все мы учились. НО посмотри, кто за рулем, вдруг в ближайшем будущем встретишь этого ученика на дороге! ");
        
      }
    public void addBattle()
      {
        battle.add("Брат, помни, боль временна, но слава вечна!");
        battle.add("Всегда бей первым, братан, лучшая защита - это нападение.");
        battle.add("Бей тогда, когда нельзя не бить. В остальных случаях можно решить и миром. ");
        battle.add("Если ты пацифист, то всегда подставляй вторую щеку. В остальных случаях, подставь левую руку под удар, а правой делай прямой в подбородок!");
        battle.add("Не бей женщин, стариков, и детей, это не сделает для тебя никакой чести. НО ситуации бывают разные, помни и это!");
        battle.add("Друг, не запинывай лежачего, это не по - пацански, так учит нас улица.");
        battle.add("Если видишь что враг намного слабже тебя, не роняй и не ломай его, дай ему уйти с миром. ");
        battle.add("Помни, что вчераший враг, может стать сегодняшним другом, при других раскладах!");
        battle.add("Перед дракой можешь издать боевой клич берсерка, возможно хватит и этого, чтобы враг скрылся!");
       }
    public void addSport()
      {
        sport.add("В здоровом теле - здоровый дух. Помни это,закаляй себя, занимайся спортом, братишка!");
        sport.add("Сильный мужик по - любому лучше слабого мужика!!!");
        sport.add("Когда ты не тренируешься, тренируется твой враг!");
        sport.add("Поставь себе в приоритеты здоровье, дух, и умственное развитие. Это три атланта, на которых стоит всё остальное!!!");
        sport.add("Не забывай, что сила без ума бесполезна. Надо уметь правильно прикладывать свою мощь!");
        sport.add("Если тебе нечем заняться, займись собой, это самое лучшее вложение!");
        sport.add("Ты должен всегда быть готовым постоять за себя и за своих близких. Поэтому, тренируйся!");
        sport.add("Посмотри на себя в зеркало! Если ты видишь: прыщавого, бледного, задрота, с грязными волосами и руками, как веревочки, то подумай, не пора ли что - то менять?!");
        sport.add("Если ты сам не займешься собой, никто не сделает это за тебя!!! Не откладывай братишка, и не обманывай себя. Делай прямо сейчас! Во всём стремись к гармонии! ");
      }
   public void addFriends()
     {
       friends.add("Вокруг тебя такие же люди как ты! НО, они проживают другую жизнь, и видят всё по своему.");
       friends.add("Не живи во вред окружающим, как паразит, это не достойно РЕАЛЬНОГО пацана!");
       friends.add("Брат мой, знай, что ждут и любят тебя на протяжении всей твоей жизнь - только твои родители.");
       friends.add("Помни, что если ты копаешь другому могилу, очень велика вероятность, что ты сам туда и попадешь! Так уж устроена жизнь, всё возвращается бумерангом!");
       friends.add("Не лезь, к окружающим тебя, со своими советами, если тебя никто не просит. Они же к тебе не лезут.");
       friends.add("Не пытайся навязать своё мнение, если оно верное, люди сами со временем придут к нему.");
       friends.add("Я знаю, ты далеко не дурак, ну всем знать что ты умён и хитер, и быть готовым к этому, не обязательно. Будь середнячком, пусть заблуждаются в тебе.");
       friends.add("Каждое сказанное тобой слово, должно быть продумано, иначе разговор может превратиться в бессмысленную болтовню.");
       friends.add("Не торопись отвечать на вопросы, подумай, нет ли там потаенного смысла?");
       friends.add("Всегда старайся предусмотреть последствия своих слов и поступков, насколько это возможно.");
       friends.add("Согласен, не все вокруг стоят твоего внимания, но игнорировать всё подряд тоже не стоит!");
       friends.add("Не проходи мимо нуждающегося в помощи! И тем более не старайся снять его на камеру, как стало модно в последнее время. Постарайся помочь!!!");
       friends.add("Нормальные пацаны не бьют по протянутой руке! Запомни это!");
       
     }
    
    public Compliments()
      {
        initComponents();
        Background.playMusic("src\\\\Materials\\\\Sounds\\\\sounds\\\\motivation_back.mp3"); 
        
         this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("555.png")));
        
        textCompliments.setFont(MainMenu.customFont);
       
    randevu = new ArrayList<>();
    money = new ArrayList<>();
    car = new ArrayList<>();
    battle = new ArrayList<>();
    sport = new ArrayList<>();
    friends = new ArrayList<>();
    
    addRandevu();
    addMoney();
    addCar();
    addBattle();
    addSport();
    addFriends();
    
   itR = randevu.iterator();
   itM = money.iterator();
   itC = car.iterator();
   itB = battle.iterator();
   itS = sport.iterator();
   itF = friends.iterator();
   
    
          
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        textCompliments = new javax.swing.JScrollPane();
        compliment = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        choice = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Вернуться назад <<");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Бодрость v 1.0");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(497, 285));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Нажимай смелее!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textCompliments.setBackground(new java.awt.Color(255, 255, 255));
        textCompliments.setBorder(null);
        textCompliments.setForeground(new java.awt.Color(0, 0, 102));
        textCompliments.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        textCompliments.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        compliment.setEditable(false);
        compliment.setBackground(new java.awt.Color(255, 255, 255));
        compliment.setColumns(20);
        compliment.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        compliment.setForeground(new java.awt.Color(0, 0, 102));
        compliment.setLineWrap(true);
        compliment.setRows(3);
        compliment.setText("                Здарова, братишка! \n\n Если ты вдруг не знаешь, как поступить, - загляни сюда, возможно я помогу тебе.\n Выбрать тему советов ты можешь в правом верхнем углу.");
        compliment.setWrapStyleWord(true);
        compliment.setFocusable(false);
        textCompliments.setViewportView(compliment);

        back.setBackground(new java.awt.Color(0, 51, 153));
        back.setForeground(new java.awt.Color(204, 255, 255));
        back.setText("Вернуться назад<<");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Здорова брат. Здесь я записал для тебя советы на разные случаи жизни, если ты вдруг не знаешь как поступить, загляни сюда, возможно я помогу тебе. Ну и так, братишка, я ещё написал для тебя несколько приятных выражений. Короче наслаждайся!\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Отношения с девушкой!", "Бабло!", "Твоя ласточка!", "Перед стрелкой с врагами!", "Займись собой!", "Ты и окружение!" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/motivation.png"))); // NOI18N
        jLabel1.setText("\tЗдорова, брат!  Если ты вдруг не знаешь, как поступить, - загляни сюда, возможно я помогу тебе.");
        jLabel1.setMaximumSize(new java.awt.Dimension(497, 285));
        jLabel1.setMinimumSize(new java.awt.Dimension(497, 285));
        jLabel1.setPreferredSize(new java.awt.Dimension(497, 285));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(textCompliments, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(textCompliments, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton4MouseClicked
    {//GEN-HEADEREND:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Sound_Player.stopMusic();
        mm.showFrame(this);
        this.close(this);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sound_Player.playMusicPlayer1("src\\\\Materials\\\\Sounds\\\\other\\\\compl.mp3");
     switch(choice.getSelectedIndex())
     {
         case 0:
             if(itR.hasNext())
             {
                 compliment.setText((String) itR.next());
             }
             else{
                 compliment.setText("Брат, на этом всё. Пока добавить больше нечего!");
             }
             break;
         case 1:
             if(itM.hasNext())
             {
                 compliment.setText((String)itM.next());
             }
             else{
                 compliment.setText("О деньгах пока ограничимся!");
             }
             break;
         case 2:
              if(itC.hasNext())
             {
                 compliment.setText((String)itC.next());
             }
             else{
                 compliment.setText("Я думаю, хватит пока о твоей ракете!");
             }
              break;
         case 3:
              if(itB.hasNext())
             {
                 compliment.setText((String)itB.next());
             }
             else{
                 compliment.setText("Ты готов? Тогда иди, порвих их всех!");
             }
              break;
         case 4:
              if(itS.hasNext())
             {
                 compliment.setText((String)itS.next());
             }
             else{
                 compliment.setText("Если ты ещё не выглядишь, как древнегреческий герой Геракл, значит есть к чему стремиться! Давай, занимайся!");
             }
             break;
         case 5:
              if(itF.hasNext())
             {
                 compliment.setText((String)itF.next());
             }
             else{
                 compliment.setText("Брат, подумай над всем, что ты услышал. Подумай, и сделай выводы...");
             }
             
             
     }
        
      
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
//    public static void main(String args[])
//      {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run()
//              {
//                new Compliments().setVisible(true);
//              }
//     });
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
//            java.util.logging.Logger.getLogger(Compliments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Compliments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Compliments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Compliments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//       
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run()
//              {
//                new Compliments().setVisible(true);
//              }
//        });
//      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JTextArea compliment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane textCompliments;
    // End of variables declaration//GEN-END:variables

 
}