

package Game.QuestionsForLevel;

import GUI.MainMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Questions_For_Level_2 extends Questions_For_Level_1 {
    
 


//номер вопроса и ответа.    
   
   

    
    //<editor-fold defaultstate="collapsed" desc="Добавление элементов в коллекции">
   //добавление вопросов в колекцию.
    @Override
   public void addQuestions()
     {
       questions.add(0,"Что у тебя началось, когда пацаны тормознули тебя?");
       questions.add(1,"Как ты представился, когда у тебя спросили, кто ты такой?(два слова)");
       questions.add(2,"Какая поддержка требовалась пацанам, по словам коренастого?");
       questions.add(3,"Что должно быть накрыто пацанам, если у тебя остануться деньги после твоей движухи?");
       questions.add(4,"По мнению коренастого, на районе тебя могли знать по имени или у тебя имелось ... ");
     }
//добавление ответов на вопросы.
    @Override
   public void addAnswers()
     {
       answers.add(0,"волнение");
       answers.add(1,"пацан порядочный");
       answers.add(2,"финансовая");
       answers.add(3,"поляна");
       answers.add(4,"погоняло");
     }
//добавление хороших комментариев.
    @Override
   public void addGoodKommentarii()
     {
       kommentariiGood.add("Всё правильно!");
       kommentariiGood.add(MainMenu.NAME +", ты лучший!");
       kommentariiGood.add("Не останавливайся, братишка!");
       kommentariiGood.add("Да, да, именно так, как ты и сказал!");
       kommentariiGood.add("Ага, едем дальше!");
     }
   
  
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Сетеры и гетеры">
       
    @Override
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
    
    @Override
        public String sortGoodKommentarii()
     {
       if(iteratorGA.hasNext())
       {
            return (String) iteratorGA.next();
       }
       else
       {
        iteratorGA.set(kommentariiGood.get(0));
         sortGoodKommentarii();
       }
       return this.kommentariiGood.get(0);
     }
       
  

   @Override
   public String getBadKommentarii()
     {
       return this.kommentariiBad.get(number);
     }
   
   @Override
   public int getBadKommentariiSize()
     {
       return this.kommentariiBad.size();
     }
   
   @Override
   public String getQuestions()
     {
       return this.questions.get(number);
     }
   
   @Override
   public int getQuestionsArray()
     {
       return this.questions.size();
     }
   
   @Override
   public String getAnswers()
     {
       return this.answers.get(number);
     }
   @Override
   public String getGoodKommentarii()
     {
       return this.kommentariiGood.get(number);
     }
//</editor-fold>
    
    
    
    
   @Override
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
        iteratorGA = this.kommentariiGood.listIterator();
      }
    
   
    

}
