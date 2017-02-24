import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;;
import java.awt.*;
import java.awt.event.*;

public class Sommet extends JPanel {
    
    private int test;
    
    public Sommet(){
        this.test = 1;
    }
    
    public void paintComponent(Graphics g) { //this.getWidth() 
       
            
             try {
  
              Image img = ImageIO.read(new File("AlpeBis.jpg"));
              g.drawImage(img, 0, 0, this);
              //Pour une image de fond
              //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            } catch (IOException e) {
              e.printStackTrace();
            }
         
        }
  }
    
    
 


