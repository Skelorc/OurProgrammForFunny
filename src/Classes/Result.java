

package Classes;

import GUI.MainMenu;
import static GUI.Viktorina.points;
import java.util.ArrayList;


public class Result {
    
    public ArrayList<String> resultPoints = new ArrayList<>();
    
    public void addResultPoints()
      {
        resultPoints.add(0,MainMenu.NAME+", ты набрал меньше десяти правильных ответов! \n\nНе останавливайся на достигнутом! \nЯ верю что ты способен на большее!");
        resultPoints.add(1,MainMenu.NAME+", твой результат: больше 10 и меньше 20 правильных ответов. Решил разогреться? Ты еще на многие вопросы можешь дать ответы, а то и на все!");
        resultPoints.add(2,"Так держать "+MainMenu.NAME+"! На 40% вопросов ты уже ответил. Сдаешься? Нет, ты же упрямый, и всегда добиваешься победы!");
        resultPoints.add(3,"Совсем неплохо!" + MainMenu.NAME+", ты ответил верно более чем на половину вопросов! Экватор пройден, двигайся дальше!");
        resultPoints.add(4,"Отличный результат! Поздравляю тебя, "+MainMenu.NAME+"!!! Oсталось не так много вопросов до максимального балла! Продолжай в том же духе!");
        resultPoints.add(5,"Ты ответил на все вопросы викторины правильно! Это невероятно! Умнее тебя никого нет! Хотя в этом я никогда не сомневался!");   
      }
    
    public String testResultPoints()
      {
        if(points <= 10)
        {
           return(resultPoints.get(0));
        }
        else if(10< points & points <= 20)
        {
            return(resultPoints.get(1));
        }
        else if(20< points & points <= 30)
        {
           return(resultPoints.get(2));
        }
        else if(30< points & points <= 40)
        {
            return(resultPoints.get(3));
        }
        else if(40< points & points <= 50)
        {
            return(resultPoints.get(4));
        }
        else if(50< points & points <= 60)
        {
            return(resultPoints.get(5));
        }
        return ("Ошибочка вышла, сынок!");
}
}