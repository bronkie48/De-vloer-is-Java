package H11_Quiz8;

public class Subklasse{
    int MijnInt = 12;

    public static void main(String[] args){
        Superklasse supK = new Superklasse();
        Subklasse subK = new Subklasse();


        System.out.println(subK.MijnInt);
        //System.out.println(supK.MijnInt);

        //subP heeft geen toegang tot MijnInt in de klasse.
    }
}
