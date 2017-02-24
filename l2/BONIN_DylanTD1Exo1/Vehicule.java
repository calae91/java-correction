
/**
 * Décrivez votre classe abstraite Vehicule ici.
 *
 * @author  Bonin Dylan
 * @version 18/03/2016
 */
public abstract class Vehicule
{
    private String immatriculation;
    private String modele;
    private String proprietaire;
    
    protected Vehicule(String immatriculation, String modele, String proprietaire)
    {
        this.immatriculation=immatriculation;
        this.modele=modele;
        this.proprietaire=proprietaire;
    }
    /**
     * Modifie le nom du proprietaire s'il n'est pas nul
     */
    public void update_owner(String newOwner)
    {
        if(newOwner!=null)
            this.proprietaire=newOwner;
    }
    /**
     * méthode abstraite pour avoir l'année de fabrication
     */
    public abstract int get_year();
    /**
     * retourne l'immatriculation du vehicule
     */
    public String get_immatriculation()
    {
        return this.immatriculation;
    }
}
