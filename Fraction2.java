/* Fraction.java  A class (data type) definition file
   This file just defines what a Fraction is
   This file is NOT a program
   ** data members are PRIVATE
   ** method members are PUBLIC
*/
public class Fraction
{
	private int numer;
	private int denom;

	// ACCESSORS
	public int getNumer()
	{
		return numer;
	}
	public int getDenom()
	{
		return denom;
	}
	public String toString()
	{
		return numer + "/" + denom;
	}

	// MUTATORS
	public void setNumer( int n )
	{
		numer = n;
	}
	public void setDenom( int d )
	{
		if (d!=0)
			denom=d;
		else
		{
			System.out.print("Cannot divide by zero");
			System.exit(0);
		}
	}

	// DEFAULT CONSTRUCTOR - no args passed in
	public Fraction(  )
	{
		this( 0, 1 ); // "this" means call a fellow constructor
	}

	// 1 arg CONSTRUCTOR - 1 arg passed in
	// assume user wants whole number
	public Fraction( int n )
	{
		this( n, 1 ); // "this" means call a fellow constructor

	}

	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{
		setNumer(n);
		setDenom(d);
		reduce();
	}

	// COPY CONSTRUCTOR - takes ref to some already initialized Fraction object
	public Fraction( Fraction other )
	{
		this( other.numer, other.denom ); // call my full C'Tor with other Fraction's data
	}

	//USE RECURSION TO FIND GREATEST COMMON FACTOR
	//HELPER METHOD FOR REUCE()
	public int gCF(int n, int d) 
	{
		if (d == 0) {
			return n; 
		}
		return gCF(d, n % d);
	}

	private void reduce()
	{
		int gcf = gCF(getNumer(), getDenom());
		setNumer(getNumer() / gcf);
		setDenom(getDenom() / gcf);
	}

	public Fraction add(Fraction other) 
	{

		//please help??
	}

	public Fraction subtract(Fraction other) 
	{
		return new Fraction((getNumer() * other.getDenom()) - (other.getNumer() * getDenom()), other.getDenom() * getDenom());  
	}

	public Fraction multiply(Fraction other) 
	{
		return new Fraction(other.getNumer() * getNumer(), other.getDenom() * getDenom());
	}

	public Fraction divide(Fraction other) 
	{
		return new Fraction(other.getDenom() * other.getNumer());
	}

	public Fraction reciprocal() 
	{
		//????? what is a reciprocal??????
	}
}// EOF
