package esercizio22;

import java.util.Scanner;

public class Esercizio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String stringa = " ";
        while(!stringa.isEmpty()) {
            System.out.println("Inserisci una stringa di testo: ");
            stringa = input.nextLine();
            System.out.println(stringa);
        }
    }
}
