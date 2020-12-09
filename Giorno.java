package giorno;

import java.util.Scanner;

public class Giorno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // legge un numero tra 1 e 7...
        System.out.println("Inserisci un numero compreso tra 1 e 7: ");
        int giorno = input.nextInt();
        
        // e verifica a che giorno della settimana corrisponde
        if(giorno==1) System.out.println("Lunedì");
        else if(giorno==2) System.out.println("Martedì");
        else if(giorno==3) System.out.println("Mercoledì");
        else if(giorno==4) System.out.println("Giovedì");
        else if(giorno==5) System.out.println("Venerdì");
        else if(giorno==6) System.out.println("Sabato");
        else if(giorno==7) System.out.println("Domenica");
        else System.out.println("Numero errato");
    }
}
