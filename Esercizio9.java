package esercizio9;

import java.util.Scanner;

public class Esercizio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            // dichiaro e creo un array di 10 elementi
            int array[] = new int[10];
        
        // inserisco 10 numeri interi nell'array
        System.out.println("Inserisci 10 numeri interi: ");
        for(int i=0; i<array.length; i++)
            array[i] = input.nextInt();
        
        // stampo a video i valori dell'array che soddisfano le condizione testate dagli if
        for(int i=0; i<array.length; i++) {
            if(array[i]>=0&&array[i]%2==0) 
                System.out.println("Il seguente elemento dell'array soddisfa il test: " + array[i]);
            else if(array[i]<0&&i==array.length-1)
                return;
            else if(array[i]<0&&array[i+1]>=0)
                System.out.println("Il seguente elemento dell'array soddisfa il test: " + array[i]);
        }
    }
}