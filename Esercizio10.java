package esercizio10;

import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 1;
        int prec = 1;
        
        // Inserisco un numero intero non negativo e verifico che sia tale
        System.out.println("Inserisci un numero intero non negativo: ");
        int n = input.nextInt();
        if(n<=0) {
            System.out.println("Non ci sono elementi della successione di Fibonacci da stampare in corrispondenza del valore inserito: " + n);
        
        // determino e stampo a video gli elementi della successione di Fibonacci
        // tali che essi risultino non maggiori del valore inserito n
        } else {
            System.out.println("Elementi della successione di Fibonacci: ");
            System.out.println(c);
            System.out.println(prec);
                for(int somma = c+prec; somma<=n; somma = c+prec)  {
                    System.out.println(somma);
                    prec = c;
                    c = somma;
                }
          }
    }
}