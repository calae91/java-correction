
/**
 * Décrivez votre classe Restaurant ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Restaurant
{
   private String nom;
   private int nbPlaces;
   private double prix2Plats;
   private int nb2PlatsVendu;
   private int nb3PlatsVendu;
   private int nb5PlatsVendu;
   private int nbClients;
   
   public Restaurant(String nom, int nbPlace, double prix)
   {
       this.nom=nom;
       this.nbPlaces=nbPlace;
       this.prix2Plats=prix;
       this.nb2PlatsVendu=0;
       this.nb3PlatsVendu=0;
       this.nb5PlatsVendu=0;
       this.nbClients=0;
   }
   
   public int NombrePlacesDisponibles()
   {
       return this.nbPlaces-nbClients;
   }
   
   public void vendreMenus(int nombre, int quelMenu)
   {
       switch(quelMenu)
       {
           case 2: this.nb2PlatsVendu+=nombre;
           break;
           case 3: this.nb3PlatsVendu+=nombre;
           break;
           case 5: this.nb5PlatsVendu+=nombre;
       }
   }
   
   public void remiseAZero()
   {
       this.nb2PlatsVendu=0;
       this.nb3PlatsVendu=0;
       this.nb5PlatsVendu=0;
       this.nbClients=0;
   }
   
   public double chiffreAffaires()
   {
       return this.prix2Plats*this.nb2PlatsVendu+this.nb3PlatsVendu*(this.prix2Plats*1.2)+this.nb5PlatsVendu*(this.prix2Plats*1.5);
   }
   
   public double tauxRemplissage()
   {
       return (this.nbClients/this.nbPlaces)*100;
   }
   
   public int getNombresPlaces(){return this.nbPlaces;}
   public int getNombresClients(){return this.nbClients;}
   
   @Override
   public String toString()
   {
       return "nom : "+nom+" nombre de places : "+nbPlaces+" prix du menu à 2 plats "+prix2Plats+" Nombre de menu à 2 plats vendus "
       +nb2PlatsVendu+" Nombre de menu à 3 plats vendus "+nb3PlatsVendu+" Nombre de menu à 5 plats vendus "+nb5PlatsVendu+" Nombre de clients "+nbClients; 
   }
   
   public void affichage()
   {
       System.out.print("Restaurant : "+nom+ "\n Nombres de places : "+nbPlaces+"\nPrix du menu à 2 plats "+prix2Plats+" euros \n"+nb2PlatsVendu+
       " menu à 2 plats vendus, \n"+nb3PlatsVendu+" menu à 3 plats vendus, \n"+nb5PlatsVendu+"  menu à 5 plats vendus,\n\n");
   }
}
