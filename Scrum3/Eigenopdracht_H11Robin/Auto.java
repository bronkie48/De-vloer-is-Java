package Eigenopdracht_H11Robin;

public class Auto{
    public int gewicht;
    public int topsnelheid;
    public int paardenkracht;
    public String naam;

    public Auto(int gewicht, int topsnelheid, int paardenkracht, String naam){
        this.gewicht = gewicht;
        this.topsnelheid = topsnelheid;
        this.paardenkracht = paardenkracht;
        this.naam = naam;
    }

    @Override
    public String toString( ){
        return "gewicht: " + gewicht + ",topsnelheid: " + topsnelheid + ",paardenkracht: " + paardenkracht + ",naam: " + naam;
    }
}
