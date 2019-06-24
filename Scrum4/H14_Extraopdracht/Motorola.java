package H14_Extraopdracht;

public class Motorola implements TelefoonInterface
{
	double prijs = 250;
	double korting = 0.20;
	boolean isStudent;
	
	public double prijsMetKorting()
	{
		// met een boolean wordt gekeken of ie student is of niet.
		if(isStudent)
		{
			korting = 0.25;
		}
		return prijs - (prijs*korting);
	}
}
