package in404.exo61;
import toto/clientServ.jar;

public class Main
{
    public static void main()
    {
        Serveur s = new Serveur();
        Client c1 = new Client("Benjamin");
        Client c2 = new Client("Yoann");
        Client c3 = new Client("Dylan");
    
        c1.seConnecter(s);
        c2.seConnecter(s);
        c3.seConnecter(s);
        
        c3.envoyer("Bonjour");
    }
    
}
