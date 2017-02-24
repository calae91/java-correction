
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
   public static void main(String [] args)
   {
       
       double a,b,c;
       try
       {
           a=Double.parseDouble(args[0]);
           b=Double.parseDouble(args[1]);
           c=Double.parseDouble(args[2]);
           calculRacine(a,b,c);
       }
       catch(ArrayIndexOutOfBoundsException AIOOBE)
       {
           System.out.println("Le nombre d'arguments n'est pas bon, vous devez saisir 3 valeurs ");
       }
       catch(NumberFormatException NFE)
       {
           System.out.println("Vous devez entrer des chiffres"); 
       }
       catch(Exception e)
       {
           System.out.println("Erreur  "+e);
       }
   }
   public static double calculRacine(double a, double b, double c)throws IllegalArgumentException
   {
     double delta;
       
     if(a==0)
        throw new IllegalArgumentException("'a' ne peut pas être égale à 0");    
     delta=Math.pow(b,2)-4*a*c;
    
     if(delta<0)
        throw new IllegalArgumentException("pas de solution, delta < 0");
     return (-b+Math.sqrt(delta))/(2*a);
   }
}
