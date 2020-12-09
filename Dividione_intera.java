package dividione_intera;

import java.util.Scanner;

public class Dividione_intera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividendo,divisore;
        System.out.println("Inserisci il dividendo: ");
        dividendo = input.nextInt();
        System.out.println("Inserisci il divisore: ");
        divisore = input.nextInt();
        // controlla che il divisore sia diverso da 0, prima di calcolare la divisione
        if(divisore==0) {
            System.out.println("ERRORE: DIVISIONE PER ZERO!");
        } else {
            System.out.print("Quoziente: ");
            System.out.println(dividendo/divisore);
            System.out.print("Resto: ");
            System.out.println(dividendo%divisore);
            }
    }
}
