package Extra_Opdracht_Hoofdstuk11_Brian;

public class Voertuigen {
	protected String merk;
	protected String type;
	protected int bouwjaar;
	protected String kleur;
	
	public void infoMethode() {
		System.out.println("Merk: " + merk);
		System.out.println("Type: " + type);
		System.out.println("Bouwjaar: " + bouwjaar);
		System.out.println("Kleur: " + kleur);	
	}
	public static void main (String[] args) {
		Auto a = new Auto();
		Motor m = new Motor();
		a.merk = "Toyota";
		a.type = "Celica";
		a.bouwjaar = 1999;
		a.kleur = "Rood";
		a.infoMethode();
		m.merk = "Honda";
		m.type = "CBR";
		m.bouwjaar = 2003;
		m.kleur = "Oranje";
		m.infoMethode();
	}
}
