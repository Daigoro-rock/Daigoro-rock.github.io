package esercizio21bis;

import java.util.Scanner;

public class Esercizio21bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sulla stessa riga inserisci 2 parole separate: ");
        String parola1 = input.next();
        String stringa = input.nextLine();
        int i=stringa.indexOf(" ")+1;
        while(stringa.charAt(i)==' ') i++;
        if(parola1.equals(stringa.substring(i))) System.out.println("Sono uguali!");
            else System.out.println("Non sono uguali!");
    }
}