

package Game.Chapters;

import GUI.MainMenu;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_4 extends Game_Chapter_3 {
    
    public String nameMusic;
    
      @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_4.mp3";
   }
       
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава четвёртая. Где лечат, а где и калечат!!!";
      }
    int  numberCorrectAnswer = 2;   
    int numberincorrectAnswer1 = 0;
    int numberincorrectAnswer2 = 1;
    
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
        wrongAnswer.add(0,"''Вот спасибо, от души, родненький!'' \n\nМужик, поворачивается, пробивает у продавщицы свою ''амброзию'',"
                + "и тут же, не отходя от кассы, открывает бутылку, залпом заливает в себя, и резко валится на спину! \n\nТы ошеломлен, фармацевт начинает что - то кричать.\n\n"
                + "Подоходишь к мужику, щупаешь пульс, чувствуешь, что сердце слабо, но бьется, достаёшь телефон, набираешь в скорую! "
                + "\n\nПо телефону, тебя просят дождаться её прибытия.\n\nЧто остаётся делать, придётся ждать. \n\nПока адепты медицины едут, переворачиваешь мужика"
                + " на бок, чтобы вдруг мало ли, не захлебнулся рвотными массами, и ждёшь машину...\n\nВнезапно мужик перестаёт дышать, ты снова щупаешь артерию, пульса уже нет, "
                + " ты поворачиваешь его на спину, и пытаешься сделать массаж сердца, как видел в фильмах, но не расчитываешь силы, в грудной клетке что - то звонко трещит, и спустя пару секунд,  у него изо рта начинает идти кровь...\n\n"
                + "В этот миг распахиваются двери, и заходят медицинские работники. \n\nТы оборачиваешься на продавщицу, и видишь что она пристально смотрит на тебя,"
                + "понимая ЧТО ты натворил. \n\nУ тебя крупные проблемы,"+MainMenu.NAME+", если не умеешь что - то делать, лучше не лезь!");
                
        wrongAnswer.add(1,"''Че ты мне только что сказал, сосунок?'' \n\nМужик, засовывает руку за пазуху, и вытаскивает мясницкий тесак,"
                + "для разделывания свиных туш. \n\nТы принимаешь боксерскую стойку, не зря ходил на тренировки, проводишь любимую ''двоечку'',"
                + "но мужик, оказывается тоже не прост, он подныривает под твой правый боковой, и успеват порезать тебе бедро.\n\n"
                + "Ты чувствуешь, как тёплая жидкость начинает стекать по ноге. \n\nОппонент, делает выпад, пытаясь резануть тебя, по животу,"
                + " но ты отскакиваешь, и  проводишь чёткий апперкот, который свалил бы даже медведя. \n\nСамо собой, мужик сделан не из стали, "
                + " поэтому отлетает к соседней стене, и выключается...\n\nТы смотришь на пол под себя, и видишь там уже целую лужу крови, видимо задета артерия на бедре. \n\nЧёрт бы побрал эту аптеку!!!"
                + "\n\nЧувствуешь, что начинается головокружение. \n\nОборачиваешься на кассу, а там уже никого нет, продавец испарилась. \n\nГолова начинает кружиться ещё сильнее,"
                + " да и слабость постепенно наваливает, ты садишься на пол...\n\nСпустя некоторое время, чувствуешь, что кто - то пытается тебя перевязать...\n\nСегодня тебе будет точно не до любви!");
        wrongAnswer.add(2,"");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"Так и не дождавшись ответа, он поворачивается к кассирше, достаёт нож из - за пазухи, и с криком:\n''5 ФУНФЫРЕЙ СЮДА! БЫСТРО!!!'', \nначинает кидаться "
                + "на аптекаршу, размахивая своим тесаком, словно запорожский казак шашкой! \n\nПродавец начинает биться в истерике,"
                + "кричит в ответ непереводимые слова, возможно даже заклинания, скорее всего именно в этот момент, она нажала на кнопку охранной сигнализации.\n\n"
                + "Ты стоишь в ступоре, не зная что делать, бежать от этого самурая, или помочь женщине? \n\nПока ты думаешь, распахивается дверь, "
                + "забегают несколько человек в форме ГБР (и как только так быстро приехали?!), и так как ты находишься ближе к выходу, а значит и первый их встречаешь, последнее что ты успеваешь увидеть, "
                + "перед тем, как отправиться в место, где темно и страшно, это как навстречу к твоей голове летит армейский ботинок, сделанный на российском оборонном заводе...\n\n"
                + "Очухиваешься ты уже на улице, левый глаз заплыл, бровь рассечена, и с правой стороны не хватает пары зубов...\n\nТы потерпел фиаско,"+MainMenu.NAME+","
                        + "в таком виде у девушки лучше не появляться! ");
        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0," - Понял друг, ты мне не поможешь. Ну что уж теперь, пойду на вокзал, там товарняки должны "
                + "были приехать, может шабашка на разгрузку имеется. "
                + " \n\nМужик выходит, ты подходишь к кассе, приобретаешь пачку фирменных ''скафандров'',"
                + " и двигаешься в сторону выхода. \n\nТы ещё на шаг ближе к своей половинке!");
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Что? Не понял...");
        badAnswerNPC.add(1,"Так есть или нет?");
        badAnswerNPC.add(2,"Ну ты поможешь мне, браток?");
        badAnswerNPC.add(3,"Никак не пойму, что ты говоришь...");
        badAnswerNPC.add(4,"Че тоже плохо? Может со мной тяпнешь?");
        badAnswerNPC.add(5,"Друг, ну ты дашь денег то?");
        badAnswerNPC.add(6,"...Вздыхает, и смотрит очень грустно...");
        badAnswerNPC.add(7,"Брат,как там с деньгами обстоит вопрос?");
        badAnswerNPC.add(8,"В - общем давай, либо да, либо нет?");
        badAnswerNPC.add(9,"Крайний раз спрашиваю, дашь денег?!");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Да, для поправки найдется, конечно, вот возьмите пятьсот!");
        answerAdventure.add(1,"Чем ты болеешь, синькой? Иди, отдыхай, опойка!");
        answerAdventure.add(2,"Я тебе спонсор что - ли? Нравится бухать, так зарабатывай!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0," Покрутившись некоторое время по улице, ты вдалеке видишь вывеску на которой изображен зелёный крест.\n\n"
                + "Всё, ты нашёл нужное направление, и довольный зашагал к ней. \n\nОткрываешь дверь, заходишь, смотришь - внутри стоят парf пацанов, "
                + "какой то мужик помятый, видимо хочет приобрести зелье здоровья, его ещё называют ''фунфырик'' или ''боярышник'', и женщина средних лет.\n\n"
                + "Встаешь в очередь, мужик последний, ты за ним. \n\nПока очередь движется к кассе, осматриваешь товар в поисках своих ''предохранителей''.\n\n"
                + "Вот пацаны купили медицинские перчатки, гематоген, и зелёнку(и зачем им только эти покупки?), "
                + "ладно, дело их, очередь сокращается. \n\nЖенщина берёт жаропонижающее и обезболивающее, ага, болеет значит, или запасается на будущее. \n\nОстались ты, да перед тобой мужик."
                + "Он подходит к кассе, и интересуется, есть ли в наличии его ''амброзия'', на что ему отвечают, мол имеется такое, были бы деньги. \n\n"
                + "После этого, он поворачивается к тебе и спрашивает: \n\n''Слышь, малой, есть пару соток, мне позарез нужно! Видишь, болею!''"
                + "\n\nНа что ты отвечаешь ему: ");
                
      }

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Помоги нуждающемуся, дружище..."); 
      }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Сетеры и гетеры для коллекций и Jdialog">
    

    @Override
    public void setTextWithAdventure(ArrayList<String> textWithAdventure)
      {
        this.textWithAdventure = textWithAdventure;
      }
    @Override
    public String getTextWithAdventure()
      {
        return textWithAdventure.get(0);
      }

     public static void setAnswerAdventure(ArrayList<String> answerAdventure)
      {
        Game_Chapter_1.answerAdventure = answerAdventure;
      }
    public static ArrayList<String> getAnswerAdventure()
      {
        return answerAdventure;
      }

   @Override
    public void setWrongAnswer(ArrayList<String> wrongAnswer)
      {
        this.wrongAnswer = wrongAnswer;
      }

    @Override
    public ArrayList<String> getWrongAnswer()
      {
        return wrongAnswer;
      }

    @Override
    public void setGoodAnswerNPC(ArrayList<String> goodAnswerNPC)
      {
        this.goodAnswerNPC = goodAnswerNPC;
      }


    @Override
    public String getGoodAnswerNPC()
      {
        return goodAnswerNPC.get(0);
      }
@Override
    public void setBadAnswerNPC(ArrayList<String> badAnswerNPC)
      {
        this.badAnswerNPC = badAnswerNPC;
      }
    
    @Override
    public String getBadAnswerNPC(int index)
      {
        return badAnswerNPC.get(index);
      }
    
@Override
    public void setBadEndGame(ArrayList<String> badEndGame)
      {
        this.badEndGame = badEndGame;
      }
    

    @Override
    public String getBadEndGame()
      {
         return this.badEndGame.get(0);
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
