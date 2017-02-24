import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JComponent;
/**
 * Décrivez votre classe Panneau ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Panneau extends JPanel 
{
   public Panneau()
   {
       addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e)
            {
                Disque cercle=null;
                if(SwingUtilities.isLeftMouseButton(e))
                {
                    cercle = new Disque (getX(),getY(),25,Color.red);
                }
                else if(SwingUtilities.isMiddleMouseButton(e))
                {
                    cercle = new Disque (getX(),getY(),50,Color.green);
                }
                else if(SwingUtilities.isRightMouseButton(e))
                {
                    cercle = new Disque (getX(),getY(),75,Color.yellow);
                }
                cercle.dessiner(getGraphics());
            }});
    }
  
}
