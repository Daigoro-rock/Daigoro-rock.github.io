package esercizio11;

import java.util.Scanner;

public class Esercizio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Inserisco un numero intero maggiore di 2 e verifico che sia tale
        System.out.println("Inserisci un numero intero maggiore di 2: ");
        int n = input.nextInt();
        if(n<=2) {
            System.out.println("Non ci sono asterischi da stampare.");
        } else {
            // stampa di n asterischi sulla prima linea, n-2 asterischi sulla
            // seconda linea, n-4 sulla terza linea e così via, fino ad arrivare
            // a stampare uno o due asterischi sull'ultima linea
            for(int j=n; j<=n&&j>0; j=j-2) {
                System.out.println();
                for(int i=0; i<j; i++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}