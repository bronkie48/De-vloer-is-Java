package H13_Quiz4;

public class MijnKlasseA extends MijnKlasseB
{
	
	MijnKlasseA()
	{
		System.out.print("b");
	}
	MijnKlasseA(int i)
	{
		System.out.print("d" + i);
	}
	@Override
	int bereken(int x, int y) {
		return 0;
	}
}
