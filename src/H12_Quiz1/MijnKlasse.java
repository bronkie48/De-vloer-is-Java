package H12_Quiz1;

import java.sql.SQLOutput;

public final class MijnKlasse{
    final int x = 3;

    int bereken(int y, int z){
        if (y >= z){
            return (y+x);
        }
        else {
            return z + x;
        }
    }

    public static void main(String[] args){
        MijnKlasse mk = new MijnKlasse();
        System.out.println(mk.bereken(4,6));
    }

    //1&2: klasses die final zijn kunnen niet extended worden. Ook kunnnen final variables niet worden overschreven in subklasses.
}
