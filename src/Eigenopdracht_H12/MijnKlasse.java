package Eigenopdracht_H12;

public final class MijnKlasse extends Superklasse {
	void methodeBrian (int x, int y)
	{
		int z = x + y;
		// hier word de y van de x afgehaald (6-4) en dat is 2 en dat wordt hieronder uitgeprint. 
		System.out.println("De som " + x + " + "+ y + " = " + z);
	}
	public static void main (String[]args) 
	{
		MijnKlasse mk = new MijnKlasse();
		mk.methodeBrian(6, 4);
		mk.methodeBrian(8, 2);
	}
}