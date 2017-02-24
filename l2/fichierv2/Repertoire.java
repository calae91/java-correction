import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe Repertoire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Repertoire extends Systeme
{
   private List<Systeme> contenu;
   
   public Repertoire(String nom)
   {
       super(nom);
       this.contenu = new ArrayList<Systeme>();
   }
   public void ajouter(Systeme s)
   {
       if(s != null && super.getNom() != s.getNom())
        this.contenu.add(s);
   }
   public int taille()
   {
       int taille = 0;
       for(Systeme s : this.contenu)
        taille += s.taille();
       return taille;
   }
}
