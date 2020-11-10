

package Game.Chapters;

import GUI.MainMenu;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import static jdk.nashorn.internal.objects.NativeString.trim;



  public class Game_Chapter_1 {
//основной текст.
    protected ArrayList<String> textWithAdventure;
//ответы
    public static ArrayList<String> answerAdventure = new ArrayList<String>();
//
    protected String nameChapter;
    
    protected String nameMusic;

    public String setNameMusic ()
    {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_1.mp3";
    }
    
    public String setNameChapter()
      {
         return this.nameChapter = "Глава первая. События в весёлой колеснице!";
      }
        
   
    
//комментарии к ответам, которые не надо выбирать!
    protected ArrayList<String> wrongAnswer;
    
//ответы игровых персонажей.
    protected ArrayList<String> goodAnswerNPC;
    protected ArrayList<String> badAnswerNPC;
    
//    
    protected ArrayList<String> wordsNPC;
//плохая концовка
    protected ArrayList<String> badEndGame;
    
//вывод комментария!
    protected JDialog dialog;
    protected JLabel label;
    
    public Object getDialog()
      {
        if(dialog == null && label == null)
        {
            dialog = new JDialog();
            label = new JLabel();
        }
        
        return dialog;
        
      }

    
//номер правильного ответа
    
    public int numberCorrectAnswer = 2;
    
//номера неправильных ответов
    
    public int numberincorrectAnswer1 = 0;
    public int numberincorrectAnswer2 = 1;
    

    //<editor-fold defaultstate="collapsed" desc="Сетеры и гетеры для коллекций и Jdialog">
    public void setTextWithAdventure(ArrayList<String> textWithAdventure)
      {
        this.textWithAdventure = textWithAdventure;
      }
    
    
    
    public void setWrongAnswer(ArrayList<String> wrongAnswer)
      {
        this.wrongAnswer = wrongAnswer;
      }
    
    public void setGoodAnswerNPC(ArrayList<String> goodAnswerNPC)
      {
        this.goodAnswerNPC = goodAnswerNPC;
      }
    
    public void setBadAnswerNPC(ArrayList<String> badAnswerNPC)
      {
        this.badAnswerNPC = badAnswerNPC;
      }
            
    public void setBadEndGame(ArrayList<String> badEndGame)
      {
        this.badEndGame = badEndGame;
      }

    public String getTextWithAdventure()
      {
        return textWithAdventure.get(0);
      }

   

    public ArrayList<String> getWrongAnswer()
      {
        return this.wrongAnswer;
      }
    
    public String getWrongAnswerIndex(int index)
    {
        return wrongAnswer.get(index);
    }
    public String getGoodAnswerNPC()
      {
        return goodAnswerNPC.get(0);
      }

    public String getBadAnswerNPC(int index)
      {
        return badAnswerNPC.get(index);
      }
    public int getBadAnswerNPC()
      {
        return badAnswerNPC.size();
      }
       
    public String getBadEndGame()
      {
        return this.badEndGame.get(0);
      }

   
    public JLabel getLabel()
      {
        return label;
      }
    
    public void setDialog(JDialog dialog)
      {
        this.dialog = dialog;
      }
    
    public void setLabel(JLabel label)
      {
        this.label = label;
      }
    
    public String getWordsNPC()
      {
         return this.wordsNPC.get(0);
      }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Добавление самих коллекций и элементов в  коллекции">
    
    public void addElementsForCollections()
      {
        
    textWithAdventure = new ArrayList<>();
    wrongAnswer = new ArrayList<>();    

    goodAnswerNPC = new ArrayList<>();
    badAnswerNPC = new ArrayList<>();
    
    badEndGame = new ArrayList<>();
    wordsNPC = new ArrayList<>();
        
      }
  
  
      public void addTextWithAdventure()
      {
        textWithAdventure.add(0," Ну здорова, " + MainMenu.NAME+"!\n\nТы стоишь на остановке уже минут двадцать, и тут свершилось:\nпоявляется она - твоя долгожданная жёлтая маршрутка!\n\n...Вроде вот оно счастье...\n\n"
                + "Ты запрыгиваешь внутрь, падаешь на свободное сидение, достаёшь мелочь, считаешь нужную сумму, чтобы отдать за проезд...\n\n...Тут то всё и начинается...\n\nТы сидишь в хвосте, и тебе нужно передать"
                + " деньги водителю.\nЗайцем проехать не получится, - маршрутка полупустая, да и зачем это делать, ты уже не маленький мальчик!\n\nПеред тобой сидит здоровенный такой мужичина с помятой рожей.\n"
                + "\n    Ты поднимаешь на него глаза и говоришь:  \n");        
      }
    
    public void addAnswerAdventure()
      {
        answerAdventure.add(0,"Мужчина, передайте пожалуйста денежку за проезд!");
        answerAdventure.add(1,"Слышь, ты, бабло передай, да побыстрее!!!");
        answerAdventure.add(2,"Эй, мужик, передай по - братски, а?");  
      }
    
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Че ты только что промямлил, я не понял?");
        badAnswerNPC.add(1,"Ты в состоянии разговаривать или че?");
        badAnswerNPC.add(2,"Слышь, ты случайно не с Юпитера?");
        badAnswerNPC.add(3,"Че надо то тебе?");
        badAnswerNPC.add(4,"А ну повтори, только ВНЯТНО!");
        badAnswerNPC.add(5,"Че ты там хрипишь?");
        badAnswerNPC.add(6,"Ты рэп что - ли читаешь на китайском?");
        badAnswerNPC.add(7,"А ну - ка ещё раз повтори, сопляк?");
        badAnswerNPC.add(8,"Ты не тормозок случайно?");
        badAnswerNPC.add(9,"Последняя попытка, дубина!!!");        
      }
    
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Здорова, были!!! Чё хотел то?");        
      }
    
    
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(" Мужик протягивает ладошку, ты ссыпаешь в неё мелочь для оплаты за проезд. \n\nОн тебя спрашивает: "
                + "- Тут без сдачи , да?\n\n"
                + " Смотришь на него,как на дурака, ведь видно, что лежит несколько монет. \n\nРаботяга, видимо трактуя твоё молчание как согласие, - разворачивается, и отдаёт деньги.\n\n"
                + "Ты расслабленно откидываешься на спинку сидения. \nВремя ещё предостаточно, спешить никуда не надо, ты вышел, как впрочем и всегда, за пару часов до назначенного времени. \n\nИтак, ты отправляешься "
                + "дальше по ходу действия! ");        
      }
    
    public void addBadEndGame()
      {
        badEndGame.add("После твоего длительного молчания, водитель начинает поглядывать на тебя в зеркало заднего вида.\n\n"
                + "На следующий остановке он вылазит из кабины, обходит машину, открывает дверь в салон, и кричит тебе:\n"
                + "- Эййй, ты, давай вали отсюда, я ещё зайцев не возил! \n\nТы не знаешь куда деться от стыда, встаёшь, и выходишь, так и не доехав до нужной остановки. \n\nЭто провал, " + MainMenu.NAME);
      }
    
    public void addWrongAnswer()
      {
         wrongAnswer.add(0,"Мужик смотрит на тебя, и выдаёт утробным басом:\n"
                 + " - Сам жопу свою оторви от сидения и передай,ЩЕНОК! \n\nТы, встаёшь с сидения, и тянешься к водителю, пытаясь передать за проезд, но внезапно машина подпрыгивает на ухабе, тебя подкидывает, "
                + "монеты катятся по всему салону. \n\nТы начинаешь их собирать, и вдруг видишь, как пару монет прижимает ботинком парень на соседнем сидении. \n\nВ тебе закипает чувство злобы, "
                 + "и ты кидаешь ему: \n''Слышь, лапу подними, ты мои деньги прижал!'', \nна что парень, поворачивая голову на того самого мужика, говорит :\n"
                 + " - Батя, этот дебильный меня зы кого сейчас принял? Он думает, я как нищий, буду чужие монеты ботинком прятать?\n\n"
                 + "Мужик, глядя тебе в глаза говорит:\n"
                 + " - А мы сейчас с тобой сынок выкинем его из маршрутки, и все дела.\n\n"
                 + "После этих слов, они начинают двигаться к тебе. \nВнезапно машина останавливается, как оказалось на красный сигнал светофора, эти двое хватают тебя за одежду, и пока "
                 + " мужик тащит тебя к выходу, его сынуля подскакивает и открывает дверь на улицу.\n\nДалее, со словами :"
                 + " -А ну вали отсюда, осёл! \n- они выкидывают тебя наружу. \n\nВот и всё, приехали!" + MainMenu.NAME);
      
        wrongAnswer.add(1,"Мужик, удивлённо поднимая брови, смотрит на тебя несколько мгновений, затем поворачивается лицом к сидящему рядом с тобой парню и говорит:\n"
                + " - Сын, ну - ка возьми этого храбреца за шкирку, чтобы он не сдёрнул куда - нибудь, пока я дойду до него, а то машину качает, как мою посудину в шторм!\n\n"
                + "Такого поворота событий ты немного не ождидал, поворачиваешься к соседу, а он уже тянется к тебе руками. \n\nУспеваешь дёрнуться, щёлкнуть ему по ладошкам, "
                + "но видимо машину качать перестало, так как его отец уже взял тебя сзади в медвежьи объятия. \n\nПару раз дёрнувщись, ты понимаешь, что вырваться из его лап не получится, "
                + "тебя как будто зацементировали. \n\nВ этот момент маршрутка останавливается на остановке, и они спокойненько тащат тебя к выходу, и выталкиют наружу. \n\nНу вот и всё, ты по - моему приехал!" + MainMenu.NAME);
       }
//</editor-fold>

    
//проверка, какой ответ дал пользователь, правильный или нет.
  
    public String checkAnswer(String answerUser)
      {
        if(answerUser.equalsIgnoreCase(trim(answerAdventure.get(numberincorrectAnswer1))))
        {
            return getWrongAnswerIndex(numberincorrectAnswer1);   
        }
        else if(answerUser.equalsIgnoreCase(trim(answerAdventure.get(numberincorrectAnswer2))))
        {   
            return getWrongAnswerIndex(numberincorrectAnswer2);    
        }        
        else            
        {
            return null;
        }
        

      }
      
    
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

}
