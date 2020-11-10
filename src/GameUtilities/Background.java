

package GameUtilities;



import static GUI.Splash.loading;
import Game.GUI.Game_Adventure;
import static Game.GUI.Game_Choice_Difficulty.speedGame;
import static GameUtilities.Background.workerMusic;
import java.awt.Color;
import static java.awt.Color.red;
import static java.lang.String.valueOf;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;


public class Background {
    
    public static void startSplash()
      {
          SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
              @Override
              protected Void doInBackground() throws Exception
                {   
                  for(int i = 0; i < 22000; i++)
                    {   
                        
                        sleep(80);
                        loading.setValue(i);
                                   
                    }
                  return null;
                }
              
              @Override
              protected void done()
                {
                               
                     
                }
              };
          worker.execute();
          worker = null;
      }
    
    protected static SwingWorker<Void, Void> workerMusic;
      
    
     public static Object playMusic(String fileName)
      { 
     workerMusic = new SwingWorker<Void, Void>() {
              @Override
              protected Void doInBackground() throws Exception
                {   
                  {                    
                    Sound_Player.stopMusic();
                    Sound_Player.playMusic(fileName);                                      
                    }
                  
                  return null;
                }
                      
              };
          workerMusic.execute();
          return workerMusic;          
      }
     protected static SwingWorker<Void, Void> workerMusicPlayer1;
     public static Object playMusicPlayer1(String fileName)
      { 
     workerMusicPlayer1 = new SwingWorker<Void, Void>() {
              @Override
              protected Void doInBackground() throws Exception
                {   
                  {                    
                    Sound_Player.stopMusicPlayer1();
                    Sound_Player.playMusicPlayer1(fileName);                                      
                    }
                  
                  return null;
                }
                      
              };
          workerMusicPlayer1.execute();
          return workerMusicPlayer1;          
      }
     
     public static void showGoodGifAndPlayGoodMusic()
       {
         SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
              @Override
              protected Void doInBackground() throws Exception
                {   
                  {
               Show_GIF. showGoodGif();
                Sound_Player.playGoodSounds();

                    }
                  return null;
                }
                      
              };
          worker.execute();
          worker = null;
       }
     
     public static void showBadGifAndBadMusic()
       {
         SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
              @Override
              protected Void doInBackground() throws Exception
                {   
                  {
               Show_GIF.showBadGif();
                Sound_Player.playBadSounds();

                    }
                  return null;
                }
                      
              };
          worker.execute();
          worker = null;
       }
     
     public static void startMusicForGame()
       {
         SwingWorker<Void,Void> worker = new SwingWorker<Void, Void>() {
             @Override
             protected Void doInBackground() throws Exception
               {{
                  Sound_Player.stopMusic();
                  Sound_Player.playSoundsForGame(); 
               }
             return null;
         }
       };
     worker.execute();
      worker = null;
}
     
     static SwingWorker<Void, Void> workerBattle; 
    
     
     
     
     public static void startBattle_With_Boss(JProgressBar slider, ArrayList<String> questions, JTextArea program, JTextArea area1,int number,int speed)
       {
         
         workerBattle = new SwingWorker<Void, Void>()
         {
             @Override
             protected Void doInBackground() throws Exception
               {  area1.setEditable(true);
                  slider.setMaximum(questions.get(number).length());
                  slider.setForeground(Color.GREEN);
                  
                  for(int i = 0; i <=questions.get(number).length(); i++)
                  {
                                          
                     slider.setValue(i);
                     
                     sleep(speed);
                     
//                     Background.startMusicForGame();
                     
                     program.setText(valueOf(questions.get(number).substring(0,i)));
                     if(slider.getPercentComplete()>0.3)
                     {
                         slider.setForeground(Color.YELLOW);
                     }
                     if(slider.getPercentComplete()>0.75)
                     {
                         slider.setForeground(red);
                     }
                     
                  }
                  area1.setEditable(false);
                  
                  return null;
               }
         };
                 
         workerBattle.execute();
        
         
       }
     
     public static void writeTextForAdventure(String adventure, JTextArea textArea)
       {
            workerBattle = new SwingWorker<Void, Void>()
         {
             @Override
             protected Void doInBackground() throws Exception
               {  
                  DefaultCaret caret = new DefaultCaret();
                  caret.setUpdatePolicy(ALWAYS_UPDATE);
                  
                  for(int i = 0; i <=adventure.length(); i++)
                  {
                       textArea.setText(valueOf(adventure.substring(0,i)));
                       Thread.sleep(42);
                       textArea.setCaret(caret);
                                    
                  }
             
                 
                 Game_Adventure.quickly.setEnabled(false);
                 Game_Adventure.readyToGo.setEnabled(true);
                  return null;
               }
         };
                 
         workerBattle.execute();                                  
       }
     
     public static void writeAnswerNPC(String adventure, JTextArea textArea)
       {
            workerBattle = new SwingWorker<Void, Void>()
         {
             @Override
             protected Void doInBackground() throws Exception
               { 
                  DefaultCaret caret = new DefaultCaret();
                  caret.setUpdatePolicy(ALWAYS_UPDATE);
                  
                  for(int i = 0; i <=adventure.length(); i++)
                  {
                       textArea.setText(String.valueOf(adventure.substring(0,i)));
                       Thread.sleep(42);
                       textArea.setCaret(caret);
                                    
                  }
//                      Game.start.setEnabled(true);              
                  
                  return null;
               }
         };
                 
         workerBattle.execute();
        
                    workerBattle = null;                 
       }
     
      public static void startGame(JProgressBar slider, ArrayList<String> questions, JTextField area1,int number)
       {
         
         workerBattle = new SwingWorker<Void, Void>()
         {
             @Override
             protected Void doInBackground() throws Exception
               {  
                   area1.setEditable(true);
                  slider.setMaximum(questions.get(number).length());
                  slider.setForeground(Color.GREEN);
                  
                  for(int i = 0; i <=questions.get(number).length(); i++)
                  {
                                          
                     slider.setValue(i);
                     
                     sleep(speedGame);
                                                                                  
                     if(slider.getPercentComplete()>0.3)
                     {
                         slider.setForeground(Color.YELLOW);
                     }
                     if(slider.getPercentComplete()>0.75)
                     {
                         slider.setForeground(red);
                     }
                     
                  }
                  area1.setEditable(false);
                  
                  return null;
               }
         };
                 
         workerBattle.execute();
        
         
       }
     
     public static void endGame(JTextArea textArea, String text)
     {
         workerBattle = new SwingWorker<Void, Void>()
         {
             @Override
             protected Void doInBackground() throws Exception
               {  
                  DefaultCaret caret = new DefaultCaret();
                  caret.setUpdatePolicy(ALWAYS_UPDATE);
                  
                  for(int i = 0; i <=text.length(); i++)
                  {
                       textArea.setText(valueOf(text.substring(0,i)));
                       Thread.sleep(25);
                       textArea.setCaret(caret);
                                    
                  }
                             
                  return null;
               }
         };
                 
         workerBattle.execute(); 
         
         
         
     }
     
     public static void stopGame()
       {
              try{
                  workerBattle.cancel(true);
                    workerBattle = null;
              }
              catch(Exception ex)
              {
                  
              }
              
         
       }
     public static void stopMusic()
     {
         try{
             
             workerMusic.cancel(true);
             workerMusic = null;
         }
         catch(Exception ex)
         {
             
         }
     }
         
       };
       
       
       
    

