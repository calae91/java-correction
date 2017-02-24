import java.io.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe note ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class note
{
    public static void lecture()throws IOException
    {
        BufferedReader fichier=null;
        try{
            String ligne, etudiant="";
            
            float moyenne=-1;
            float max=0;
            fichier = new BufferedReader(new FileReader("EtudiantsNotes.txt"));
            while ((ligne = fichier.readLine()) != null) {
               String [] t = ligne.split(" ");
               moyenne = (Float.parseFloat(t[1])+Float.parseFloat(t[2])+Float.parseFloat(t[3])+Float.parseFloat(t[4]))/4;
               if(moyenne > max){
                   max = moyenne;
                   etudiant = t[0];
                }               
            }
             System.out.println(etudiant+" "+moyenne);
           
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            if(fichier != null)
                fichier.close();
        }  
    }
}
