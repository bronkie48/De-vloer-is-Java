package H13_Extraopdracht_Brian;

public class Driehoek extends Vorm{
	private double basis;
	private double hoogte;
	private double breedte;
	
	// constructor: voor de oppervlakte berekening van de driehoek
	public Driehoek(double basis, double hoogte)
	{
		this.basis = basis;
		this.hoogte = hoogte;
	}
	// constructor: voor de omtrek van de driehoek
	public Driehoek(double basis, double hoogte, double breedte)
	{
		this.basis = basis;
		this.hoogte = hoogte;
		this.breedte = breedte;
	}
	//berekeningen oppervlakte en omtrek
	public double oppervlakte() 
	{
		return (basis * hoogte) / 2;
	}
	public double omtrek()
	{
		return basis + breedte + hoogte;
	}
}