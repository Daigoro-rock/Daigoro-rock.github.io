package esercizio6;

import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // dichiaro e creo 3 array composti da 5 numeri interi ciascuno
        int primovettore[] = new int[5];
        int secondovettore[] = new int[5];
        int vettoresomma[] = new int[5];
        
        // inserisco 5 numeri interi nel primo array
        System.out.println("Inserisci 5 numeri interi nel primo array: ");
        for(int i=0; i<primovettore.length; i++)
            primovettore[i] = input.nextInt();
        
        // inserisco 5 numeri interi nel secondo array
        System.out.println("Inserisci 5 numeri interi nel secondo array: ");
        for(int i=0; i<secondovettore.length; i++)
            secondovettore[i] = input.nextInt();
        
        // inserisco 5 numeri interi nel terzo array; ciascuno dei 5 numeri inseriti
        // è pari alla somma dei corrispondenti elementi inseriti da tastiera nei
        // primi 2 array
        for(int i=0; i<vettoresomma.length; i++)
            vettoresomma[i] = primovettore[i] + secondovettore[i];
        
        // stampo a video gli elementi che compongono i 3 vettori da 5 elementi ciascuno
        System.out.println("Di seguito i 5 numeri interi che compongono il primo array inserito: ");
        for(int i=0; i<primovettore.length; i++)
            System.out.println(primovettore[i]);
        System.out.println("Di seguito i 5 numeri interi che compongono il secondo array inserito: ");
        for(int i=0; i<secondovettore.length; i++)
            System.out.println(secondovettore[i]);
        System.out.println("Di seguito i 5 numeri interi che compongono il terzo array, somma dei primi 2: ");
        for(int i=0; i<vettoresomma.length; i++)
            System.out.println(vettoresomma[i]);
    }
}
