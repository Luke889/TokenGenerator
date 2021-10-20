package IDTokenGen;

import java.util.Random;

public class main {
    public static void main(String[] args){
        Random id = new Random();

        int zahl;

        for(int i=0; i<12; i++){
            zahl = 1+ id.nextInt(6);
            System.out.print(zahl);
        }

    }

}
