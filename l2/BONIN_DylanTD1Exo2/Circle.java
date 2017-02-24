
/**
 * Décrivez votre classe Circle ici.
 *
 * @author Bonin Dylan
 * @version 18/03/2016
 */
public class Circle
{
    private String color;
    private String name;

    /**
     * Constructeur d'objets de classe Circle
     */
    public Circle(String color, String name)
    {
        this.color=color;
        this.name=name;
    }
    /**
     * constructeur surcharger avec seulement le nom de renseigné 
     */
     public Circle(String name)
    {
        this.name=name;
    }
    /**
     * Renvoie le nom du cercle
     */
    public String getName()
    {
       return this.name;
    }
}
