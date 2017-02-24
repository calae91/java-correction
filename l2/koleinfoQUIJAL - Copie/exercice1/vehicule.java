
/**
 * Décrivez votre classe abstraite véhicule ici.
 *
 * @author (Quijal Romain)
 * @version (18/03/2016)
 */
public abstract class vehicule
{
    // variable d'instance - remplacez cet exemple par le vôtre
    public String plaque;

    /**
     * Un exemple de méthode concrète
     *
     * @param  y    le paramètre de cette méthode
     * @return        la somme de x et de y
     */
    protected vehicule(String plaque)
    {
        this.plaque = plaque;
    }

    /**
     * Un exemple de méthode abstraite
     * @param  y    le paramètre de cette méthode
     * @return        qui sait ?
     */
    @Override
   public String toString()
   {
       return this.plaque;
   }
    
}
