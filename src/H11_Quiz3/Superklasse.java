package H11_Quiz3;

public class Superklasse {
	protected char c = 'G';


void mijnMethode()
{
	System.out.print(c);
	}
}

class Subklasse extends Superklasse
{
	char c2 = 'A';
	
	Subklasse()
	{
		this('N');
		System.out.print(c2);
	}
	Subklasse(char c)
	{
		System.out.print(c);
	}
	void mijnMethode()
	{
		super.mijnMethode();
		System.out.print(c2);
	}
	public static void main(String [] args)
	{
		Subklasse subK = new Subklasse();
		subK.mijnMethode();
	}
}

