package esercizio12;

import java.util.Scanner;

public class Esercizio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco 2 numeri interi positivi e verifico che siano tali
        // il numero intero h indica le righe della matrice, mentre
        // il numero intero z indica le colonne della matrice
        System.out.println("Inserisci 2 numeri interi positivi: ");
        int h = input.nextInt();
        int z = input.nextInt();
        if(h<1 || z<1) {
            System.out.println("Inseriti valori errati!");
        } else {
        // attraverso una serie di cicli nidificati stampo un rettangolo il cui
        // perimetro è  delimitato da asterischi
            for(int i=1; i<=h; i++) {
                // stampo la prima e l'ultima riga del rettangolo entrambe
                // composte solo da asterischi
                if(i==1 || i==h) {
                    for(int v=1; v<=z; v++) {
                        System.out.print("*");
                    }
                    System.out.println();
                // stampo le righe intermedie del rettangolo tali che siano composte
                // da un asterisco in corrispondenza della prima e dell'ultima colonna
                // e da spazi vuoti nelle colonne intermedie    
                } else {
                    for(int v=1; v<=z; v++) {
                        if(v==1 || v==z) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                          }
                    }
                    System.out.println();
                  }
            }
          }
    }
}