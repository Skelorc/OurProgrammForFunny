


package Game.Chapters;

import GUI.MainMenu;
import static Game.Chapters.Game_Chapter_1.answerAdventure;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_9 extends Game_Chapter_8 {
    
    public String nameMusic;
      @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_9.mp3";
   }
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Заключительная глава. Где то здесь должно быть счастье...";
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
        wrongAnswer.add(0,"Владимир удивлённо поднимает брови.\n\n ''Да ладно?''\n- восклицает он.\n\n''Первый раз слышу, что моя доченька собирается замуж. \nНе объясните ли вы мне, дорогие мои, "
                + "что тут происходит? \nНе на ходу ли ты выдумал , что она пойдет за тебя?''\n\nТы, в поисках подтверждения своих слов, перебрасываешь взгляд на свою половинку. \n\n"
                        + "А она, видимо из - за растерянности и неожиданности вдруг заявляет: ''"+MainMenu.NAME + ", ты о чем вообще? \nМожет ты меня с кем то путаешь?''. \n\nНу что за человек, с кем ты можешь её перепутать, что же "
                                + "не подыграла она...\n\nТы начинаешь медленно краснеть, стремясь к окрасу спелого томата, понимая что твоё вранье не пролезло.\n\n''Знаешь, " + MainMenu.NAME + ", я терпеть не могу, когда мне начинают врать, "
                                        + "особенно в таких случаях!''\n - говорит, хмурясь Владимир. \n\nЯ наверное пойду посмотрю, что там по телевизору показывают, так как я потерял к этой беседе всякий интерес.''\n - говорит Вламидир, и "
                                                + "уходит в зал. \n\nТебя просто переполняет стыд, в нетерпении, ты вскакиваешь, начиная собираться... \n\nВот так вот бывает легко всё разрушить одним лживым ответом.");
                
        wrongAnswer.add(1,"Восклицаешь ты, начиная закипать. \n\nПочему она раньше молчала?! \n\nХотела поиграть моими чувствами что - ли? Я поиграю ей!!! \n\nНадо же, ведь скрывала такой важный момент.\n\n"
                + "Кидаешь яростные взгляды на отца с дочкой, затем переводишь вгляд на потерянного Андрея, резко встаешь, и идёшь в прихожую собираться. \n\n"
                + "Из кухни к тебе выбегает твоя ненаглядная, но ты даже не смотришь на неё. \n\nОдеваешься, выскакиваешь в подъезд, с силой хлопая дверью. \n\nЧто я хочу сказать тебе, " + MainMenu.NAME + ""
                        + " иногда ты рубишь с плеча и всё бросаешь, когда можно ещё побороться за своё. \n\nЭто не значит, что нужно идти в разрез со своими убеждениями, но попытаться повернуть ситуацию к себе лицом, можно! \n\nПопробуй сделать это в этот раз!");
        wrongAnswer.add(2,"");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"После длительного молчания с твоей стороны, Владимир решил, что пора брать дело в свои руки. \n\n''Я так понимаю, " + MainMenu.NAME + " в растерянности,"
                + " ну что ж, решение моё принято окончательно и бесповоротно, раз вы оба не против. \nТак что у вас осталось не так много времени побыть вместе, остаток лета пролетит быстро. \nТем более, глядя на тебя, " + MainMenu.NAME + ""
                        + ", я понимаю сейчас, что не хотел бы, чтобы моя девочка осталась с таким, как ты, ведь когда надо принять хоть какое - то решение, ты начинаешь молчать, как рыба, а это, как мне кажется, признак "
                        + " неуверенности в себе.''\n\n Вот так вот, " + MainMenu.NAME + ", он думает что ты не уверен в себе? \n\nДокажи им обратное!!! \nВсё в твоих руках!!!");        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"Твоя любимая просто впивается в тебя глазами, и начинает спокойно говорить:\n\n''Папа, знаешь, я вот тоже не уверена,"
                + " что хочу уезжать, я могу получить такое же образование и в российских ВУЗах! Тем более  " + MainMenu.NAME + " испытывает ко мне глубокие чувства, и настроен очень серьёзно!\n"
                        + "Не так ли?''\n - спрашивает она, глядя на тебя. \n\n''Конечно так, Владимир, я очень люблю вашу дочь, и планирую в недалёком будущем сделать ей предложение!'' \n\n"
                                + "Будущий тесть, глядя на вас, начинает улыбаться. \n\n''Ну это совершенно меняет дело. Мне по - большому счету всё равно, где ты, дорогая моя будешь учиться, "
                                        + "главное чтобы ты была счастлива! \nНу раз  вы приняли решение, я могу только поддержать его со своей стороны.\n\n'' Ну вот и всё, " + MainMenu.NAME + " ты добился результата! \n\nПросто красава, что ещё тут скажешь!\n\n"
                                                + "После этой части не будет этой викторины, я думаю хватит с тебя, " + MainMenu.NAME+". \n\nЕсли у тебя есть какие - то комментарии отностительно этой игры, свяжись с нами, и не важно будут они отрицательные или положительные."
                                                        + "Нам надо знать, интересно ли это людям?! И если интересно, можешь предложить свой сценарий, чем далее займется герой нашей игры! А уж мы попробуем "
                                                        + "описать события с житейской стороны!:) \n\nВ общем будем с нетерпением ждать твоего отзыва, "+ MainMenu.NAME+"!!!");
                
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Задумался, да?");
        badAnswerNPC.add(1,"Ну что скажешь?");
        badAnswerNPC.add(2,"Ей там будет лучше, как не крути!");
        badAnswerNPC.add(3,"...Все смотрят на тебя...");
        badAnswerNPC.add(4,MainMenu.NAME + ",так что ты скажешь на это?");
        badAnswerNPC.add(5,"Молчишь, потому что думаешь, или уснул?");
        badAnswerNPC.add(6,"...Воцаряется короткая пауза...");
        badAnswerNPC.add(7,"Ну " + MainMenu.NAME + ",скажи же!");
        badAnswerNPC.add(8,MainMenu.NAME+", ты давай не зависай!");
        badAnswerNPC.add(9,"Жду ещё несколько секунд и всё!!!");
        
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Моя любимая никуда не поедет, так как мы поженимся!");
        answerAdventure.add(1,"Уезжает? Ну и пусть едет, я держать её не стану!");
        answerAdventure.add(2,"Понятно. А сама она что думает по этому поводу?!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"На улице поздний вечер, вы сидите за семейным столом и мило беседуете на свободные темы.\n\n"
                + "Ты расслабился, Владимир оказался простым мужиком без всяких ''понтов''.\n\nПосле того, как вы познакомились с ним,"
                + " спустя пару часов обстановка уже стала для тебя родной, как будто ты не в гостях, а у себя дома с родными. \n\n"
                +"Твоя девочка болтала не замолкая, кидая на тебя задумчивые взгляды. \n\nПо - тихоньку, ты начал волноваться, что же у неё на уме"
                        + ". \nЧто - то явно не даёт ей покоя, знать бы только что. \n\nИ вот, когда уже и поели, и чай попили, вдруг тебе ,как снег на голову, падает вопрос, который задал Владимир. "
                                + " : \n\n''" +MainMenu.NAME +", а ты знаешь, что моя доча в конце лета уезжает, чтобы получить образование за границей?'' \n\nВот так поворот. \nПервый раз об этом слышишь, "
                                        + "почему же любимая никогда не говорила об этом? \n\nСмотришь на неё, раздумывая над ответом, появляется неловкая пауза, ты всё таки собираешься с силами, и "
                                                + "принимаешь следующее решение: "  );
                 
                
      }

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Ну и что же ты скажешь, на это, а " + MainMenu.NAME + "?!"); 
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
