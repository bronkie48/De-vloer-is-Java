package H14_Quiz4;

import static java.lang.Long.MIN_VALUE;

public class Freelancer implements Betaling{
    double uurTarief = MIN_VALUE;
    double gewerkteUren = MIN_VALUE;
    double brutoLoon = MIN_VALUE;

    public Freelancer(double uurTarief, double gewerkteUren){
        this.uurTarief = uurTarief;
        this.gewerkteUren = gewerkteUren;
    }


    @Override
    public double loonBerekenen(){
        return uurTarief*gewerkteUren;
    }
}
