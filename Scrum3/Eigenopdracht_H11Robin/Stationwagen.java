package Eigenopdracht_H11Robin;

public class Stationwagen extends Auto{
    private int lengte;

    public Stationwagen(int gewicht , int topsnelheid , int paardenkracht, String naam){
        super(gewicht , topsnelheid , paardenkracht, naam);
        this.lengte = lengte;
    }

    @Override
    public String toString( ){
        return super.toString() + ",lengte: " + lengte;
    }
}
