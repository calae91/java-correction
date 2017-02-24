import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe ChaineRestauration ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChaineRestauration
{
   private List<Restaurant> restaurants;
    
   public ChaineRestauration()
   {
       this.restaurants= new ArrayList<Restaurant>();
   }
   
   public void ajouterRestaurant(Restaurant r)
   {
       if(r!=null)
        this.restaurants.add(r);
   }
   
   public int taille()
   {
         if(this.restaurants!=null)
            return this.restaurants.size();
         return 0;
   }
   
   public Restaurant getRestaurant(int i)
   {
       return this.restaurants.get(i);
   }
}
