package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        // chiedo l'inserimento di un numero intero
        System.out.println("Inserisci un numero intero: ");
        num = input.nextInt();
        
        // verifico se il resto della divisione del numero inserito per 2 sia o meno pari a 0
        if(num%2==0) {
            System.out.print("Il numero inserito è pari :" + num);
        } 
        else  {
            System.out.print("Il numero inserito è dispari :" + num);
        }
    }
}