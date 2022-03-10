package IDTokenGen;

import java.util.Random;

public class main {
    public static void main(String[] args){
        Random id = new Random();

        int zahl;

        for(int i=0; i<12; i++){ //Die Max Zahl bei i=12 die 12 beliebig ändern
           
            zahl = 1+ id.nextInt(6);
            System.out.println("Token:");
            System.out.print(zahl);
        }

    }

}
