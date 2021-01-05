package esercizio14;

import java.util.Scanner;

public class Esercizio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // dichiaro e creo un array di 10 elementi
        int array[] = new int[10];
        
        // inserisco 10 numeri interi nell'array
        System.out.println("Inserisci 10 numeri interi: ");
        for(int k=0; k<array.length; k++)
            array[k] = input.nextInt();
        
        // verifico il segno dell'ultimo numero inserito nell'array: se tale numero
        // è zero, e quindi senza segno, non viene calcolata la media
        if(array[array.length-1]==0)  {
            System.out.println("L'ultimo valore della sequenza è " + array[array.length-1]);
        } else if(array[array.length-1]>0) {
            int somma = 0;
            int cont = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i]>0) {
                    somma = somma + array[i];
                    cont = cont + 1;
                }
            }
            double media = somma/cont;
            System.out.println("La media dei soli valori positivi e non nulli della sequenza è: " + media);
        } else {
            int somma = 0;
            int cont = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i]<0) {
                    somma = somma + array[i];
                    cont = cont + 1;
                }
            }
            double media = somma/cont;
            System.out.println("La media dei soli valori negativi della sequenza è: " + media);
        }
    }
}
