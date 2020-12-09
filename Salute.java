package salute;

import java.util.Scanner;

public class Salute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // lettura di temperatura e battito
        System.out.println("Inserisci la temperatura corporea: ");
        double febbre = input.nextDouble();
        System.out.println("Inserisci i battiti cardiaci al minuto: ");
        int battito = input.nextInt();
        
        // verifica di condizioni
        boolean febbreNo,febbreBassa,febbreAlta,battitoOK,battitoAccelerato;
        febbreNo = febbre<37.0;
        febbreBassa = (febbre>=37.0)&&(febbre<38.0);
        febbreAlta = febbre>=38.0;
        battitoOK = battito<80;
        battitoAccelerato = battito>=80;
        
        if(febbreNo&&battitoOK)
            System.out.println("Tutto OK");
        else if((febbreNo&&battitoAccelerato))
            System.out.println("Battito accelerato - temperatura nella norma");
        else if((febbreBassa&&battitoAccelerato)||(febbreAlta))
            System.out.println("Stato febbrile");
        else
            System.out.println("Stato febbrile lieve");
    }
}
