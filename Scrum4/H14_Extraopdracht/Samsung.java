package H14_Extraopdracht;

public class Samsung implements TelefoonInterface
{
	double prijs = 420;
	double korting = 0.30;
	boolean isVip;
	
	public double prijsMetKorting()
	{
		if(isVip) {
			korting = 0.50;
		}
		return prijs - (prijs * korting);
	}
}
