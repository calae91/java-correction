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
public class Fenetre extends JFrame implements WindowListener
{
    private Panneau panneau = new Panneau();
    
   public Fenetre()
   {
       this.setTitle("Cercle");
       this.setSize(800,600);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(panneau);
       addWindowListener(this);
       this.setVisible(true);
       
   }
   public void windowActivated(WindowEvent e)
   {
       panneau.couleur=true;
       panneau.repaint();//appelle le paintComponent
   }
   
   public void windowDeactivated(WindowEvent e)
   {
       panneau.couleur=false;
       panneau.repaint();
   }
   public void windowClosing(WindowEvent e)
   {
       System.exit(0);
   }
   public void windowOpened(WindowEvent e){}
   public void windowIconified(WindowEvent e){}
   public void windowDeiconified(WindowEvent e){}
   public void windowClosed(WindowEvent e){}
}
