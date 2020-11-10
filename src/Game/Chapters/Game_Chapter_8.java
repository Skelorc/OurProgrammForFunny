

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


public class Game_Chapter_8 extends Game_Chapter_7{
    
    public String nameMusic;
      @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_8.mp3";
   }
      
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава восьмая. К такому меня жизнь не готовила...";
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
        wrongAnswer.add(0,"''Какой такой друг, мы только познакомились! \n\nТы же говорил, что ты встречаешься с ней!''\n - восклицает Андрей. \n\nВот же блин, "
                + "мог бы и подыграть! \n\nВот значит как, а ты думал, что эта тема пролезет. \n\nТак как теперь будем выкручиваться. \n\n''Да, я встречаюсь с ней, просто растерялся,"
                + "не знал что ответить. ''\n - говоришь ты, и , честными глазами смотришь на отца девушки. \n\n''Нет, друг, с вранья знакомство не начинают. "
                + "\nЯ ещё и передам дочке чтобы подумала, стоит ли продолжать ваши отношения. \nАндрей проходи, а этот лжец, может идти погулять!''\n - говорит её отец,"
                + "пропуская Андрея внутрь, и закрывая перед твоим носом дверь. \n\nТы стоишь несколько секунд, тупо глядя в пространство. \n\n"
                + "Да уж, вранье не всегда приводит к цели. \n\nРазворачиваешься, и уходишь... \n\nТы не смог попасть к девушке!!!");
                
        wrongAnswer.add(1,"''Так это про тебя она рассказывала, что очень воспитанный и хороший парень? \n\nСудя по тому, как ты разговариваешь с незнакомым человеком,"
                + " воспитания в тебе маловато. \n\nПохоже привык с быдлом общаться, да? \n\nНу себя, и свою семью я такими не считаю, так что прошу тебя не обременять моё скромное жилище"
                + " своим присутствием. \n\nАндрей, проходи, а этот пусть тут погуляет.''\n - с этими словами, он пропускает Андрея, и отворачиваясь, захлопывает дверь.\n\n"
                + "Чёрт, как будь то ведром грязи облили, что ж так то сразу на корню рубить, может я из - за волнения так сказал. \n\nБлин, "
                + "как теперь быть, ведь не стану я после такого знакомства, снова звонить в дверь. \n\nС этими мыслями, ты поворачиваешься и уходишь в обратном направлении.\n\n"
                + "Ты не попал к твоей малышке, так что попробуй ещё разок! ");
        wrongAnswer.add(2,"");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"''Короче, Андрей, давай проходи, а этот молодой человек пусть проветрится, раз разговаривать не в состоянии. \nПозже, если отойдет, "
                + "может зайти, но я сомневаюсь, что такие амёбы могут придти в себя.'' \n\nОн запускает Андрея в квартиру, и, кинув на тебя презирающий взгляд, захлапывает дверь.\n\n"
                + "Блин, как же так, что я молчал, то? Ну теперь идти к ней в гости явно не ''в цвет.'' \n\nРазворачиваешься, и с грустной миной, идёшь к лифту. \n\nНу что ж, браток..."
                + " ты не попал к ней. \n\nПопробуй ещё разок!");
        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"Отец, поднимая брови, спрашивает: \n\n''Каким таким родственником! О чем это ты?''\n\nДа, я встречаюсь с вашей дочкой!"
                + " \nЯ думал, она вам про меня рассказывала.''\n - говоришь ты, начиная улыбаться. \n\n''Ааа, точно - точно, ты же " + MainMenu.NAME + " ,\n она много про тебя говорила."
                + "\n\nНу держи ладошку, будем знакомы. \n\nМеня зовут Владимир!''\n - улыбаясь восклицает будущий тесть, и протягивает руку для пожатия. \n\nТы, насколько есть силы, пытаешься сжать его ладонь, "
                + "но он мужик крепкий, только шире начинает улыбаться, и сдавливает твою так, как будто в гидравлических тисках побывал. \n\nНу и ладно, главное познакомились!\n\n"
                + "Он проходит вглубь прихожей, вы следом за ним. \n\n''Папа, кто там пришёл?''\n - слышится голос твоей голубки из квартиры. \n\n''Гости, выходи встречать!''\n - ответил Владимир.\n\n"
                + "\n\n''Сейчас подойду!''\n - слышится от твоей любимой. \n\nПока происходил этот диалог, вы с Андреем скинули обувь, и Владимир повёл вас на кухню, там всех рассадил, и тут (наконец - то, свершилось чудо!) "
                + "пришла твоя любимая. \n\nТы хотел бы расцеловать и потискать её, а может что и побольше:)), но в таких обстоятельствах делать так не лучший вариант, поэтому оставалось только сухо поприветствовать и обнять её...\n\n"
                + "Готовься, " + MainMenu.NAME + ", грядет заключительная часть этой истории!!!");                
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Ну, слушаю вас, молодые люди!");
        badAnswerNPC.add(1,"Что молчите то?");
        badAnswerNPC.add(2,"Ну чего зависли?");
        badAnswerNPC.add(3,"...Молча смотрит на вас...");
        badAnswerNPC.add(4,"Алё, ребята, что с вами?");
        badAnswerNPC.add(5,"Слышите, вы чего в ступоре что ли?");
        badAnswerNPC.add(6,"...Оглядывает тебя с головы до ног...");
        badAnswerNPC.add(7,"Андрей, ты то что молчишь?");
        badAnswerNPC.add(8,"Вы по пути укололись чем - то , да?");
        badAnswerNPC.add(9,"Последний раз спрашиваю, что надо?");
        
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Да, да, я, друг Андрея, мы чай попьём, и я срулю!");
        answerAdventure.add(1,"Да я не к тебе, а вообще - то к твоей дочурке пришёл!");
        answerAdventure.add(2,"Да, я, друг Андрея, а скоро стану ещё и родственником!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Вы заходите в лифт, и ты нажимаешь на панели кнопку последнего этажа. \n\nПока поднимаетесь, получше знакомишься с "
                + "Андреем. \n\nОказывается он работает в сфере строительства, и его командировали к вам город, для строительства нового Института. \nОкончил ВУЗ, недавно женился. \nВ общем средний класс. :) "
                + "\n\nТы рассказываешь коротко о себе. \nВы поднимаетесь на свой этаж, подходите к квартире, Андрей звонит в дверь. \n\nПроходит несколько "
                + "долгих секунд, с той стороны двери слышны быстрые шаги, дверь открывается и на пороге ты видишь какого - то мужика. \n\nСудя как ОНА похожа на открывшего дверь, это её отец. \n\n"
                + "А вы ведь незнакомы, что ж твоя ненаглядная не сказала, что батя её дома. \n\nВот же неловко получается, а ты даже для знакомства ничего не взял. "
                + "\n\nОтец девушки смотрит на вас и выдаёт: \n\n''Андрей, это кого ты привёл? Друга что - ли уже успел завести?''. \n\nАндрей, услышав это, в свою очередь поворачивает голову к тебе,"
                + " судя по всему, он удивлен не меньше тебя, только другим моментом, тем, что ты не знаком с отцом своей девушки. \n\nНе растерявшись, ты отвечаешь:  "
                + "");
                 
                
      }

    @Override
    public void addWordsNPC()
      {
       wordsNPC.add(0,"Ну и кто же ты такой, парень?!"); 
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
    
    


