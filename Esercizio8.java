package esercizio8;

import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // dichiaro e creo un array di 10 elementi
        int array[] = new int[10];
        
        // inserisco 10 numeri interi che verranno inseriti nell'array
        System.out.println("Inserisci 10 numeri interi: ");
        for(int i=0; i<array.length; i++)
            array[i] = input.nextInt();
        
        // determino se sussiste la condizione testata dall'operatore if per ogni
        // valore dell'indice i, ad esclusione di i=0 e di i=9; se la condizione
        // risulta verificata, stampo l'indice i corrispondente, altrimenti -1
        for(int i=1; i<array.length-1; i++)  {
            if(array[i]==array[i+1]-array[i-1]) {
                System.out.println("L'indice che verifica la condizione è: " + i);
                return;
            }
        }
        System.out.print("-1");
    }
}
