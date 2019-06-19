package H11_Quiz6;

public class Subklasse extends Superklasse{
	protected char e = 'p';
	// omdat nu char e p is wordt er pd810 greprint in de console
	void mijnMethode() {
		x++;
		System.out.print(e);
		super.mijnMethode();
		x += 2;
		System.out.print(x);
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse();
		sk.mijnMethode();
	}
}