package H13_Extraopdracht_Brian;

public class Rechthoek extends Vorm {
	private double breedte;
	private double lengte;
	
	// constructor van rechthoek opp en omtrek
	public Rechthoek(double breedte, double lengte){
		this.breedte = breedte;
		this.lengte = lengte;
	}
	
	//berekeningen oppervlakte en omtrek
	public double oppervlakte()
	{
		return breedte * lengte;
	}
	public double omtrek()
	{
		return 2 * (breedte + lengte);
	}
}
