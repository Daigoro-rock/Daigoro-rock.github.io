package saldo4;

import java.util.Scanner;

public class Saldo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo;

        // chiedo il saldo del conto corrente
        System.out.print("Inserisci il saldo del tuo conto corrente: ");
        saldo = input.nextDouble();
        
        if(saldo>=0)
                System.out.println("saldo positivo");
        System.out.println("grazie per aver usato il nostro servizio");
    }
}