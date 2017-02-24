
/**
 * Décrivez votre classe Test ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Test
{
   public static void main()
   {
       Restaurant paris = new Restaurant("Paris Marais",50,15);
       Restaurant montreuil = new Restaurant("Montreuil",35,13.5);
       
       paris.vendreMenus(10,2);
       paris.vendreMenus(15,3);
       paris.vendreMenus(14,5);
       
       montreuil.vendreMenus(14,2);
       montreuil.vendreMenus(16,3);
       montreuil.vendreMenus(5,5);
       
       paris.affichage();
       montreuil.affichage();
   }
}
