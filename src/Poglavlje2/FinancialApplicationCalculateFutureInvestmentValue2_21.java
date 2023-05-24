package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCalculateFutureInvestmentValue2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite investriani iznos: ");
        double iznos = input.nextDouble();
        System.out.println("Unesite mjesecni rast: ");
        double mjesecniRastProcenti = input.nextDouble();
        double mjesecniRast = mjesecniRastProcenti /1200;
        System.out.println("Unesite broj godina: ");
        int godina = input.nextInt();

        double buducaInvesticionaVrijednost = iznos * Math.pow(1 + mjesecniRast, godina * 12);

        System.out.println("Akumulativna vrijednost je : "+buducaInvesticionaVrijednost);


    }
}
