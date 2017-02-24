
/**
 * Décrivez votre classe CD ici.
 *
 * @author (calae91)
 * @version (1.0)
 */
public class CD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String artiste;
    private int nbTitre;
    

    /**
     * Constructeur d'objets de classe CD
     */
    public CD(String titre, String artiste, int nbTitre)
    {
        super(titre);
        this.artiste = artiste;
        this.nbTitre = nbTitre;
    }

    /**
     * surchage de toString()
     */
    @Override
    public String toString()
    {
        return "Titre : "+super.getTitre()+" Artiste : "+this.artiste+
        " Nombre de titres : "+this.nbTitre;
    }
}
