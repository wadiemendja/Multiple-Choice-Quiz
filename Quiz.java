import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class Quiz {
    public static void main(String[] args) throws InterruptedException {
        
      JFrame window = new JFrame ("Quiz Game") ;  
      window.setSize(800,500);
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setResizable(false);

    while (true) {  
      
      int nbr =0 , score=0 , m=0 , s=0 ;
      int time = 60 ; //sec  
        
      welcomePage welcome = new welcomePage (window);
      welcome.choose(time);
        
        quiz2 [] qObj = {
            new quiz2("Question 1","op1","op2","op3","op4","op1","hint 1"),
            new quiz2("Question 2","op1","op2","op3","op4","op4","hint 2"),
            new quiz2("Question 3","op1","op2","op3","op4","op3","hint 3"),
            new quiz2("Question 4","op1","op2","op3","op4","op2","hint 4")
        };
        
        while (nbr != qObj.length && s<time ) {
            questions quiz = new questions(qObj[nbr], window);
            quiz.getAnswer(time); 
            m = quiz.getTime().M ;
            s = quiz.getTime().S ;
            score = quiz.getScore();
            if (nbr == qObj.length-1 || (s==time)) quiz.Reset();
            nbr++ ;
        }
        
        int nbrQ = qObj.length ;  
        scorePane scorePane = new scorePane (window,score,nbrQ) ;
        scorePane.choose();
     
     }    
      
    }    
}