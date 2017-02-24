
/**
 * Décrivez votre classe voiture ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */


public class moto extends vehicule
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String plaque;
    private String modele;
    private String nom_proprio;

    /**
     * Constructeur d'objets de classe voiture
     */
    public moto(String plaque, String modele, String nom_proprio)
    {
        super(plaque);
        this.modele = modele;
        this.nom_proprio = nom_proprio;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String update_owner(String new_owner)
    {
       return this.nom_proprio = new_owner;
    }
    
    public String get_year()
    {
        return this.plaque.substring(4,8);
    }
   
    
}
