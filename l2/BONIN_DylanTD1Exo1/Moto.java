
/**
 * Décrivez votre classe Moto ici.
 *
 * @author Bonin Dylan
 * @version 18/03/2016
 */
public class Moto extends Vehicule
{

    public Moto(String immatriculation, String modele, String proprietaire)
    {
        super(immatriculation,modele,proprietaire);
    }
    /**
     * renvoie l'année de fabrication
     */
    public int get_year()
    {
        return Integer.parseInt(super.get_immatriculation().substring(4,8));
    }

}
