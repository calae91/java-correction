import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe drawing ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */
public class drawing
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Circle> Cercle;
    private String name;
    /**
     * Constructeur d'objets de classe drawing
     */
    public drawing(String name)
    {
        this.name = name;
        Cercle = new ArrayList();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
    public void addCircle(Circle C)
    {
        if(C != null)
        Cercle.add(C);
    }
    
    public String toString()
    {
        String cercle="";
        for(Circle C : this.Cercle)
        {
            cercle+=C.toString(); 
        }
        return cercle;
    }
    
    public void afficher_noms()
    {
        for(Circle C : this.Cercle)
        {
            System.out.println(C.toString());
        }
    }
}
