

package Game.QuestionsForLevel;


public class Questions_For_Level_4 extends Questions_For_Level_3 {
       //добавление вопросов в колекцию.
   @Override
   public void addQuestions()
     {
       questions.add(0,"Что было изображено на вывеске аптеки?(два слова)");
       questions.add(1,"Кто стоял в очереди последним, пока ты не пришёл?");
       questions.add(2,"Что ты осматривал, пока очередь двигалась к кассе?");
       questions.add(3,"Как назвал тебя мужик, когда попросил пару соток?");
       questions.add(4,"Чтобы заработать себе денег на напитки, мужик отправился на ...");
     }
//добавление ответов на вопросы.
   @Override
   public void addAnswers()
     {
       answers.add(0,"красный крест");
       answers.add(1,"мужик");
       answers.add(2,"товар");
       answers.add(3,"малой");
       answers.add(4,"вокзал");
     }

   
   

}
