package giorno_sw;

import java.util.Scanner;

public class Giorno_sw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // legge un numero tra 1 e 7...
        System.out.println("Inserisci un numero compreso tra 1 e 7: ");
        int giorno = input.nextInt();
        
        // e verifica a che giorno della settimana corrisponde
        switch(giorno) {
            case 1: System.out.println("Lunedì");
                break;
            case 2: System.out.println("Martedì");
                break;
            case 3: System.out.println("Mercoledì");
                break;
            case 4: System.out.println("Giovedì");
                break;
            case 5: System.out.println("Venedì");
                break;
            case 6: System.out.println("Sabato");
                break;
            case 7: System.out.println("Domenica");
                break;
            default: System.out.println("Inserito numero errato");
        }    
    }
}
