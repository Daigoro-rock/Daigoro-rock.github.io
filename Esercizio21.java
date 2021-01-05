package esercizio21;

import java.util.Scanner;

public class Esercizio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una parola: ");
        String parola1 = input.next();
        System.out.println("Inserisci un'altra parola: ");
        String parola2 = input.next();
        if(parola1.equals(parola2)) System.out.println("Sono uguali!");
            else System.out.println("Non sono uguali!");
    }
}