import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe Collection ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Collection
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Document> collec;

    /**
     * Constructeur d'objets de classe Collection
     */
    public Collection()
    {
        this.collec= new ArrayList();
    }
    /**
     * ajoute un document
     */
    public void ajouter(Document doc)
    {
        if(doc!=null)
            this.collec.add(doc);
    }
    /**
     * Renvoie une liste de documents ayant dans son titre ou réalisateur/artiste le mot clé 
     */
    public List<Document> rechercher(String motCle)
    {
        List<Document> docs = new ArrayList();
        boolean verif=false;
        for(Document doc:this.collec)
        {
            if((doc.getTitre().equals("*"+motCle+"*")))//vérifier *
                verif=true;
            //if( dvd ou cd ?
        }
        return null;
    }
}
