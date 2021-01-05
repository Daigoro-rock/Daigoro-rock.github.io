package esercizio7;

import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco un numero intero positivo e verifico che sia tale
        System.out.println("Inserisci un numero intero positivo: ");
        int x = input.nextInt();
        if(x<=0) {
            System.out.print("Il numero inserito non è corretto!");
        } else  {
            // dichiaro e creo un array di x elementi
            int arrayvettoriale[] = new int[x];
            // inserisco x elementi nell'array
            for(int i=0; i<arrayvettoriale.length; i++)  {         
                arrayvettoriale[i] = x;
                x = x - 1;
                 }
            // calcolo di x fattoriale (x!)
            int prodotto = 1;
            for(int i=0; i<arrayvettoriale.length; i++)
                prodotto = prodotto * arrayvettoriale[i];
            System.out.print("Il vettoriale del numero inserito " + arrayvettoriale.length + " è pari a " + prodotto);
        }
    }
}
