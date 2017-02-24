
/**
 * Décrivez votre classe Systeme ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Systeme
{
    private String nom;
    
    protected Systeme(String nom)
    {
        this.nom=nom;
    }
    public String getNom()
    {
        return nom;
    }
    public abstract  int taille();
}
