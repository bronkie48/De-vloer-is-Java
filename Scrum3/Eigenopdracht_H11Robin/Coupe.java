package Eigenopdracht_H11Robin;

public class Coupe extends Auto{
    private int prijs;

    public Coupe(int gewicht , int topsnelheid , int paardenkracht, String naam){
        super(gewicht , topsnelheid , paardenkracht, naam);
        this.prijs = prijs;
    }

    @Override
    public String toString( ){
        return super.toString() + "prijs: " + prijs;
    }
}
