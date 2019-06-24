package H11_Quiz2;
public class Subklasse extends Superklasse{
	Subklasse(int y){
		x += y;
	}
	public static void main(String[] args) {
		Subklasse sk = new Subklasse(4);
		// het nieuwe object krijg voor de int y de waarde 4. dit wordt +3 gedaan omdat in de superklasse 2+=1 wordt gedaan
		System.out.println(sk.x);
		
		Subklasse sk2 = new Subklasse(6);
		System.out.println(sk2.x);
		// de waarde van x bij sk2 wordt nu 9 omdat er nu 6 + 3 wordt gedaan
	}
}