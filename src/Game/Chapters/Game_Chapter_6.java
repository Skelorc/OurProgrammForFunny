

package Game.Chapters;

import GUI.MainMenu;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_6 extends Game_Chapter_5 {
    
    public String nameMusic;
      @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_6.mp3";
   }
      
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава четвёртая. Новая встреча со старыми друзьями!";
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
        wrongAnswer.add(0,"''Ты дурак что ли? \nТипа не знаешь, как это - стоять не стрёме? \nТак ты же говорил, что пацан ты якобы порядочный, да и на районе тебя"
                + " будто бы знают, значит п...дел нам, да? \nДумаешь, что ты макароны ешь, а мы траву жуем? \nНу щас ты ответишь за свои слова, ЧУХЛО!'' \n\nИ тут пошло - поехало..."
                + "\n\nОчнулся ты уже с разбитой моськой, около магазина, ещё и урну на тебя опрокинули...\n\nПриплыли, называется... ");
                
        wrongAnswer.add(1,"''Во, красавчик!''. \n\nТы идёшь следом за ними, подходите к киоску, ты остаёшься у дверей, пацаны залетают внутрь. \n\nСмотришь по сторонам,"
                + " готовый сразу предупредить, если что не так. \n\nВнутри слышны, какие то крики, но разобрать ничего не получается. \n\nСпустя пару минут, ты видишь на горизонте машину, "
                + "с мигалкой на крыше. \n\nНачинаешь нервничать, но пока решаешь не заходить внутрь, может мимо проедет? \n\nНо всё начинает складываться просто отвратительно, "
                + "машина резко останавливается у входа, ты поворачиваешься чтобы забежать внутрь,но вдруг слышишь несколько хлопков за спиной, и резкая боль застилает всё "
                + "твою сознание...\n\nТы просто валишься у входа, как тюк, мимо пробегающие пинают тебя по ходу действия, вытаскивают твоих подельников на улицу, скручивают, тут подъезжает"
                + " ещё одна машина, и все вы едите на очень весёлое приключение...\n\nЭтим вечером, да и многими следующими тоже, ты так и не попал к девчонке...");
        wrongAnswer.add(2," ");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"Они смотрят на тебя, несколько секунд, после чего коренастый спрашивает, правого: \n\n''Слышь, Бита, а помнишь нас крепанули в клубе, когда тебя с травматом поймали?''.\n\n"
                + "Бита говорит: \n''Да, помню, Глеб, били нас тогда знатно в отделе.'' \n\nГлеб, глядя на тебя снова интересуется у Биты:\n\n'' А не кажется ли мне, что вот этот(тыкая в тебя пальцем), который изображает из себя статую, "
                + " очень похож на того чухана, кто тогда нас сдал с этим стволом!'' \n\nБита, смотрит на тебя пристально и выдаёт :\n''Так это сто пудов он, та же харя хитрая!'' \n\n"
                + "Ты не успеваешь опомниться, как с левой стороны уже летит кулак, а Бита, хочет прописать тебе хороший удар в голень. \n\nОт кулака, ты ещё успеваешь отмахнуться, "
                + " но вот лоукик попал ровно в цель, ты сразу начал прихрамывать, пытаясь как то защищаться.\n\nКидаешь пакет с покупками Бите в рожу, тут же поворачиваясь к "
                + "Глебу, но тот, что с левой стороны, успел зайти тебе за спину, ты только успеваешь почувствовать удар по затылку, и услышать звон разбитого стекла, как глаза затмила тьма...\n\n"
                + "Очнулся ты уже в каком то дворе, с огромной головной болью, и, как потом уже выяснилось, с двуми сломанными рёбрами...\n\n"+MainMenu.NAME+", быстрее отвечай, и такого не будет!!!");
        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"''В смысле не советуешь? Твоего совета вообще спрашивали?''\n - говорит тот, что посередине.\n\n"
                + "''Не спрашивали - это да, но, пацаны, этот цветочный магазин принадлежит нашим, и если вы его хлопните, мы тогда точно знаем,"
                + " кого и где искать! \n\nИ вообще ставлю вас в курс, что все цветочные магазины под маркой ''Зелень'' - принадлежат нам. \n\n''Ааа, ну раз так, тогда лады, всё ясно.''\n - говорит тебе крепыш, они разворачиваются и уходят."
                + "\n\nНу пронесло, ты смотришь им в спины, улыбаешься, и двигаешься к ларьку. \n\nТам ты берёшь самый красивый букет, ведь "
                + "ты очень любишь свою девчонку. \n\nВыходя, уже с цветами и покупками, ты устремляешься к дому своей ненаглядной!");
              
                
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Ну че, сможешь?");
        badAnswerNPC.add(1,"Встанешь у входа, то?");
        badAnswerNPC.add(2,"Алё, слышь, паря?");
        badAnswerNPC.add(3,"...Смотрит на тебя, как на дебила...");
        badAnswerNPC.add(4,"Ты бухой уже что - ли?");
        badAnswerNPC.add(5,"Ты че, игнорируешь меня или как?");
        badAnswerNPC.add(6,"Слышь, ты, да или нет? Че молчишь?");
        badAnswerNPC.add(7,"Вроде разговаривал...Че с тобой, брат?");
        badAnswerNPC.add(8,"Я начинаю злиться!!!");
        badAnswerNPC.add(9,"Последний раз спрашиваю, да или нет?");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"А на стрёме, это как, я что - то не понял?");
        answerAdventure.add(1,"Да, конечно постою, не вопрос, пацаны!");
        answerAdventure.add(2,"Нет, и вам не советую, иначе появятся проблемы!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Ну что же, думаешь ты, прикупить своей милой? \n\nПрикинув в уме, и поковырявшись в кошельке,"
                + " приходишь к выводу, что на бриллиантовое колье явно не хватит, а вот на хороший букет даже с избытком. \n\nИтак, решено, будем брать цветы!"
                + "Тааак, теперь надо найти, где тут их купить на этом районе? \n\nОглядываешься в поисках, может быть есть рядом, но само собой, рядом цветочного ларька"
                + " не имеется. \n\nИ тут видишь, что навстречу к тебе идёт мужчина, а в руках то у него букет каких то полевых цветов. \n\nЖдёшь, когда он подойдет, и спрашиваешь, где "
                + "можно было бы приобрести такую прелесть, то есть букет с цветами? \n\nОн объясняет, в какую сторону идти, и где повернуть, чтобы уткнуться носом ровно в цветочник! Отлично, погнали!\n\n"
                + "Ты уже дошёл до угла, за поворотом которого лежит твоя цель, как слышишь сзади уже знакомый голос: \n\n''Эээ, братуха, погоди - ка!''. \n\nДа, "
                + "это те самые пацаны с которыми ты уже успел познакомиться. \n\nНо как ваши пути снова пересеклись, это одному богу известно...\n\nТак, ладно, но что им надо то от тебя?"
                + "\n\n''Слышь, чем занят то, братка?''\n - интересуется у тебя тот самый, который разговаривал и в прошлый раз (видимо старший их). \n\n"
                + "''Да дела ещё не доделал. Но пока свободен.''\n - отвечаешь ты. \n\n'' Слышь че, а раз ты свободен, может постоишь на стрёме, у входа в цветочный ларек, у нас там движняк небольшой!'' "
                + "\n - говорит тебе тот самый старшой. \n\nИ ты, немного подумав, отвечаешь: ");
                
      }
    
    
//</editor-fold>

    @Override
    public void addWordsNPC()
      {
       wordsNPC.add(0,"Опана, хали - гали, ты как раз во время!!!"); 
      }

    
    
    
    
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
