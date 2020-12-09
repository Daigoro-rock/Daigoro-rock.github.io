package saldo;

import java.util.Scanner;
        
public class Saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo;
        
        // chiedo il saldo del conto corrente
        System.out.print("Inserisci il saldo del tuo conto corrente: ");
        saldo = input.nextDouble();
        
        if(saldo>=0) //se il saldo è positivo
            System.out.println("Il saldo è positivo!");
        else // altrimenti
            System.out.println("Il saldo è negativo");
        
        System.out.println("Grazie per aver usato il nostro servizio!");
    }
    
}
