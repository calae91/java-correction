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
    private Sommet sommet = new Sommet();
    

    
    public Fenetre() {
        //titre
        this.setTitle("Alpe D'Huez");
        //dimenssion de la fenetre (300 L, 200 H)
        this.setSize(1815,1104);
        //fenetre centrée
        this.setLocationRelativeTo(null);
        //fin du programme lorque que j'appuie sur la croix
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       this.setContentPane(sommet);
       
      
                 
                // pas de layout manager pour cette fenêtre : 
                // on positionnera les composants à la min
                sommet.setLayout(null);
                 
                // création des boutons
                JButton b2 = new JButton("Signal de l'homme");
                 
                // ajout des boutons à la fenêtre
     
                sommet.add(b2);
                 
                // positionnement et dimensionnement manuel des boutons
              
                b2.setBounds(900, 150, 40, 40);
                
                b2.setOpaque ( false ); 
                b2.setContentAreaFilled ( false ); 
                b2.setBorderPainted ( false );
                                 
                // quitter le programme lorsqu'on ferme la fenêtre
           
                // dimensionnement en affichage de la fenêtre
     
        
       this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
       
              if(sommet = b2)
              {system.exit(0);}
               sommet.repaint();
               
        }
    
    
}