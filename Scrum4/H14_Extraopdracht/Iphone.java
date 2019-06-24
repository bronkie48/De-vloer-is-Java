package H14_Extraopdracht;

public class Iphone implements TelefoonInterface
{
	double prijs = 600;
	double korting = 0.30;
	boolean isAbonnee;
	
	public double prijsMetKorting()
	{
		if(isAbonnee) {
			korting = 0.40;
		}
		return prijs - (prijs * korting);
	}
}
