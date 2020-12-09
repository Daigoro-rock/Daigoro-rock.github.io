package saldo3;

import java.util.Scanner;

public class Saldo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo;

        // chiedo il saldo del conto corrente
        System.out.print("Inserisci il saldo del tuo conto corrente: ");
        saldo = input.nextDouble();
        
        if(saldo>=0) {
            if(saldo>0)
                System.out.println("saldo positivo");
            else
                System.out.println("saldo nullo");
            } else {
                System.out.println("saldo negativo");
        }
    }
}
