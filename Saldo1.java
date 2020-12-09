package saldo1;

import java.util.Scanner;

public class Saldo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo,tassoAttivo,tassoPassivo;
        tassoAttivo=1.50/100;
        tassoPassivo=7.00/100;
        
        // chiedo il saldo del conto corrente
        System.out.print("Inserisci il saldo del tuo conto corrente: ");
        saldo = input.nextDouble();
        
        if(saldo>=0) {
            System.out.println("Saldo positivo");
            double interesseAttivo = saldo * tassoAttivo;
            saldo = saldo + interesseAttivo;
        } else {
            System.out.println("Saldo negativo");
            double interessePassivo = saldo * tassoPassivo;
            saldo = saldo + interessePassivo;
        }
        System.out.print("Nuovo saldo: ");
        System.out.println(saldo);
    }
    
}
