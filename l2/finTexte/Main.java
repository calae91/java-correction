 import java.io.*;
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    public static void buffer()throws IOException
    {
         BufferedWriter fichier=null;
           try{
            fichier = new BufferedWriter(new FileWriter("test.txt",true));
            fichier.newLine();
            fichier.write("Fin du fichier");
        }catch(IOException e){
            System.out.println(e.toString());
        }
        finally
        {
            fichier.close();
        }
    }
    public static void randomAccess()throws IOException
    {
         RandomAccessFile fichier=null;
        try{
            fichier = new RandomAccessFile("test.txt","rw");
            fichier.seek(fichier.length());
            fichier.skipBytes((int)fichier.length());
            fichier.writeBytes("fin du fichier");
        }catch(IOException e)
        {
             System.out.println(e.toString());
        }
         finally
        {
            fichier.close();
        }
    }
}
