
/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChaineCryptee
{
    /**
     * attributs de ma classe
     */
    private int decalage;
    private String chaine;
   

    
     public static ChaineCryptee deCryptee(String chaine, int decalage)
    {
        return new ChaineCryptee(chaine, decalage);
    }
    
    public static ChaineCryptee deEnClair(String chaine, int decalage)
    {
        
        return new ChaineCryptee(chaine, decalage);
    }
    
    /**
     * Constructeur chaîne, décalage
     */
    private ChaineCryptee(String chaine, int decalage)
    {
       if(chaine==null)
            chaine="";
       this.chaine=chaine;
       this.decalage=decalage;
    }

    /**
     * Retourne l'attribut chaine
     *
     * @return"chaine" en clair
     */
    public String deCrypte()
    {
        if(this.chaine == null)
            return "Erreur chaîne null";
        String chiffree="";
        char c;       
        int taille = this.chaine.length();
        for(int i=0;i<taille;i++)
        {
            c=this.chaine.charAt(i);
            chiffree+=(c<'A'||c>'Z')?c:(char)(((c +'A'+ this.decalage)%26)-'A');
        }
        return chiffree;
    }
    
    /**
     * Chiffre la chaine et la retourne
     */
    private static String crypte(String chaine, int decalage)
    {
        if(chaine == null)
            return "Erreur chaîne null";
        String chiffree="";
        char c;       
        int taille = chaine.length();
        for(int i=0;i<taille;i++)
        {
            c=chaine.charAt(i);
            chiffree+=(c<'A'||c>'Z')?c:(char)(((c -'A'+ decalage)%26)+'A');
        }
        return chiffree;
    }
    
   
    
}
