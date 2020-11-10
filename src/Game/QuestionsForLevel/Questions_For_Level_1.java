

package Game.QuestionsForLevel;

import GUI.MainMenu;
import GameUtilities.Background;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Questions_For_Level_1 {
    
    //вопросы по уровням игры.
   protected ArrayList<String> questions;
    
    //ответы на вопросы.
   protected ArrayList<String> answers;

//номер вопроса и ответа.    
   public int number = 0;
//номер плохого комментария.
 public int numberBadKom = 0;   
//хорошие комментарии к ответам.
   protected ArrayList<String> kommentariiGood;
   
//плохие комментарии к ответам.
   protected ArrayList<String> kommentariiBad;
   
//перебор отрицательных комментариев.
   ListIterator iteratorBA;
//перебор вопросов.
   Iterator iteratorQ;
//перебор положительных комменатариев.
   ListIterator iteratorGA;
   
 
   
    
//<editor-fold defaultstate="collapsed" desc="Добавление элементов в коллекции">
   //добавление вопросов в колекцию.
   public void addQuestions()
     {
       questions.add(0,"Как называют в народе машину, которую ты ждал, стоя на остановке?");
       questions.add(1,"Какое сидение ты занял в салоне автомобиля?");
       questions.add(2,"Какая сумма требовалась, чтобы передать за проезд?");
       questions.add(3,"Какого цвета была маршрутка?");
       questions.add(4,"Что именно ты ссыпал в протянутую ладошку работяги?");
     }
//добавление ответов на вопросы.
   public void addAnswers()
     {
       answers.add(0,"маршрутка");
       answers.add(1,"свободное");
       answers.add(2,"нужная");
       answers.add(3,"жёлтая");
       answers.add(4,"мелочь");
     }
//добавление хороших комментариев.
   public void addGoodKommentarii()
     {
       kommentariiGood.add("Всё правильно!");
       kommentariiGood.add(MainMenu.NAME +", ты красавчик!");
       kommentariiGood.add("Не останавливайся, братишка!");
       kommentariiGood.add("Да, да, именно так, как ты и сказал!");
       kommentariiGood.add("Ага, едем дальше!");
     }
   //добавление плохих комментариев.
    public void addBadKommentarii()
     {
       kommentariiBad.add("Не верно!");
       kommentariiBad.add("Не совсем так!");
       kommentariiBad.add("Не правильно, " + MainMenu.NAME + "!!!");
       kommentariiBad.add("Ты похоже всё позабыл...");
       kommentariiBad.add("Надо было читать внимательнее!!!");
       kommentariiBad.add("Может попробуешь пройти ещё разок?!");
       kommentariiBad.add("Ну как же ты так пропустил этот факт...");
       kommentariiBad.add("Опять...Опять не так!!!");
       kommentariiBad.add("Попробуй ещё разок! Может не то слово пишешь?!");
       kommentariiBad.add("Ну как ты мог забыть это?");
       kommentariiBad.add(MainMenu.NAME + ", я думал, что ты внимательнее!");
       kommentariiBad.add("А давай ты попробуешь ещё раз пройти уровень?");
       kommentariiBad.add("Думаешь, попробывать методом ''тыка'',?!");
       kommentariiBad.add("Короче, свяжись со мной, я тебе подскажу!");
     }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Сетеры и гетеры, методы для перебора комментариев.">
   
   public String sortBadKommentarii()
     {       
      if(iteratorBA.hasNext())
       {
                   
            return (String) iteratorBA.next();
            
       }
       else
       {
         iteratorBA = this.kommentariiBad.listIterator();

         return kommentariiBad.get(0);
       }
       
     }
   
       
   public String sortGoodKommentarii()
     {
       if(iteratorGA.hasNext())
       {

            return (String) iteratorGA.next();
            
       }
       else
       {
         iteratorGA = this.kommentariiGood.listIterator();
         return kommentariiGood.get(0);
       }
       
     }
   
   public String sortQuestions()
     {
       if(iteratorQ.hasNext())
       {
           return (String)iteratorQ.next();
       }
       else
       {
           return null;
       }
       
     }

    
   
   public String getBadKommentarii()
     {
       return this.kommentariiBad.get(number);
     }
   
   public int getBadKommentariiSize()
     {
       return this.kommentariiBad.size();
     }
   
   public String getQuestions()
     {
       return this.questions.get(number);
     }
   
   public int getQuestionsArray()
     {
       return this.questions.size();
     }
   public int getQuestionsIndex()
     {
       return this.questions.indexOf(this);
     }
   
   public String getAnswers()
     {
       return this.answers.get(number);
     }
   public String getGoodKommentarii()
     {
       return this.kommentariiGood.get(number);
     }
//</editor-fold>
    
    
    
    
    public void addElementsToTheCollections()
      {
        questions = new ArrayList();
        addQuestions();
        answers = new ArrayList();
        addAnswers();
        kommentariiGood = new ArrayList();
        addGoodKommentarii();
        kommentariiBad = new ArrayList();
        addBadKommentarii();        
        iteratorBA = this.kommentariiBad.listIterator();
        iteratorQ = this.questions.iterator();
        iteratorGA =  this.kommentariiGood.listIterator();
      }
    
    
    

}
