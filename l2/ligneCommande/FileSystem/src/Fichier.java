
/**
 * Décrivez votre classe Fichier ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class toto extends Systeme
{
   private int taille;
   
   public Fichier(String nom, int taille)
   {
       super(nom);
       this.taille = taille;
	   
	   
   }
   public int taille()
   {
       return this.taille;
   }
}
