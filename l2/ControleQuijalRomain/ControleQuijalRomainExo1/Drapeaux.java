import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Drapeaux extends JPanel {
    
    private int test;
    
    public Drapeaux(){
        this.test = 1;
    }
    
    public void paintComponent(Graphics g) { //this.getWidth() 
        if (test == 3)
        {
            //Belgique drapeua
            g.setColor(Color.black);
            g.fillRect(0,0,300,600);
            
            g.setColor(Color.yellow);
            g.fillRect(300,0,300,600);
            
            g.setColor(Color.red);
            g.fillRect(600,0,300,600);
        }
        if (test == 2)
        {
            g.setColor(Color.blue);
            g.fillRect(0,0,900,200);
            
            g.setColor(Color.BLACK);
            g.fillRect(0,200,900,200);
            
            g.setColor(Color.white);
            g.fillRect(0,400,900,200);
        }
        if (test == 1)
        {
            g.setColor(Color.white);
            g.fillRect(0,400,900,200);
            g.fillRect(0,200,900,200);
            g.fillRect(0,0,900,200);
            
            g.setColor(Color.red);
            g.fillOval(380, 200, 150, 150);
            
        }
    }
    
    
    public void changetest(int a)
    {
        if (a==1)
            this.test = 1;
        if (a==2)
            this.test = 2;
     
    }
}

