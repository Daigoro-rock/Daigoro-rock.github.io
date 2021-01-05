package esercizio3;

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        // chiedo l'inserimento di 3 numeri
        System.out.println("Inserisci 3 numeri: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        // determino e stampo il maggiore tra i 3 numeri inseriti
        if(a>b) {
            if(a>c) {
                System.out.print("Il maggiore tra i 3 numeri inseriti è: " + a);
            }
            else {
                System.out.print("Il maggiore tra i 3 numeri inseriti è: " + c);
            } 
        } else {
            if(b>c) {
                System.out.print("Il maggiore tra i 3 numeri inseriti è: " + b);
            }
            else {
                System.out.print("Il maggiore tra i 3 numeri inseriti è: " + c);
            }       
          }
    }
}
