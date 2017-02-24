
/**
 * Décrivez votre classe voiture ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */


public class voiture extends vehicule
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String plaque;
    private String modele;
    private String nom_proprio;
    private int nbre_porte;

    /**
     * Constructeur d'objets de classe voiture
     */
    public voiture(String plaque, String modele, String nom_proprio, int nbre_porte)
    {
        super(plaque);
        this.modele = modele;
        this.nom_proprio = nom_proprio;
        this.nbre_porte = nbre_porte;
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
