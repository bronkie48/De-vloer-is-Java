package H11_Quiz4;

public class Subklasse extends SuperA{
    protected int x = 0;

    public Subklasse(){
        x += 2;
        y += 3;
        System.out.print(" x" + x);
        System.out.print(" y" + y);

    }
    public static void main(String[] args){
        Subklasse subK = new Subklasse();
    }

    //antwoord c is het antwoord
    //als lijn 4 is toegevoegd aan deze klasse zal de 2e print van x veranderen tot 2 want hij overschrijft de berekeningen (var x) van de subklasses.
}



