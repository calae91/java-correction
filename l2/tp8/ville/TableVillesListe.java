import java.util.LinkedList;
/**
 * Décrivez votre classe TableVillesListe ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TableVillesListe implements TableVilles
{
    private LinkedList<Ville> villes;
    
    public TableVillesListe()
    {
        this.villes= new LinkedList<Ville>();
    }
    public void ajouterVille(Ville v)
    {
        if(v!=null)
        {
            this.villes.add(v);
        }
    }
    public Ville rechercherVille(double latitude, double longitude)
    {
        for(Ville v:this.villes)
        {
            if(v.getLatitude()==latitude && v.getLongitude()==longitude)
                return v;
        }
        return null;
    }
    public int nombreVilles()
    {
        return this.villes.size();
    }
    public String infos()
    {
        return Integer.toString(nombreVilles());
    }
    public LinkedList<Ville> traverser()
    {
        return this.villes;
    }
}
