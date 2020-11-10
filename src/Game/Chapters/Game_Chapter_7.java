

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


public class Game_Chapter_7 extends Game_Chapter_6 {
    
public String nameMusic;
  @Override
   public String setNameMusic ()
   {
       return this.nameMusic = "src\\\\Materials\\\\Sounds\\\\game\\\\chapter_7.mp3";
   }
      
    @Override
    public String setNameChapter()
      {
         return this.nameChapter = "Глава седьмая. Друг или враг?!";
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
        wrongAnswer.add(0,"''Ты сам ГОВНО, ты как разговариваешь с людьми???!!!''\n - кричит тебе в ответ паренёк, выворачивается, успевает садануть тебе ботинком по голени, "
                + "и забегает внутрь! \n\nТы в ярости, начинаешь набирать номер квартиры своей девушки! \n\nОна поднимает трубку, и ты кричишь: \n\n''ШАЛАВА, я всё знаю!"
                + " Открывай сраную дверь, или я подожгу дом!!!''. \n\nВ ответ просто тишина, она не знает что и сказать тебе на это! \n\nТы продолжаешь орать матом у подъезда, "
                + "и успокаиваешься, только когда с первого этажа на тебя в ответ кричит женщина, чтобы ты не лаял, как собака, ведь она пытается уложить спать младенца! \n\n"
                + "Ты начинаешь неистово колотить цветами об дверь, разбрасываешь продукты у подъезда, пинаешь стоящую неподалеку лавку, и "
                + "быстрым шагом уходишь домой...\n\nТы не попал к своей девушке, и да, она не ШАЛАВА, всё немного не так, "+MainMenu.NAME+"!");
                
        wrongAnswer.add(1,"");
        wrongAnswer.add(2,"С этими словами, ты даёшь ему ещё секунду на то, чтобы он осознал свою ошибку, и сильно вдалбливаешь ему ребром ладони по носу. \n\n"
                + "Кровь резко устремляется по носовым пазухам, на его рубашку, ноги подкашиваются, но ты продолжаешь удерживать его, одной рукой, в это же время "
                + "подмолаживая другой. \n\nПосле целой серии точных ударов, отпускаешь свою жертву, и набираешь на домофоне цифры квартиры своей милой!\n\n"
                + " Она поднимает трубку, ты кричишь: \n\n''Это кто такой был, мать твою за ногу?''. \n\n''Ааа, вы познакомились да? Это мой братишка приехал двоюродный, "
                + "10 лет не виделись, давайте поднимайтесь, я уже заждалась!!!''. \n\nТы опускаешь глаза на её брата, и понимаешь, что знакомство ваше совершенно не удалось."
                + " \n\nКак теперь к ней идти, да и вообще стоит ли идти в будущем? \n\nКладёшь рядом с ним пакет, цветы, разворачиваешься и уходишь...\n\nВсегда проясняй ситуацию, и не делай"
                + " поспешных выводов, "+MainMenu.NAME +"!");
      }
    
    @Override
    public void addBadEndGame()
      {
        badEndGame.add(0,"Он ещё постояв пару секунд смотрит на тебя, затем, вырывается и заходит внутрь, захлопнув дверь.\n\n"
                + " Ты стоишь в ступоре...\n\nКак она могла так поступить, ведь она знает, что ты едешь в гости к ней...\n\nИли она забыла...\n\nПостояв ещё недолгое время"
                + " ты разворачиваешься, кидаешь пакет с продуктами и цветы тут же у входа, и устремляешься в обратном направлении... \n\nВот это поворот, "
                + "даже я в шоке от происшедшего...\n\nНО, я кое - что потом узнал, и хочу сказать тебе , что ты ошибся, она не изменяла тебе. \n\nТы просто сделал поспешный вывод, "+MainMenu.NAME+"!");
        
      }
    
    @Override
    public void addGoodAnswerNPC()
      {
        goodAnswerNPC.add(0," Парень спрашивает тебя: \n\n''Я к сестре, а ты кто?''. \n\nВот это поворот, первый раз слышишь о том, что у неё "
                + "есть брат. \n\n''Она не говорила, что у неё есть брат!''\n - отвечаешь ты , продолжая его за шкирку держать. \n\n''Так я только сегодня приехал!"
                + "\n\nЯ двоюродный брат, мы не виделись лет 10 наверное. \n\nВот приехал по работе в город, решил сестру увидеть! Ты то кто?''"
                + "\n\n''Она моя девушка!''\n - говоришь ты, отпуская его. \n\nБоевой раж начинает спадать, ты понимаешь, что всё хорошо, это всего лишь брат, "
                + "а не ухажер!\n\n Отлично. \n\n''Ну извини, дружище, я уж было подумал что она рога мне ставит! \n\n Меня "+MainMenu.NAME+" зовут''\n - говоришь ты, протягивая пятерню "
                + "для рукопожатия. \n\n''Да уж бывает! А я Андрюха!''\n - со смехом выдаёт её брат, пожимая твою руку. \n\nВы вместе заходите в подъезд, направляясь к лифту!"
                + "\n\nТы как никогда близок к заветной квартире!!!");                
      }
    
    
    
    
    @Override
    public void addBadAnswerNPC()
      {
        badAnswerNPC.add(0,"Отпусти, че держишь?");
        badAnswerNPC.add(1,"Ну че вцепился то?");
        badAnswerNPC.add(2,"Чё смотришь?");
        badAnswerNPC.add(3,"Отпусти, мне идти надо!");
        badAnswerNPC.add(4,"Ты дурак что-ли, выпусти, кому сказал!");
        badAnswerNPC.add(5,"Да не убегу, я, говори, че хотел?");
        badAnswerNPC.add(6,"Ну говори, не томи душу, че надо?");
        badAnswerNPC.add(7,"Алё, очнись! Чё хотел то?");
        badAnswerNPC.add(8,"Да лапу убери свою!!!");
        badAnswerNPC.add(9,"Будешь стоять и дальше так, я уйду!");
        
      }
    
    @Override
    public void addAnswerAdventure()
      {
     
        answerAdventure.add(0,"Слышь, говно, тебе то чё тут надо??");
        answerAdventure.add(1,"Эээ, пацанчик, а ты к кому это намылился, а?!");
        answerAdventure.add(2,"Ну ты, терпила, ты по - моему квартиру перепутал!!!");
      }
    
    @Override
    public void addTextWithAdventure()
      {
        textWithAdventure.add(0,"Вечерело, но ты уже близок к дому своей ненаглядной. \n\nНа улице тепло и многолюдно, люди идут кто куда: "
                + "кто с работы, скорее в магазин, купить покушать и домой, улечься перед теликом; \nдругие наоборот, шагают на остановку, ждут общественного транспорта, и едут вкалывать , "
                + "третьи вышли на прогулку, и.т.д. \n\nНу а ты,"+MainMenu.NAME+" , на подходе к подъезду. \n\nВот уже видна входная дверь, около неё, какой - то паренёк,"
                + " разговаривает по мобильному телефону. \n\nПодходишь ближе и видишь, как паренёк договорил и набирает на домофоне, комбинацию, которая очень знакома тебе.\n\n"
                + " Вот те раз! \n\nСердце болезненно сжалось, ты уже стоишь за его спиной. \n\nСлышишь три долгих гудка, затем голос своей милой : \n\n''Кто там?'',\n\n"
                + "на что парень ей отвечает:\n\n''Малышка, это я!''. \n\nМузыкальный проигрыш, означающий, что магнитный замок разблокирован, дверь открывается, а "
                + "вместе с дверью, появляется кровавая рана в твоей душе. \n\nЭто кто же, мать его, такой? \n\nТы хватаешь парня за воротник, резко разворачиваешь его лицом к себе, и,"
                + " утробным голосом говоришь: ");
                 
                
      }
    
    
//</editor-fold>

    @Override
    public void addWordsNPC()
      {
        wordsNPC.add(0,"Ты че, психопат???!!!"); 
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
