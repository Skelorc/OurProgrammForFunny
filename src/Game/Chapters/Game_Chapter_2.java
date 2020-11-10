

package Game.Chapters;

import GUI.MainMenu;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_2 extends Game_Chapter_1 {
  
   public String nameMusic;
   
   @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_2.mp3";
   }
    
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава вторая. Неожиданная встреча с интересными людьми!";
      }
     
        
    int  numberCorrectAnswer = 1;
    
    int numberincorrectAnswer1 = 0;
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
        wrongAnswer.add(0,"Они смотрят друг на друга, и начинают раскатисто ржать.\n Ты в это время думаешь, как бы сейчас технично пропетлять от дальнейшего разговора "
                + "с этими ''ребятами''.\n\n Ты делаешь шаг назад, и в это же время, тот что с боку говорит коренастому :\n"
                + "- Глеб, а этот щуплый похоже решил слинять! \nМожет глянем, что у него там в карманах есть? \nЧувствую я, что там наши деньги лежат!\n\n"
                + "Глеб, выслушав своего кореша говорит тебе :\n"
                + " - Ну ты слышал, да? \nБабки есть? \nТелефон?\n Короче, говори чё есть, сейчас посмотрим, что наше, и дальше пойдешь. \nТы, само собой, не горишь желанием "
                + "расставаться со своими вещами, и потому отвечаешь :\n"
                + " - Парни, я на вас заявление напишу в полицию и вас потом...\n\n"
                + "Парней, видимо, такие слова не очень то и пугают, так как они даже не дают тебе договорить, справа прилетает кулак, ты успеваешь блокировать, тут же слева мелькает нога, и попадает тебе в "
                + "прямиком в ухо...\n\nДальше наступает непроглядная тьма...\n\nОчухавшись, ты понимаешь, что остался без всего и с опухшей мордой...\n\nВот к чему иногда приводит мягкотелость,"+MainMenu.NAME+"!");
        wrongAnswer.add("");
        wrongAnswer.add(2,"Пацаны даже немного растерялись от твоей наглости, и самое бы время дать стрекоча, но ты почему то решаешь по - другому.\n"
                + " - А ну, дайте - ка мне мобилку, маме позвоню, скажу что всё хорошо! - говоришь ты им, протягивая руку.\n\n"
                + " Вот тут то они и выходят из ступора, и сразу без слов переходят в атаку.\nКоренастый проводит тебе прямой, целясь в нос, ты уклоняешься, блокируешь удар справа, отпрыгиваешь на шаг назад,"
                + " и принимаешь стойку, как научился на улице. \n\nОни молча смотрят на тебя, и в этот момент, тот что справа достаёт ''бабочку''.\n Покрутив её в руке, он делает выпад в твою сторону, ты успеешь схватить "
                + "руку с ножом, и в этот момент ты концентрируешь всё внимание на ноже, поэтому пропускаешь сначала справа в область печени, тут же прилетает в ''солнышко''.\n\n "
                + "Спустя мгновение, резкая боль с правого бока, валит тебя на землю, и ты начинаешь закашливаться, так как ещё и дыхалку сбило после удара в солнечное сплетение. \n\n"
                + "Как ни странно, они не начинают тебя запинывать, а просто один из них придавливает ногой горло к земле, обшаривают карманы, и, сразу уходят. \n\nОткашлявшись, ты встаешь, "
                + "отряхиваешься.\n Понимаешь, что ты пуст, телефон, деньги, карта - всё ушло вместе с ними. \n\nКуда же ты теперь пойдешь в таком виде, а, "+MainMenu.NAME+"?");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"После твоего длительного молчания, тот что, справа говорит коренастому :\n"
                + " - Может этот пацанчик глухонемой, а, Глеб?\n\n"
                + " Глеб, смотрит на тебя, потом переводит взгляд за твою спину, и вдруг, делая круглые глаза, резко вскрикивает :\n"
                + " - ЭТО ЧЕ ТАКОЕ?\n\n"
                + "Ты мгновенно разворачиваешься, ища предмет восклицания Глеба, и уже через секунду до тебя доходит, для чего он так сделал.\n"
                + " Ты даже не успеваешь повернуться обратно, просто чувствуешь, как в затылок что - то сильно прилетело, и откинуло тебя лицом в асфальт. \n\n"
                + " После этого, в твоём сознании словно выключили электричество...\n\n"
                + " Придя в себя, ты чувствуешь что лежишь в какой то липкой луже, оказавшейся кровью, вытекшей из разбитого, после встречи с асфальтом, носом. \n"
                + "Само собой, в карманах у тебя осталась только дорожная пыль, которую успело надуть, пока ты валялся в отключке. \n\nСев, ты осознаёшь, "
                + "что поездка к возлюбленной кладывается на неопределённый срок...");        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"Коренастый спрашивает у тебя :\n\n"
                + " - Раз порядочным себя называешь, так прояви братскую теплоту и заботу, окажи нам финансовой поддержки,а?\n\n"
                + "у меня дела тут, но как закончу, мы можем созвониться, если останутся копейки, я накрою ''поляну'' за знакомство!\n"
                + "На данный момент просто ну никак не могу, пацаны, не обессудьте!\n\n"
                + "Коренастый смотрит на тебя, явно не веря всему вышесказанному. \n\nПару секунд подумав, он говорит:\n\n"
                + "- Слышь, а тебя как на районе то знают? По имени, или погоняло есть?\n\n"
                + " - Близкие называют меня по - простому - " + MainMenu.NAME+". \nТак и на районе знают, там мало пацанов с таким именем,  кто ''канитель'' наводит.\n\n"
                        + "Ну ладно, короче, погнал я, парни, дела не ждут, давайте до скорого! \n\n- и не давая опомниться, ты огибаешь эту троицу и устремляешься к выходу из этих дворов.\n\n"
                        + "Ты стал на шаг ближе, к своей любимой.");
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Кто ты такой говоришь, а, пацанчик?");
        badAnswerNPC.add(1,"У тебя че - то во рту застряло?");
        badAnswerNPC.add(2,"Ну давай, ответь за себя хотя бы!");
        badAnswerNPC.add(3,"Пацаны, может он имбицильный?");
        badAnswerNPC.add(4,"Ты начинаешь меня раздражать...");
        badAnswerNPC.add(5,"Че смотришь? Говори давай!!!");
        badAnswerNPC.add(6,"Ты вообще разговаривать умеешь?");
        badAnswerNPC.add(7,"Ты походу башкой где - то ударился!");
        badAnswerNPC.add(8,"Ты если дебильный, то скажи!");
        badAnswerNPC.add(9,"Ну всё, улитка, ты почти нарвался!");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Ребята, меня мама в магазин за хлебом послала...");
        answerAdventure.add(1,"Да, я пацан порядочный, меня на районе знают!");
        answerAdventure.add(2,"Да вы че, быки, а ну - ка потерялись, иначе вас родители не найдут!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Ну слава богу, доехали.\n\n Я думал наша карета развалится где - то по дороге, уж очень она бренчала, как ведро с гайками. \n\nВыйдя на остановке, ты огляделся по сторонам.\n\n Торопиться некуда, "
                + "и ты решаешь прогуляться недолго по району, заодно сходить за нужными покупками.\n\n "
                + "Шагаешь по тротуару, и решаешь сократить путь через дворы.\n\n Ныряешь в арку близлежащего дома, с другой стороны тебя встречает , окруженный домами двор. \n\nТы продолжаещь движение,  как вдруг слышишь сзади:\n "
                + " \nЭээййй, ты, тормозни - ка там!\n\n Этого ещё не хватало, ты оборачиваешься и видишь, как трое местных двигаются к тебе.\n\n Двое по бокам, повыше тебя ростом, а тот, что в середине,"
                + " пониже, но коренастый. \n\nОни не спеша подходят к тебе, твоё сердце начинает учащенно биться, ладошки потеют, зрачки расширяются...\n\nКороче, у тебя начинается волнение!\n\n"
                + " Местные подходят, и тот что в центре, коренастый, сплёвывая тебе под ноги, интересуется:\n\n "
                + " - Слышь, кто такой то?\n\n На что, ты отвечаешь:  ");
      }
    
//</editor-fold>

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Ну здорова! Мы крайне рады видеть тебя!!!"); 
      }
    
    
    //<editor-fold defaultstate="collapsed" desc="Сеттеры и геттеры">
    @Override
    public void setTextWithAdventure(ArrayList<String> textWithAdventure)
      {
        this.textWithAdventure = textWithAdventure;
      }
    
    public static void setAnswerAdventure(ArrayList<String> answerAdventure)
      {
        Game_Chapter_1.answerAdventure = answerAdventure;
      }

  
    @Override
    public String getBadAnswerNPC(int index)
      {
        return badAnswerNPC.get(index);
      }  
    @Override
    public void setWrongAnswer(ArrayList<String> wrongAnswer)
      {
        this.wrongAnswer = wrongAnswer;
      }
    
    @Override
    public void setGoodAnswerNPC(ArrayList<String> goodAnswerNPC)
      {
        this.goodAnswerNPC = goodAnswerNPC;
      }
    
    @Override
    public void setBadAnswerNPC(ArrayList<String> badAnswerNPC)
      {
        this.badAnswerNPC = badAnswerNPC;
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
    public void setLabel(JLabel label)
      {
        this.label = label;
      }
 

    @Override
    public JLabel getLabel()
      {
        return super.getLabel(); 
      }

    @Override
    public String getBadEndGame()
      {
        return this.badEndGame.get(0);
      }

    @Override
    public String getGoodAnswerNPC()
      {
        return goodAnswerNPC.get(0); 
      }
    
    @Override
    public String getWordsNPC()
      {
         return this.wordsNPC.get(0);
      }
    

    @Override
    public ArrayList<String> getWrongAnswer()
      {
        return super.getWrongAnswer(); //To change body of generated methods, choose Tools | Templates.
      }

    @Override
    public String getTextWithAdventure()
      {
       return textWithAdventure.get(0);
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
