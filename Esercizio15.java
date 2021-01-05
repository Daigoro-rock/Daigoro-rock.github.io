package esercizio15;

import java.util.Scanner;

public class Esercizio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco 2 numeri interi positivi e non nulli, tali che il secondo (m)
        // non sia maggiore del primo (n) e verifico che ciò sia stato rispettato
        System.out.println("Inserisci 2 numeri interi positivi e non nulli tali che il primo sia maggiore del secondo: ");
        int n = input.nextInt();
        int m = input.nextInt();
        if(n==0 || m==0 || m>n) {
            System.out.println("I due valori inseriti non sono corretti!");
        // determino e stampo tutti i multipli del secondo valore inserito (m)
        // che rientrano nella prima grandezza inserita (n)
        } else {
            System.out.println("Di seguito i multipli del secondo numero inserito " + m + ":");
            for(int i=1; i<=n; i++) {
                if(i%m==0)
                    System.out.println(i);
            }
        }
    }
}