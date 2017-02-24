
/**
 * Décrivez votre classe DVD ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class DVD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String realisateur;
    private int sortie;

    /**
     * Constructeur d'objets de classe DVD
     */
    public DVD(String titre, String realisateur, int sortie)
    {
        super(titre);
        this.realisateur=realisateur;
        this.sortie=sortie;
    }

    /**
     *surchage de toString()
     */
    @Override 
    public String toString()
    {
        return "Titre :"+super.getTitre()+" Réalisateur : "+
        this.realisateur+" Année de sortie : "+this.sortie;
    }
}
