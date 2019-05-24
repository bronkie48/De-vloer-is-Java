package Eigenopdracht_H11;

public class Eigenopdracht extends EigenklasseApp{

	
	int mijnMethodeBrian(int y, int x)
	{
		return brianMethode(y) + x + y;
	}
	public static void main (String [] args) {
		Eigenopdracht eo = new Eigenopdracht();
		eo.mijnMethodeBrian(1, 1);
	}
}

