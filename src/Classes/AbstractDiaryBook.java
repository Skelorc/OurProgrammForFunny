

package Classes;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static java.lang.String.valueOf;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.MONTH;

import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class AbstractDiaryBook  {
    GregorianCalendar gc = new GregorianCalendar();
    SimpleDateFormat formatForDate = new SimpleDateFormat("Запись создана - yyyy-MM-dd, Текущее время - hh-mm-ss ");
    Date date = new Date();
    Date today = Calendar.getInstance().getTime();
    String dateNow = formatForDate.format(today.getTime());
    
    String months[] = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", 
         "Октябрь", "Ноябрь", "Декабрь"}; 
      public File dirn = new File("Дневник настоящего мужика");
       
      public File dir = new File("Дневник настоящего мужика\\Дневник " + months[gc.get(MONTH)]);
      
      public File f = new File("Дневник настоящего мужика\\Дневник " + months[gc.get(MONTH)] + "\\"+dateNow);
       
     
     
     FileWriter fw;   
     JDialog dialog;
    
    
    public void createDirectory() throws IOException
      { 
        dirn.mkdir();
        dir.mkdir();
        
       }
    
    public void createNewFile() throws IOException
      {
         f.createNewFile();
      }
    
    
    
    public String getQuestion(String question)
      {
            return ("question");
      }
    
    public String getAnswer(String answer)
      {
        return ("answer");
      }
    
    public void writeToFileDate() throws IOException
      {     fw = new FileWriter(f,true);
        
        fw.write(valueOf(this.formatForDate.format(date)));
        fw.write("\n");
        fw.flush();
        fw.close();
      }
    
    public void writeToFileAfterChange(File file, String text) throws UnsupportedEncodingException, IOException
    {
        text = new String(text.getBytes("ANSI-1251"),"ANSI-1251");
        fw = new FileWriter(file);
        fw.write(text);
        fw.flush();
        fw.close();        
    }
    
    public void writeToFile(String question,String answer) throws IOException
      {  answer = new String(answer.getBytes("ANSI-1251"),"ANSI-1251");
          fw = new FileWriter(f,true);
             fw.write(question);
             fw.write("\n");
             fw.write("\n");
            fw.write(answer);
             fw.write("\n");
             fw.write("\n");
             fw.write("~~~~~~~~~~~~");
             fw.flush();
             fw.close();
         }
    
    public void CheckFile()
      {
           if(dir.exists() == false & f.exists() == false)

           {    
             try {
                   createDirectory();
                   createNewFile();
             } catch (IOException ex) {
                 getLogger(AbstractDiaryBook.class.getName()).log(SEVERE, null, ex);
             }
           }else
           {    
               
           } 
      }
    
    public void CheckFile(String question, String answer) throws IOException
      {
          
           if(dir.exists() == false & f.exists() == false)
           {    
               createDirectory();
               createNewFile();
               
           }else
           {    
               writeToFile(question, answer);
           }
      }
    public void newRecord() throws IOException
      {     fw = new FileWriter(f,true);
        
        fw.write("\n");
        fw.write("Новая запись. Сегодня: ");
        fw.flush();
        fw.close();
      }
         public void saveRecord() throws IOException
      {     fw = new FileWriter(f,true);
        
        this.fw.flush();
        this.fw.close();
      }

  public void deleteFile(JFileChooser chooser)
  {
     AbstractAction abstractAction = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JFileChooser jFileChooser = (JFileChooser) actionEvent.getSource();

                try
                {
                    File selectedFile = jFileChooser.getSelectedFile();

                    if (selectedFile != null)
                    {
                        int selectedAnswer = JOptionPane.showConfirmDialog(null, "Are you sure want to permanently delete this file?", "Confirm", JOptionPane.YES_NO_OPTION);

                        if (selectedAnswer == JOptionPane.YES_OPTION)
                        {
                            Files.delete(selectedFile.toPath());
                            jFileChooser.rescanCurrentDirectory();
                        }
                    }
                } catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }

      
    
      
  };
             }

    
    
}
    

