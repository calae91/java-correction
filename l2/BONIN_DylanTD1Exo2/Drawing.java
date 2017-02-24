import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe Drawing ici.
 *
 * @author Bonin Dylan
 * @version 18/03/2016
 */
public class Drawing
{
    private String name;
    private List<Circle> circles;

    /**
     * Constructeur d'objets de classe Drawing
     */
    public Drawing(String name)
    {
        this.name=name;
        this.circles = new ArrayList<Circle>();
    }

    /**
     * Renvoie sous la forme d'une chaînes de caractères les noms de tous les cercles contenus dans le dessin
     */
    public String displayNameCircles()
    {
        String names="";
        for(Circle c : this.circles)
        {
            names+=" "+c.getName();
        }
        return names;
    }
    /**
     * Ajoute un cercle et renvoie vrai s'il n'est pas nul sinon renvoie faux
     */
    public boolean addCircle(Circle cercle)
    {
        if(cercle!=null)
        {
            this.circles.add(cercle);
            return true;
        }
        return false;        
    }
}
