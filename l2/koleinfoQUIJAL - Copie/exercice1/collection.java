import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe collection ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */
public class collection 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<vehicule> collec;

    /**
     * Constructeur d'objets de classe collection
     */
    public collection()
    {
        collec = new ArrayList();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
    public void ajout_vehicule(vehicule vec)
    {
        if(vec != null)
        collec.add(vec);
    }
    
    public void tri_vehicule(int annee)
    {
        for(vehicule vehi : this.collec)
        {
            int annee_plaque = Integer.parseInt((vehi.plaque).substring(4,8));
            if(annee == annee_plaque)
            {
                System.out.println(vehi.toString());
            }
        }
    }
}
