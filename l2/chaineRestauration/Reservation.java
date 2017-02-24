import java.util.Scanner;
/**
 * Décrivez votre classe Reservation ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Reservation
{
   public static void test()
   {
       Restaurant paris = new Restaurant("Paris Marais",50,15);
       Restaurant montreuil = new Restaurant("Montreuil",35,13.5);
       ChaineRestauration chaine = new ChaineRestauration ();
       boolean venteTerminée=false;
       Scanner scanner = new Scanner(System.in);
       int numero,nombreMenu,menu;
       
       chaine.ajouterRestaurant(paris);
       chaine.ajouterRestaurant(montreuil);      
       
       while(!venteTerminée)
       {
           numero=scanner.NextInt();
           if(numero>chaine.taille())
                System.out.println("Ce restaurant n'existe pas");
           else
           {
               chaine.getRestaurant(numero).affiche();
               System.out.println("Entrez le numero du menu");
               menu=scanner.NextInt();
               System.out.println("Entrez le nombre de menu voulu");
               nombreMenu=scanner.NextInt();
               
           }
       }
       
       
   }
}
