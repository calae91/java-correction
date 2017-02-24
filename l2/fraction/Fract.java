
/**
 * Décrivez votre interface Fract ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */

public interface Fract
{
   public int getNumerateur();
   public int getDenominateur();
   public final Fraction ZERO = new Fraction(0,1);
   public final Fraction UN = new Fraction(1,1);
   public double toDoubleNum();
   public double toDoubleDen();
   public Fraction addition(Fraction f1, Fraction f2);
   public int PGCD(int x, int y);
   public boolean equals(Fraction f1, Fraction f2);
   public String toString();
   public int compareTo(Fraction f1, Fraction f2);
}
