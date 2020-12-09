package saldo5;

import java.util.Scanner;

public class Saldo5 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo,penale,tassoAttivo;
        tassoAttivo=1.50/100;

        // chiedo il saldo del conto corrente
        System.out.print("Inserisci il saldo del tuo conto corrente: ");
        saldo = input.nextDouble();
        
        if(saldo>=0) {
            if(saldo>0) {
                double interesseAttivo = saldo * tassoAttivo;
                saldo = saldo + interesseAttivo;
                } 
        } else {    
            penale = -150;
            saldo = saldo + penale;
              }
        System.out.print("Nuovo saldo: ");
        System.out.println(saldo);
    }
}
