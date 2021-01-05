package esercizio23;

import java.util.Scanner;

public class Esercizio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String stringa = " ";
        String accumulatore = "";
        while(!stringa.isEmpty()) {
            System.out.println("Inserisci una stringa di testo: ");
            stringa = input.nextLine();
            accumulatore = accumulatore + " " + stringa;  
        }
        System.out.println(accumulatore);
    }
}