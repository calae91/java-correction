
/**
 * Décrivez votre classe Ville ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ville
{
   private String nom;
   private double latitude;
   private double longitude;
   
   public Ville(double longitude, double latitude, String nom)
   {
       this.nom=nom;
       this.latitude=latitude;
       this.longitude=longitude;
   }
   
   public String toString()
   {
       return this.nom+" latitude : "+this.latitude+" longitude : "+this.longitude;
   }
   
   public double getLatitude(){return this.latitude;}
   public double getLongitude(){return this.longitude;}
   public String getNom(){return this.nom;}
   
   public int compareTo(Ville v)
   {
      return this.compareTo(v.getLatitude(),v.getLongitude());
   }
   public int compareTo(double latitude, double longitude)
   {
       if(this.latitude==latitude && this.longitude==longitude)
        return 0;          
       if((this.latitude > latitude) || (this.latitude==latitude && this.longitude>longitude))
        return 1;
       if(this.latitude < latitude || (this.latitude==latitude && this.longitude<longitude))
        return -1;
       return 2;
   }
}
