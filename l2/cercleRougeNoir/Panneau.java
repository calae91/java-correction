import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.*;
/**
 * Décrivez votre classe Panneau ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Panneau extends JPanel
{
   public boolean couleur;
   
   public Panneau()
   {
       this.couleur=true;
   }
   public void paintComponent(Graphics g)
   {
       if(this.couleur)
        g.setColor(Color.red);
       g.fillOval(50, 50, 100, 100);
   }
}
