package esercizio16;

import java.util.Scanner;

public class Esercizio16 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco due valori tale che il primo (la potenza n) sia intero non
        // negativo ed il secondo (la base x) sia decimale positivo e verifico
        // che tali condizioni siano rispettate
        System.out.println("Inserisci un numero intero non negativo che verrà assunto come potenza: ");
        int n = input.nextInt();
        System.out.println("Inserisci un numero decimale positivo che verrà assunto come base: ");
        double x = input.nextDouble();
        if(n<0 || x<=0) {
            System.out.println("I valori inseriti non sono corretti!");
        } else {
          // calcolo la somma delle potenze del numero x in base i da 0 a n
            double s = 0;
            double somma = 0;
            for(int i=0; i<=n; i++) {
                somma = Math.pow(x, i);
                s = s + somma;
            }
            System.out.println("La somma delle potenze da 0 fino a " + n + " compresi della base " + x + " è pari a " + s);
        }
    }
}
