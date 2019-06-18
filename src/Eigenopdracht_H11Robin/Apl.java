package Eigenopdracht_H11Robin;

import java.util.ArrayList;

public class Apl{
    public static void main(String[] args){
        ArrayList<Auto> autos = new ArrayList<Auto>();
        Coupe coupe = new Coupe(1000,200,100,"test_coupe");
        Stationwagen stationwagen = new Stationwagen(1500,170,150,"test_wagon");
        autos.add(coupe);
        autos.add(stationwagen);
        for(int i=0; i <= autos.size(); i++){
            System.out.println(autos.get(i).toString());
        }
    }
}
