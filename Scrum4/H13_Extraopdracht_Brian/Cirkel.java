package H13_Extraopdracht_Brian;

public class Cirkel extends Vorm
{
	private double straal;
	final double PI = 3.14;
	
	public Cirkel(double straal)
	{
		this.straal = straal;
	}
	// berekeningen cirkel omtrek en oppervlakte
	public double oppervlakte() 
	{
		return PI * straal * straal;
	}
	public double omtrek()
	{
		return 2 * PI * straal;
	}
}
