package esercizio13;

import java.util.Scanner;

public class Esercizio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco un numero intero diverso da zero verifico che sia tale
        System.out.println("Inserisci un numero intero non nullo: ");
        int x = input.nextInt();
        if(x==0)
            System.out.println("Il valore inserito non è corretto!");
        else {
            System.out.println("Di seguito la tabellina da 1 fino a 10 del numero inserito " + x);
            for(int i=1; i<=10; i++)
                System.out.println(i*x);
        }
    }
}