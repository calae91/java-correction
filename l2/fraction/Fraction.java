
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction implements Fract
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private final int numerateur;
    private final int denominateur;

    /**
     * Constructeur d'objets de classe Fraction
     */
    public Fraction()
    {
        this.numerateur=0;
        this.denominateur=1;
    }

    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur=numerateur;
        this.denominateur=denominateur;
    }
    public Fraction (int numerateur)
    {
        this.numerateur=numerateur;
        this.denominateur=1;
    }
    public int getNumerateur()
    {
        return numerateur;
    }
    public int getDenominateur()
    {
        return denominateur;
    }
    public double toDoubleDen()
    {
        return (double)this.denominateur;
    }
    public double toDoubleNum()
    {
        return (double)this.numerateur;
    }
    public int PGCD(int a, int b)
    {
      int c;
      if(a<b)
      {
          c=a;
          a=b;
          b=c;
      }
      if(b==0)
         return a;
      return PGCD(b, a%b);
    }
    public Fraction addition(Fraction f1, Fraction f2)
    {
        Fraction resultat;
        int pgcd;
        if(f1.getDenominateur()==f2.getDenominateur())
        {
            resultat = new Fraction(f1.getNumerateur()+f1.getNumerateur(),f2.getDenominateur());
        }
        else
        {
            pgcd = PGCD(f1.getDenominateur(),f2.getDenominateur()); 
            resultat = new Fraction(f1.getNumerateur()/pgcd+f1.getNumerateur()/pgcd,pgcd);
        }  
        return resultat;
    }
    public boolean equals(Fraction f1, Fraction f2)
    {
        return f1.getNumerateur()/f1.getDenominateur()==f2.getNumerateur()/f2.getDenominateur();
    }
    public String toString()
    {
        return this.getNumerateur()+"/"+this.getDenominateur();
    }
    public int compareTo(Fraction f1, Fraction f2)
    {
        if(f1.equals(f2))
            return 0;
        if(f1.getNumerateur()/f1.getDenominateur()>f2.getNumerateur()/f2.getDenominateur())
            return 1;
        else
            return -1;
            
    }
    
}
