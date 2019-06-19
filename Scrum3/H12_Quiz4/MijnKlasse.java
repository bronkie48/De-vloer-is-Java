package H12_Quiz4;

public final class MijnKlasse extends Superklasse {
	void methodeA (int x, int y)
	{
		int z = x - y;
		// hier word de y van de x afgehaald (6-4) en dat is 2 en dat wordt hieronder uitgeprint. 
		System.out.print(z);
	}
	public static void main (String[]args) 
	{
		MijnKlasse mk = new MijnKlasse();
		mk.methodeA(6, 4);
	}
}
