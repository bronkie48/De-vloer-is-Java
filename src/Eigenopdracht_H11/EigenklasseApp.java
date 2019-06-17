package Eigenopdracht_H11;

public class EigenklasseApp {

	protected int x = 0;

	@Override
	public String toString( ){
		return "EigenklasseApp{" + "x=" + x + ", y=" + y + '}';
	}

	protected int y = 1;

	int brianMethode(int i) {
		System.out.println("Getallen: ");
		for(int i2 = 0; i2 < 10; i2++) {
			x += 1;
			y += 2;
			System.out.println(x +"," + y);
		}
		return i;
	}
	void thomasMethode() {
		System.out.println("\nAscii getallen:");
		for (int c=32; c<128; c++) {
			System.out.println(c + ": " + (char)c);
		}
	}
}
