package esercizio18;

import java.util.Scanner;

public class Esercizio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inserisco una stringa di testo
        System.out.println("Inserisci una stringa di testo: ");
        String s = input.nextLine();
        
        // determino la lunghezza della stringa inserita con e senza gli eventuali
        // spazi tra le parole, avendo però prima verificato che tale stringa non sia vuota
        if(s.isEmpty())  {
            System.out.println("La stringa è vuota.");
        } else {
            System.out.println("La stringa di testo inserita è composta da " + s.length() + " caratteri, compresi gli spazi.");
            int cont = 0; // contatore degli spazi
            int i = 0; // indice usato per scandire il testo
            while (i!=-1) {
                // cerca il prossimo spazio a partire dalla posizione i+1
                i = s.indexOf(" ",i+1);
                if(i!=-1) cont++;
            }
            System.out.println("Il numero dei caratteri che compongono la stringa inserita, senza conteggiare gli spazi, è " + (s.length()-cont) + ".");
            System.out.println("Il numero di spazi inseriti all'interno della stringa è pari a " + cont + ".");
        }
    }
}
