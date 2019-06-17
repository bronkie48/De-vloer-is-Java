package H14_Quiz4;

public class Test{

    public static void main(String[] args){
        Werknemer werknemer = new Werknemer(3000);
        Freelancer freelancer = new Freelancer(140,60);

        System.out.println(werknemer.loonBerekenen());
        System.out.println(freelancer.loonBerekenen());
    }
}
