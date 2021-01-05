package esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        
        // chiedo l'inserimento della temperatura in gradi Celsius
        System.out.print("Inserisci la temperatura in gradi Celsius: ");
        celsius = input.nextDouble();
        
        // calcolo i gradi Fahrenheit applicando la seguente formula di conversione
        double fahrenheit = celsius*1.8+32;
        
        // stampo a video il risultato della conversione da Celsius a Fahrenheit
        System.out.println("La temperatura espressa in gradi Celsius pari a ");
        System.out.println(celsius + " equivale a " + fahrenheit + " gradi Fahrenheit.");           
    }
}
