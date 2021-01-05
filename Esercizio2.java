package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        
        // chiedo l'inserimento di 3 numeri
        System.out.println("Inserisci 3 numeri: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        // calcolo la media dei 3 numeri inseriti
        double media = (a+b+c)/3;
                
        // stampo la media a video
        System.out.print("La media dei 3 numeri inseriti è pari a: " + media);
    }
}
