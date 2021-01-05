package esercizio20;

import java.util.Random;

public class Esercizio20 {
    public static void main(String[] args) {
        int n = 1000;
        int contazero = 0;
        int contauno = 0;
        int array[] = new int[n];
        Random rng = new Random();
        for(int i=0; i<n; i++) {
            array[i]=rng.nextInt(2);
            if(array[i]==0) contazero++;
                else contauno++;
        }
        System.out.println("Su " + n + " hestrazioni casuali è risultato 0 " + contazero + " volte e 1 " + contauno + " volte.");
    }
}
