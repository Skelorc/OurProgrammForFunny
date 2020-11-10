

package Classes;

import GameUtilities.Background;
import Game.GUI. Training;
import static Game.GUI. Training.easyQuestions;
import static Game.GUI. Training.hardQuestions;
import static Game.GUI. Training.mediumQuestions;
import static Game.GUI. Training.n;
import static Game.GUI.Game_Choice_Difficulty.speedGame;
import GUI.MainMenu;
import static GUI.Viktorina.points;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.trim;
import static GameUtilities.Background.startBattle_With_Boss;


public class Proverka {
     
   
      
    ArrayList<String> questions;
    ArrayList<String> test;
    String z;
    int a;
        int g = 0;
        int b = 0;
    
    
    public void proverka(ArrayList<String> qu, ArrayList<String> an, int n, JTextArea q, JTextField a, JButton j)
      {
        
        
        
        if(qu.get(n).equals(q.getText()))
        {
            if(an.get(n).equals(toLowerCase(trim(a.getText()))))
            {
               
                
                an.remove(n);
                qu.remove(n);
                points++;
                j.setEnabled(false);
                Background.showGoodGifAndPlayGoodMusic();
                
            }
            else
            {
                
              Background.showBadGifAndBadMusic();
            }
            
        }
      }
    
/**
 * Ниже метод для определения правильности ответа в игре. */
    public void proverkaOtvetaGame(JTextArea q, JTextArea a,JTextArea tf, ArrayList<String> goodKom,ArrayList<String> badKom)
      {
        
        if(q.getText().equalsIgnoreCase((trim(a.getText()))))
        {
             if(g >= goodKom.size())
            {
                g = 0;
            }
            tf.setText(goodKom.get(g));
//            playMisic("Materials\\\\Sounds\\\\other\\\\что это было.mp3");
           
            g++;
            n++;
            
        }
        else
        {   
            if(b >= badKom.size())
            {
                b = 0;
            }
            tf.setText(badKom.get(b));
            b++;
//            playMisic("Materials\\\\Sounds\\\\other\\\\машина зверь.mp3");
        }
     
      }
    
    
    
    public void vyvod(ArrayList<String> questions, JTextArea question,JTextField answer, int n)
      {
             
      question.setText(questions.get(n));
      answer.setText("");
           
      };  
 //
    public void proverkaLevelDifficult(int number, JProgressBar slider, JTextArea areaForQuestions,  JTextArea areaForProgram, JTextArea areaForUser )
      {
        switch (number) {
           
            
            case 1:
                if(n>=easyQuestions.size())
                {
                    areaForQuestions.setText("Ты прошёл легкий уровень! Теперь можно отправиться уже в реальную жизнь! Ты готов, " + MainMenu.NAME+"?");
                     Training.startPractice.setVisible(false);
                    areaForProgram.setEditable(false);
                    Training.stopPractice.setVisible(false);
                    areaForUser.setEditable(false);
                    Training.startAdventure.setVisible(true);
                    return;
                }
                areaForQuestions.setText(easyQuestions.get(n));
                
                startBattle_With_Boss(slider, easyQuestions,areaForProgram,areaForUser,n,speedGame);
                
                break;
            case 2:
                if(n>=mediumQuestions.size())
                {
                    areaForQuestions.setText("Неужели ты прошел средний уровень? Теперь попробуй пройти игру на нём же!");
                     Training.startPractice.setVisible(false);
                     Training.stopPractice.setVisible(false);
                    areaForProgram.setEditable(false);
                    areaForUser.setEditable(false);
                    Training.startAdventure.setVisible(true);
                    return;
                }
                areaForQuestions.setText(mediumQuestions.get(n));
                startBattle_With_Boss(slider, mediumQuestions,areaForProgram,areaForUser,n,speedGame);
                break;
            case 3:
                if(n>=hardQuestions.size())
                {
                    areaForQuestions.setText("КАК, как ты это сделал????!!! Ты и правда РЕАЛЬНЫЙ пацан! Ну теперь посмотрим, как ты справишься со всем тем, что мы для тебя подготовили!");
                     Training.startPractice.setVisible(false);
                      Training.stopPractice.setVisible(false);
                    areaForProgram.setEditable(false);
                    areaForUser.setEditable(false);
                    Training.startAdventure.setVisible(true);
                    return;
                }
                areaForQuestions.setText(hardQuestions.get(n));
                startBattle_With_Boss(slider, hardQuestions,areaForProgram,areaForUser,n,speedGame);
                break;
            default:
                areaForQuestions.setText("Выбери уровень сложности, авторитет!");
                break;
        }
       
      }
    
}
    
       


