

package Game.Chapters;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_5 extends Game_Chapter_4{
    
      public String nameMusic;
      
        @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_5.mp3";
   }
      
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава пятая. Дети - цветы жизни! Или нет?!";
      }
    int  numberCorrectAnswer = 0;    
    int numberincorrectAnswer1 = 1;
    int numberincorrectAnswer2 = 2;
    
    protected JDialog dialog;
    protected JLabel label;
    
    @Override
    public Object getDialog()
      {
        if(dialog == null && label == null)
        {
            dialog = new JDialog();
            label = new JLabel();
        }
        
        return dialog;
        
      }
    
      
    //<editor-fold defaultstate="collapsed" desc="Добавление элементов и объектов в коллекции">
    @Override
    public void addElementsForCollections()
      {
        super.addElementsForCollections();
      }
    
    @Override
    public void showKommentarii(String text)
      {
        getDialog();
       label.setText(text);
       

       label.setHorizontalAlignment(0);       
       label.setForeground(Color.BLUE);
       label.updateUI();
       
       dialog.setTitle("А теперь послушай - ка меня!!!");
       dialog.setSize(new Dimension(text.length()*7,100));
       
       dialog.getContentPane().setLayout(new BorderLayout());
       dialog.setResizable(false);
       dialog.setBackground(Color.BLACK);
       dialog.getContentPane().add(label, CENTER);
       dialog.setLocationRelativeTo(null);
       dialog.validate();
       dialog.setVisible(true);
       dialog.getFocusOwner();
      }
    
    @Override
     public void addWrongAnswer()
      {
        wrongAnswer.add(0,"");
                
        wrongAnswer.add(1,"На твои слова малой не обращает внимания, и продолжает канючить, тебя начинает это постепенно бесить, и  "
                + "не выдерживая, ты кричишь ему: \n\n''Пошёл вон, сопляк, пока я не дал тебе ускорения под задницу!'',\n\n и именно в этот момент в конце бакалейного отдела появляется"
                + "семейная пара, родители этого маленького надоеды. \n\nОтец ускоряет шаг в твоём направлении, и на подходе, даже не выслушав твоих объяснений,"
                + "даёт тебе звонкого леща, от которого выпадает корзина, ты оскакиваешь от второй оплеухи, встаешь в стойку, и в этот момент чувствуешь, "
                + "что кто - то сзади обхватил тебя. \n\nОказывается, у маленького злодея, есть не только крепкий отец, но ещё и брат, который судя по силе,"
                + " занимается борьбой. \n\nВдвоём, они начинают тебя приходовать прямо по середине торгового отдела. \n\nНу что тут сказать,"
                + "с помятой мордой, и сломанной рукой, никакое свидание тебе уже не светит...  ");
        wrongAnswer.add(2,"После этих слов, ты отворачиваешься, и продолжаешь выбирать товар, как слышишь сзади смачный плевок, и чувствуешь, "
                + "что плевок этот был тебе на спину. \n\nРезко разворачиваешься, и с звериным рёвом, начинаешь погоню за этим мелким засранцем. \n\nНо, хоть он и малой, бегает,"
                + " словно призёр олимпиады. Погоня заканчивается также молниеносно, как и началась,  крупным ДТП, с участием винной стойки и твоим телом.\n\n"
                + "Итог: ты в луже пролитого вина, на карачиках вылазишь из под груды разбитых бутылок...\n\nТебя окружили охранники и работники магазина...\n\nСлучайно на глаза тебе попадается вывеска с стойки:"
                + "\n\n''Элитные сорта вин'' \n\nСмотришь на ценники разбросанные по полу, и понимаешь что ты прилип на серьёзную сумму, которой не то что у тебя с собой нет, ты и за полгода столько можешь не заработать...\n\n"
                + "Все вы отправляетесь к менеджеру магазина, все твои вещи промокли насквозь, в двух местах стеклом порезало рубашку. \n\nВ таком состоянии уже не до любимой... ");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"Мальчишка смотрит на тебя, и начинает громко реветь. \n\nТы пытаешься его успокоить, но тут из - за стойки с продуктами, появляется охранник, "
                + "спрашивает: \n\n''Что тут происходит?'', \n\nты только собираешься объяснить ему ситуацию, как мальчишка тебя опережает, и кричит:\n\n''Этот дядька, зовет меня в гости,"
                + "говорит что если я пойду с ним, он купит мне конфет!'' \n\nТы замираешь, открыв рот, и смотришь на маленького злодея. \n\nНо вот охранник, к твоему сожалению, не замирает, "
                + "а хватает тебя за руку, ловко заворачивает её за спину, и тащит в комнату для осмотра, где находятся ещё двое служащих. \n\nТам тебя задерживают, вызывают полицию...\n\n"
                + "Ночью того же дня, ты выходишь из отделения, злой и уставший...\n\nСъездили называется в гости!!!");
        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"Ребёнок поворачивается и деловой походкой направляется в сторону детских товаров, ты идёшь в след за ним.\n\n"
                + "Он останавливается около красной спортивной машинки, и показывает на неё пальчиком. \n\nСмотришь ценник - "
                + "а стоит она как настоящая :). \n\nНачинаешь медленно краснеть, на такие покупки ты явно не рассчитывал. \n\nТут, из - за спины, ты слышишь женский оклик:"
                + " \n\n''Андрюша, вот ты где, мы с папой весь магазин уже несколько раз обошли! А вы кто такой?'', \n\nспрашивает тебя судя по всему его мама. \n\n"
                + "Рядом с ней стоит крупный солидный мужчина, наверное его отец и ещё парень, спортивного сложения, скорее всего брат. \n\nНо тебя опережает мальчишка, он говорит: \n\n"
                + "''Я попросил этого дядю купить мне машинку, и мы пошли её выбирать!'' \n\nРодители начинают улыбаться, извиняются перед тобой за возможные"
                + " неудобства, и уходят, уводя ребёнка с собой. \n\nЛадно, не пришлось объяснять, кто ты, и как тут появился с их дитем. \n\n"
                + "Возвращаешься в бакалею, и решаешь всё таки взять печенья и ароматного чая. \n\nСледуешь на кассу, пробиваешь товар, закидываешь всё в пакет и выходишь на улицу.\n\n"
                + "Так, теперь ещё один момент, надо купить твоей малышке что - то в подарок!");
                
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Ну, купишь?");
        badAnswerNPC.add(1,"Дядя, купишь да?");
        badAnswerNPC.add(2,"Ты слышал меня?Ну купи а...");
        badAnswerNPC.add(3,"Ну купи пожалуйста, я очень прошу...");
        badAnswerNPC.add(4,"Дяденька, вон там недалеко она лежит...");
        badAnswerNPC.add(5,"Дядь, а дядь, купишь её?");
        badAnswerNPC.add(6,"Ну скажи что - нибудь...");
        badAnswerNPC.add(7,"...Просто смотрит на тебя...");
        badAnswerNPC.add(8,"Ну так купишь или нет?");
        badAnswerNPC.add(9,"Если не купишь, пеняй на себя!!!");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Конечно, пойдем, покажи какую, малой!");
        answerAdventure.add(1,"Иди, у другого дяди попроси, у меня нет денег!");
        answerAdventure.add(2,"Ну - ка дёрнул отсюда на всех парусах, головастик!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Стоишь на крыльце и думаешь, что взять к столу, конфет и бутылку вина, или  печенья и фруктового чая?\n\n"
                + "''Ладно, в магазине решу.'',\n\n - говоришь сам себе, и выбираешь направление в сторону близлежащего супермаркета. \n\n"
                + "Ладно идти недалеко, и спустя 10 минут, ты уже заходишь внутрь торгового зала, берёшь свободную корзину, и идёшь выбирать, что же всё - таки взять"
                + " с собой в гости. \n\nПроходя по рядам, находишь бакалею и глубоко задумываешься...\n\nИз этого состояния, тебя выбивает дёрганье сзади за рубашку."
                + "\n\nОборачиваешься, и видишь пацанёнка лет 4-5, который, заглядывая тебе в глаза, спрашивает:\n\n''Дядя, купи мне машинку, а?''\n\n"
                + "Ты смотришь на него и отвечаешь:  ");
                
      }

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Дядя, не будь бякой!!!");
      }
    
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Сетеры и гетеры для коллекций и Jdialog">
    @Override
    public String getTextWithAdventure()
      {
        return textWithAdventure.get(0);
      }

    @Override
    public void setTextWithAdventure(ArrayList<String> textWithAdventure)
      {
        this.textWithAdventure = textWithAdventure;
      }

    public static ArrayList<String> getAnswerAdventure()
      {
        return answerAdventure;
      }

    public static void setAnswerAdventure(ArrayList<String> answerAdventure)
      {
        Game_Chapter_1.answerAdventure = answerAdventure;
      }

    @Override
    public ArrayList<String> getWrongAnswer()
      {
        return wrongAnswer;
      }

    @Override
    public void setWrongAnswer(ArrayList<String> wrongAnswer)
      {
        this.wrongAnswer = wrongAnswer;
      }

    @Override
    public String getGoodAnswerNPC()
      {
        return goodAnswerNPC.get(0);
      }

    @Override
    public void setGoodAnswerNPC(ArrayList<String> goodAnswerNPC)
      {
        this.goodAnswerNPC = goodAnswerNPC;
      }

    @Override
    public String getBadAnswerNPC(int index)
      {
        return badAnswerNPC.get(index);
      }

    @Override
    public void setBadAnswerNPC(ArrayList<String> badAnswerNPC)
      {
        this.badAnswerNPC = badAnswerNPC;
      }

    @Override
    public String getBadEndGame()
      {
         return this.badEndGame.get(0);
      }

    @Override
    public void setBadEndGame(ArrayList<String> badEndGame)
      {
        this.badEndGame = badEndGame;
      }

      

    @Override
    public void setDialog(JDialog dialog)
      {
        this.dialog = dialog;
      }

    @Override
    public JLabel getLabel()
      {
        return label;
      }

    @Override
    public void setLabel(JLabel label)
      {
        this.label = label;
      }
    //</editor-fold>
    
      @Override
    public String checkAnswer(String answerUser)
      {
        if(answerUser.equals(answerAdventure.get(numberincorrectAnswer1)))
        {
            return wrongAnswer.get(numberincorrectAnswer1);
        }
        else if(answerUser.equals(answerAdventure.get(numberincorrectAnswer2)))
        {
            return wrongAnswer.get(numberincorrectAnswer2);
        }
        else
                {
                    return null;
                }
      }


}
