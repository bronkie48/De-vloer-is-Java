package H14_Extraopdracht;

public class Motorola implements TelefoonInterface
{
	double prijs = 250;
	double korting = 0.20;
	boolean isStudent;
	
	public double prijsMetKorting()
	{
		if(isStudent)
		{
			korting = 0.25;
		}
		return prijs - (prijs*korting);
	}
}
