package orario_24h;

import java.util.Scanner;

public class Orario_24h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ore,minuti;
        System.out.println("Inserire ore e minuti: ");
        ore = input.nextInt();
        minuti = input.nextInt();
        // controlla che ore sia compreso tra 0 e 23 e che minuti sia compreso tra 0 e 59
        if(ore<0)
            System.out.println("Non è un orario.");
        else if (ore>24)
            System.out.println("Non è un orario.");
        else if (minuti<0)
            System.out.println("Non è un orario.");
        else if (minuti>60)
            System.out.println("Non è un orario.");
        else
            System.out.println("E' un orario corretto:" + ore + ":" + minuti);
    }
}
