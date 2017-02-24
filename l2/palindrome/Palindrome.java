import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.nio.charset.Charset;
/**
 * Décrivez votre classe Palindrome ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Palindrome
{
    public static void lecture()throws IOException
    {
        BufferedReader fichier=null;
        try{
            String ligne;
            fichier = new BufferedReader(new FileReader("palindrome.txt"));
            while ((ligne = fichier.readLine()) != null) {
                if(checkPalindrome(ligne))
                {
                    System.out.println(ligne);
                }
            }
           
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
             fichier.close();
        }  
    }
    private static boolean checkPalindrome(String mot)
    {
        String palindrome="";
        mot = mot.replaceAll(" ","");
        int taille = mot.length()-1;
        for(int i=taille;i>=0;i--)
        {
            palindrome+=mot.charAt(i);
        }
        return palindrome.equals(mot);
    }
    private static void lectureAllLines()throws IOException
    {
         List<String> texte;
          try{
            String ligne;
            Charset charset;
            Path path = Paths.get("palindrome.txt");
            texte = Files.readAllLines(path,Charset.forName("ISO-8859-1"));
             for (String l : texte) {
                if(checkPalindrome(l))
                {
                    System.out.println(l);
                }
             }
           
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }
}
