import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class welcomePage extends JPanel {
    
    JButton play ,
            howItWorks ,
            about ,
            exit ;
    
    static boolean go  = false ;
    
    welcomePage(JFrame window) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);
        
        play = new JButton ("Play");
        play.setBackground(new Color(255,255,255)) ;
        play.setBounds(300,50,200,50);
        add(play);
        
        howItWorks = new JButton ("How It Works");
        howItWorks.setBackground(new Color(255,255,255)) ;
        howItWorks.setBounds(300,150,200,50);
        add(howItWorks);
        
        about = new JButton ("About");
        about.setBackground(new Color(255,255,255)) ;
        about.setBounds(300,250,200,50);
        add(about);
        
        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(300,350,200,50);
        add(exit);
        
        window.setVisible(true);
        
    }
    
    void choose (int time) {
        
        play.addActionListener((ActionEvent e) -> {
            go = true ;
            setVisible(false);
        });
        
        howItWorks.addActionListener((ActionEvent e) -> {
            new how(time);
        });
        
        about.addActionListener((ActionEvent e) -> {
            new about () ;
        });
        
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        go = false ;
    
    }
    
}