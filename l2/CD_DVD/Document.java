
/**
 *classe abstraite pour les cds et dvds.
 *@author Dylan Bonin
 */
public abstract class Document
{
    // variable d'instance - remplacez cet exemple par le vôtre
   private String titre;

    /**
     * retourne titre
     */
    
    public String getTitre()
    {
        return this.titre;
    }
    public Document(String titre)
    {
        this.titre=titre;
    }
    

}
