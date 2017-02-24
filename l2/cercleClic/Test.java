import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
/**
 * Décrivez votre classe Fenetre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Test extends JFrame
{
    private Panneau panneau = new Panneau();
    
   public Test()
   {
       this.setTitle("Cercle");
       this.setSize(800,600);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(panneau);
       addMouseListener(this);
       this.setVisible(true);       
   }   

}
