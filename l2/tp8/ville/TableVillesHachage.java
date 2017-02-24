import java.util.LinkedList;

public class TableVillesHachage implements TableVilles {

    //champs: un tableau de TableVilles (implementation par des listes) + une fonction de hachage
    public TableVilles[] table;
    public FonctionHachage hash;

    // constructeur
    public TableVillesHachage(int m, FonctionHachage hash) {
        this.table = new TableVilles [m];
        this.hash=hash;
    }

    // ajoute une ville a la table
    public void ajouterVille(Ville v) {
        if(v!=null)
            this.table[this.hash.hashFunction(v.getLatitude(),v.getLongitude(),this.table.length)].ajouterVille(v);
    }

    // fonction de recherche d'une ville dans la table
    public Ville rechercherVille(double latitude,double longitude){
        return this.table[this.hash.hashFunction(latitude,longitude,this.table.length)].rechercherVille(latitude, longitude);
    }
    
    // fonction retournant le nombre de villes stoquees dans la table
    public int nombreVilles(){
        int nbVilles=0;
        int taille = this.table.length;
        for(int i=0;i<taille;i++)
        {
            nbVilles+=this.table[i].nombreVilles();
        }
        return nbVilles;
    }

    // fonction retournant le nombre de cases de la table contenant un ensemble non vide de villes
    public int remplissage(){
        int rempli=0;
        int taille = this.table.length;
        for(int i=0;i<taille;i++)
        {
            if(this.table[i].nombreVilles()!=0)
            {
                rempli++;
            }
        }
        return rempli;
    }

    // fonction retournant le plus grand ensemble de villes dans la table
    public TableVilles elementMaximal(){
        TableVilles table=null;
        int max=0;
        int taille = this.table.length;
        for(int i=0;i<taille;i++)
        {
            if(this.table[i].nombreVilles()>max)
            {
                max=this.table[i].nombreVilles();
                table = this.table[i];
            }
        }
        return table;
    }
    
    // Donne des infos sur l'ensemble
    public String infos() {
        int max=0;
        int taille = this.table.length;
        for(int i=0;i<taille;i++)
        {
            if(this.table[i].nombreVilles()>max)
            {
                max=this.table[i].nombreVilles();
            }
        }
        return max+"";
    }

    //  Retourne une liste chainee contenant tous les elements stoques
    public LinkedList<Ville> traverser(){
        // completer
         return null;   
  }
}