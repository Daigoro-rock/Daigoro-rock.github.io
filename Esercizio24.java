package esercizio24;

import java.util.Scanner;

public class Esercizio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una stringa di testo: ");
        String stringa = input.nextLine();
        int i = stringa.length();
        if(stringa.charAt(i-1)=='?') System.out.println("Non saprei...");
        else if(stringa.charAt(i-1)=='!') System.out.println("Hai proprio ragione!");
        else System.out.println("non mi convince...");
    }
}