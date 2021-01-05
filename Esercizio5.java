package esercizio5;

import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // dichiaro e creo un array composto da 10 numeri interi
        int numeri[] = new int[10];
        
        // inserisco i 10 numeri interi nell'array
        System.out.println("Inserisci 10 numeri interi: ");
        for(int i=0; i<numeri.length; i++)
            numeri[i] = input.nextInt();
        
        // stampo i 10 numeri interi nell'ordine inverso in cui sono stati
        // inseriti nell'array, dividendo prima per 2 i numeri pari della sequenza
        System.out.println();
        for(int i=9; i>-1; i--) {
            if(numeri[i]%2==0) {
                System.out.println(numeri[i]/2);
            } else {
                System.out.println(numeri[i]);
            }
            }
    }
}
