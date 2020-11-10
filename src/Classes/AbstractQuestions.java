

package Classes;


import static java.lang.String.valueOf;
import java.util.ArrayList;

public class AbstractQuestions {
    
    boolean correct;
    String test;
    
    
   public void correctAnswer(String question, ArrayList<String> q, String answer, ArrayList<String> a, ArrayList<String>k,int i)
     { 
        if(question.equals(q.get(i)) & answer.equals(a.get(i)))
        {   
            valueOf(k.get(i));
        }
         else
        {
            test = "net";
        }
   
     }
}
   
   
   
   
   
   
    
    
    
     
    
    
    
    

