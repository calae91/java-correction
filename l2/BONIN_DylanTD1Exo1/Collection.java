import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe Collection ici.
 *
 * @author Bonin Dylan
 * @version 18/03/2016
 */
public class Collection
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Vehicule> vehicules;

    /**
     * Constructeur d'objets de classe Collection
     */
    public Collection()
    {
        this.vehicules=new ArrayList<Vehicule>();
    }
    /**
     * Ajoute un vehicule à la liste s'il n'est pas nul
     */
    public void ajouter(Vehicule v)
    {
        if(v!=null) 
            this.vehicules.add(v);
    }
    /**
     * Renvoie une chaîne de caractères contenant les immatriculations des vehicules fabriquer avant "year"  
     */
    public String tri_vehicule(int year)
    {
        String immatriculations="";
        
        for(Vehicule v : this.vehicules)
        {
            if(v.get_year()>year)
               immatriculations+=" "+v.get_immatriculation();
        }
        return immatriculations;
    }
}
