package esercizio19;

import java.util.Random;

public class Esercizio19 {
    public static void main(String[] args) {
        Random rng = new Random();
        int ris = rng.nextInt(2);
        if(ris==0) System.out.println("Testa");
            else System.out.println("Croce");           
    }
}