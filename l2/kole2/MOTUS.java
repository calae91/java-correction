import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Décrivez votre classe Palindrome ici.
 *
 * @author (calae91)
 * @version (2.0)
 */
public class MOTUS
{
    public static void lecture()throws IOException
    {
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Voulez vous créer un fichier : choix 1 ou utiliser un fichier : choix 2");
        String choix = scan4.nextLine();
        
        if(choix.equals("1"))
            {       
                try{
                
                    File ff = null;
                    
                    System.out.println("nom du fichier ?");
                    Scanner scan5 = new Scanner(System.in);
                    String name = scan5.nextLine();
                    
                    String name2 = name +".txt";
                    ff=new File(name2);
                    
                    System.out.println(name2);
                    
                    ff.createNewFile();
                    
                    System.out.println("Success");
                    
                    FileWriter ffw = new FileWriter(ff);
                    
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("Entrez le texte voulu :");
                    String texter = scan3.nextLine();
                    
                    ffw.write(texter);// écrire une ligne dans le fichier resultat.txt
                    ffw.close(); // fermer le fichier à la fin des 
            
                } catch(IOException e){System.out.println(e.toString());}
            }
        
        //RECUPERATION NOM DE FICHIER
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom de fichier :");
        String nom_fichier = sc.nextLine();
        System.out.println("Vous avez saisi : " + nom_fichier);
        // RECUPERATION
    
        Scanner sca = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String mot = sca.nextLine();
        System.out.println("Vous avez saisi : " + mot);
        int compteur = 0;
        BufferedReader fichier=null;
    
            try{
            String ligne;
            String[] Mot = null;
            fichier = new BufferedReader(new FileReader(nom_fichier));
            while ((ligne = fichier.readLine()) != null) {
                
                Mot = ligne.split(" ");
                for(String mots:Mot)
                    {
                    if(mots.equals(mot))
                    {
                        System.out.println(mot);
                        compteur++;
                    
                    }
                    
                    /*
                    if(mot.equals(ligne))
                    {
                        System.out.println(ligne);
                        compteur++;
                        */
                    }
                
            }
           
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Le mot magique " + mot + " figure " +compteur + " fois dans le programme.");
            //fichier.close();
        }  
    }
    
}
