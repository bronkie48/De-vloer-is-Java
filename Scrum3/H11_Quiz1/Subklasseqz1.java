package H11_Quiz1;

public class Subklasseqz1 extends Superklasseqz1
// met extends cre?er je een subclass van de klasse waarin je extends toevoegd.
{
	private int y = 8;
	
	Subklasseqz1 ()
	{
		x += 2; //vermeerderd de waarde van x (in de Superklasseqz1)
		y ++;
		System.out.print(x + ", " + y);
	}
	public static void main(String[] args)
	{
		Subklasseqz1 sk = new Subklasseqz1();
	}
}