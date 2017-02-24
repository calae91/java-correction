import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

/**
 * Décrivez votre classe fenetre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fenetre extends JFrame implements ActionListener
{
    private Drapeaux drapeaux=  new Drapeaux();
    
    private JButton Japon = new JButton("Japon");
    private JButton estonie = new JButton("estonie");
    private JButton belgique = new JButton("belgique");
    
    public Fenetre() {
        //titre
        this.setTitle("Drapeaux");
        //dimenssion de la fenetre (300 L, 200 H)
        this.setSize(900,600);
        //fenetre centrée
        this.setLocationRelativeTo(null);
        //fin du programme lorque que j'appuie sur la croix
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLayout(new BorderLayout());
        
       drapeaux.add(Japon);
       drapeaux.add(estonie);
       drapeaux.add(belgique);
       
       Japon.addActionListener(this);
       estonie.addActionListener(this);
       belgique.addActionListener(this);
       this.setContentPane(drapeaux);
       estonie.setOpaque ( false ); 
       estonie.setContentAreaFilled ( false );
       estonie.setBorderPainted ( false );
       this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Japon)
        {
               drapeaux.changetest(1);
               drapeaux.repaint();
        }
        if(e.getSource() == estonie)
        {
               drapeaux.changetest(2);
               drapeaux.repaint();
        }
        if(e.getSource() == belgique)
        {
               drapeaux.changetest(3);
               drapeaux.repaint();
        }
    }
}