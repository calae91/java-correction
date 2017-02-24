import java.awt.Color;
import java.awt.Graphics;
/**
 * Décrivez votre classe Disque ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Disque
{
  private int x;
  private int y;
  private int rayon;
  private Color couleur;
  public Disque(int x, int y, int rayon, Color couleur)
  {
      this.x=x;
      this.y=y;
      this.rayon=rayon;
      this.couleur=couleur;
  }
  public void dessiner(Graphics g)
  {
      g.setColor(this.couleur);
      g.fillOval(this.x,this.y,this.rayon,this.rayon);
  }
}
