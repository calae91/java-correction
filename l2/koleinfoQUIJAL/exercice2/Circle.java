
/**
 * Décrivez votre classe Circle ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */
public class Circle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String color;
    public String name;

    /**
     * Constructeur d'objets de classe Circle
     */
    public Circle(String color, String name)
    {
        this.color = color;
        this.name = name;
    }
    /*
    public void dessiner_cercle()
    {
        if(this.color != null)
            Cercle(this.name, this.color);
        else
            Cercle(this.name, orange);
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getName()
    {
        return this.name;
    }
    
}
