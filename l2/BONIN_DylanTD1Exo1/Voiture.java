
/**
 * Décrivez votre classe Voiture ici.
 *
 * @author Bonin Dylan
 * @version 18/03/2016
 */
public class Voiture extends Vehicule
{
    private int nbPorte;

    /**
     * Constructeur d'objets de classe Voiture
     */
    public Voiture(String immatriculation, String modele, String proprietaire, int nbPorte)
    {
       super(immatriculation,modele,proprietaire);
       this.nbPorte= nbPorte;
    }
    /**
     * renvoie l'année de fabrication 
     */
    public int get_year()
    {
        return Integer.parseInt(super.get_immatriculation().substring(0,4));
    }

}
