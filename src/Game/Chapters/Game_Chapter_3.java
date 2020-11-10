

package Game.Chapters;

import GUI.MainMenu;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class Game_Chapter_3 extends Game_Chapter_2 {
    public String nameMusic;
    
     @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_3.mp3";
   }
      
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава третья. В поисках грааля...";
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
        wrongAnswer.add(0," - А я смотрю, этот парень то весельчак? \n\nНу ничего, мы сейчас сядем в нашу машину, и все там вместе повеселимся, да, пацанчик? \n\n- с этими словами, "
                + "тебя резко поднимают, скручивают руки за спиной, между делом тыкают пару раз под дых, наверное чтобы начал шутки получше вспоминать. \n\nДалее закидывают в машину, как бревно, справа и слева,"
                + "садятся опера, и тут то начинается веселье...\n\nЧестное слово, ты никогда ещё так не смеялся, всё тело потом пару недель от смеха болело! \n\nСамо собой, на следующее утро, когда тебя, "
                + "уже изрядно навеселившись, выпустили, не было и речи куда - либо ехать, кроме как домой...\n\nТы конечно, " + MainMenu.NAME + ", парень весёлый,"
                        + " но иногда шутить не стоит!");
        wrongAnswer.add(1,"''Вооо, вот это понимаем, красавчик, нам нравятся такие ребята, как ты. \n\nСейчас проверим, настолько ли крепки твои яйца, насколько дерзки слова!'' \n\n- после этого короткого монолога, на тебя защелкивают наручники,"
                + "и закидывают на заднее сиденье, слово мешок с костями, по бокам садятся опера, и вы направляетесь...\n\nКак ты думаешь, куда вы направляетесь?\n\n"
                + "Всё правильно думаешь, едете вы, проверять твою стойкость духа.\n\nПодруга тебя так и не дождалась в тот день... \n\nЯ знаю, храбости, " + MainMenu.NAME+", тебе не занимать, но иногда стоит усмерить свой пыл!");
        wrongAnswer.add(2,"");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"Видимо оперативникам надоедает твоём мычанье и сопенье, поэтому они с силой поднимают тебя, скручивают руки, и запихивают в машину. \n\n"
                + "Там, по пути в отдел, продолжается допрос с пристрастием, ты продолжаешь отмалчиваться, сколько хватает терпения. \n\nВ отделе тебя пробивают по базе, "
                + "держат до полуночи, снова и снова, проводя допрос, и уже ближе у утру приходят к выводу, что ошиблись, ты не тот кто им нужен. \n\nТебя выпустили, когда уже рассвело."
                + "\n\nВот и съездили называется к девушке на рандеву, да" + MainMenu.NAME +"?");        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0,"Ты слышишь как один из них говорит другому :\n\n''Cаня, проверь - ка его карманы, может и правда не он!''. \n\nТебя обыскивают, и ничего запрещённого не находят."
                + " \n\nПоднимают, извиняются, запрыгивают обратно в свою машину и с пробуксовкой, уезжают. \n\nНу слава богу, ты уж было подумал, что всё, приплыли...\n\nНу ничего страшного,"
                + " всяко бывает в жизни. \n\nТы приводишь себя в порядок, отряхиваешься, стираешь с лица грязь, ладно ещё в кармане завалялся носовой платок, иначе так бы и ходил, грязный как поросёнок. "
                + "\n\nДумаешь, что пожалуй бы хватит на сегодня таких неприятных ситуаций, и начинаешь шагать в поисках таверны ''Авиценны'', то есть "
                + "аптеки, для покупки ''средств индивидуальной защиты'', ведь без них возможен риск стать отцом раньше того момента, когда ты будешь реально готов к этому.\n\n"
                + "Ладно, пошли дальше!");
      }

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Лучше не дёргайся, иначе хуже будет..."); 
      }
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Че ты там мычишь?");
        badAnswerNPC.add(1,"Ты всё нам скажешь, падла!");
        badAnswerNPC.add(2,"Ты как - то грубанул только что?");
        badAnswerNPC.add(3,"Воды не напился ещё?");
        badAnswerNPC.add(4,"Ты сейчас создашь себе проблем...");
        badAnswerNPC.add(5,"Ты не догоняешь, что реально ПРИЛИП?");
        badAnswerNPC.add(6,"...Тебя снова тыкают лицом в грязь...");
        badAnswerNPC.add(7,"Будешь колоться, или тебя расколоть?");
        badAnswerNPC.add(8,"Ты вроде не рыба, разговаривать умеешь!");
        badAnswerNPC.add(9,"Ещё разок, и твоя песенка спета!");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"У меня дома в учебнике лежит на 256 странице! А зачем она вам?");
        answerAdventure.add(1,"Вы че, волки позорные, да я порву вас, обмылки недоношенные!");
        answerAdventure.add(2,"Вы меня с кем - то перепутали, у меня батя сам сотрудник!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Выйдя из двора, видишь, что погода наладилась, аж сразу как то легче на душе стало.\n\n"
                + " Помнишь, что ещё надо зайти за небольшими покупками. \n\nПо обеим сторонам "
                + "тебя окружают хрущёвки(ох уж эти спальные районы), и среди них ты вдруг различаешь полицейскую сирену!\n\n"
                + "Думаешь про себя:"
                + "\n - Ну так же не бывает,  эти то точно должны мимо проехать. \nПо - моему хватит на сегодня приключений - надеяшься ты, но судьба считает иначе."
                + " \n\nТолько ты поворачиваешь за угол дома, где находится"
                + " проезжая часть, как видишь, что та самая машина, проезжает рядом, резко останавливается перед тобой, из неё выбегают крепкие ребята, с надписью на спине ''СОБР''.\n\n "
                + " Они окружают тебя, и с криком: \n\n''Не рыпайся, а то хуже будет!''\n\n - кладут тебя лицом прямиком в лужу. \n\nНу что за день то такой...\n\nТы не слишком горишь желанием "
                + "похлебать водички с грязью , поэтому стараешься вывернуть голову, чтобы вода не попадала в ноздри, и пытаешься понять что же всё - таки происходит вокруг. \n\nВ этот момент, твою голову задирают назад, схватив за волосы,  "
                + "и, ты слышишь вопрос: \n\n'' Где ''закладка''?'' \n\nТы шокирован, не можешь даже понять, о какой такой ''закладке'' идёт речь, крепыш, тебя снова тыкают лицом в лужу, даёт возможность подышать через жабры...\n\n"
                + "Но, так как способностью дышать под водой ты явно не обладаешь, начинаешь пускать пузыри и задыхаться, что - то хрипя...\n\nТебя снова за загривок отрывают от умывальни, и задают тот же самый вопрос, "
                + "на который ты отвечаешь: ");
                
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
