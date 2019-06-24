package H14_Extraopdracht;

public class KortingApp {
	public static void main(String[] args)
	{
		Motorola mot = new Motorola();
		Motorola mot2 = new Motorola();
		mot2.isStudent = true;
		mot.isStudent = false;
		
		Iphone iph = new Iphone();
		Iphone iph2 = new Iphone();
		iph2.isAbonnee = true;
		iph.isAbonnee = false;
		
		Samsung sam = new Samsung();
		Samsung sam2 = new Samsung();
		sam2.isVip = true;
		sam.isVip = false;
		
		System.out.println("Motorola:");
		System.out.println("Prijs met gewone korting: "+ mot.prijsMetKorting());
		System.out.println("Prijs met Studentenkorting: "+ mot2.prijsMetKorting());
		System.out.println("-----------------------------------");
		
		System.out.println("Iphone:");
		System.out.println("Prijs met gewone korting: " + iph.prijsMetKorting());
		System.out.println("Prijs met abonnee korting: " + iph2.prijsMetKorting());
		System.out.println("-----------------------------------");
		
		System.out.println("Samsung:");
		System.out.println("Prijs met gewone korting: " + sam.prijsMetKorting());
		System.out.println("Prijs met Vip korting: " + sam2.prijsMetKorting());
		System.out.println("-----------------------------------");
	}
}
