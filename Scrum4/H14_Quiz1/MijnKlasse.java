package H14_Quiz1;

public class MijnKlasse implements MijnInterface 
{
	public void methode() {
	
	//x ++; /* 1*/
	System.out.print(x);
	}
	public void methode (int i)
	{
		int z = i;
		//z = z + x; /* 2*/
		methode();
		System.out.print(z);
	}
	
	public static void main(String[] args)
	{	
		int x = 7;
		x++;
		// er veranderd niks aan de uitput(54) wanneer bovenstaande statements worden toegevoegd
		new MijnKlasse().methode(4);
	}
}
