package Eigenopdracht_H11;

public class Eigenopdracht extends EigenklasseApp{

	public static void main (String [] args) {
		Eigenopdracht eo = new Eigenopdracht();
		eo.mijnMethodeBrian(1, 1);
		Eigenopdracht thomas = new Eigenopdracht();
		thomas.thomasMethode();
	}

	int mijnMethodeBrian(int y, int x) {
		return brianMethode(y) + x + y;
	}

	void thomasMethode(char c) {
		return;
	} 
}

