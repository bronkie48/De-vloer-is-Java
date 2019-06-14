package H14_Quiz4;

import static java.lang.Long.MIN_VALUE;

public class Werknemer implements Betaling{
    double uurTarief = MIN_VALUE;
    double gewerkteUren = MIN_VALUE;
    double brutoLoon = MIN_VALUE;

    public Werknemer(double brutoLoon){
        this.brutoLoon = brutoLoon;
    }

    @Override
    public double loonBerekenen(){
        return brutoLoon*.7;

    }
}
