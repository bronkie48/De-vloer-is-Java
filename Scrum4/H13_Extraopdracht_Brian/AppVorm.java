package H13_Extraopdracht_Brian;

public class AppVorm 
{
	public static void main (String[] args)
	{
		Rechthoek rec = new Rechthoek(22,34);
		Cirkel cir = new Cirkel(100);
		Driehoek dri = new Driehoek(4,5,2.5);
		
		System.out.println("Oppervlakte en omtrekken vormen:");
		
		System.out.println("Oppervlakte Rechthoek: " + rec.oppervlakte());
		System.out.println("Omtrek Rechthoek: " + rec.omtrek());
		System.out.println("Oppervlakte Cirkel: " + cir.oppervlakte());
		System.out.println("Omtrek Cirkel: " + cir.omtrek());
		System.out.println("Oppervlakte Driehoek: " + dri.oppervlakte());
		System.out.println("Omtrek Driehoek: " + dri.omtrek());
	}
}
