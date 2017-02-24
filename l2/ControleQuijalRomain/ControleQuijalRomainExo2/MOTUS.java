import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Décrivez votre classe Palindrome ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MOTUS
{
    public static void lecture()throws IOException
    {
        //RECUPERATION NOM DE FICHIER
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom de fichier :");
        String nom_fichier = sc.nextLine();
        System.out.println("Vous avez saisi : " + nom_fichier);
        // RECUPERATION MOT
        Scanner sca = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String mot = sca.nextLine();
        System.out.println("Vous avez saisi : " + mot);
        int compteur = 0;
        BufferedReader fichier=null;
        
        try{
            String ligne;
            fichier = new BufferedReader(new FileReader(nom_fichier));
            while ((ligne = fichier.readLine()) != null) {
                if(mot.equals(ligne))
                {
                    System.out.println(ligne);
                    compteur++;
                }
            }
           
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Le mot magique " + mot + " figure " +compteur + " fois dans le programme.");
             fichier.close();
        }  
    }
    
}