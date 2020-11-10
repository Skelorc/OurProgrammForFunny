

package Game.QuestionsForLevel;


public class Questions_For_Level_3 extends Questions_For_Level_2{
    
    //добавление вопросов в колекцию.
   @Override
   public void addQuestions()
     {
       questions.add(0,"Оперативники какой федеральной службы тебя задержали? (надо указать аббревиатуру) ");
       questions.add(1,"Что именно интересовало оперов?");
       questions.add(2,"Что тебе не давало нормально дышать, когда тебя скрутили?");
       questions.add(3,"Как один оперативник обратился по имени к другому, когда просил обыскать твои карманы?");
       questions.add(4,"Какое имя упоминается вместе со словом ''таверна''?");
     }
//добавление ответов на вопросы.
   @Override
   public void addAnswers()
     {
       answers.add(0,"собр");
       answers.add(1,"закладка");
       answers.add(2,"лужа");
       answers.add(3,"саня");
       answers.add(4,"авиценна");
     }

 
   
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
   
}
