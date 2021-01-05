package esercizio17;

import java.util.Scanner;

public class Esercizio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco 2 numeri interi positivi non nulli e verifico ciò
        System.out.println("Inserisci 2 numeri interi positivi (non nulli): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int k = a;
        int h = b;
        if(a<=0 || b<=0) {
            System.out.println("I valori inseriti non sono corretti!");
        // verifico se i 2 numeri positivi inseriti sono uguali o meno
        } else if(a==b) {
                System.out.println("il MCD ed il MCM di 2 numeri uguali è il numero stesso " + a);
        // elaborazione del MCD e MCM dei 2 numeri positivi e diversi tra loro
        } while(a!=b) {
            if(a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
          }
        System.out.println("il MCD dei numeri " + k + " e " + h + " è " + a);
        System.out.println("il MCM dei numeri " + k + " e " + h + " è " + ((k*h)/a));
    }
}