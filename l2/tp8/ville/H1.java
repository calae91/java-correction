
public class H1 implements FonctionHachage {
    
    // coordonnees de la boite englobante (qui contient toutes les villes de France)
    static double longMin=-10., longMax=10.;
    static double latMin=40., latMax=60.;

    public int hashFunction(double latitude, double longitude, int m) {
        return modulo((int)Math.floor(latitude),m);
	}
	
	public static int modulo(int x, int n)
	{
	    if(x>=0)return x%n;
	    else return (n-Math.abs(x%n))%n;
	}
	

}
