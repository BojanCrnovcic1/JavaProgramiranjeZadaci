package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationLoanAmortizationSchedule5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iznos pozajmice: ");
        double iznosPozajmice = input.nextDouble();
        System.out.println("Broj godina: ");
        int godina = input.nextInt();
        System.out.println("Godsinja kamatna stopa: ");
        double godisnjaKamatnaStopa = input.nextDouble();

        double mjesecnaStopa = godisnjaKamatnaStopa / 1200;
        double mjesecnoPlacanje = iznosPozajmice * mjesecnaStopa / (1 -1 / Math.pow(1 + mjesecnaStopa, godina * 12));

        System.out.println("Mjesecno placanje: "+mjesecnoPlacanje);
        System.out.println("Totalno placanje: "+(mjesecnoPlacanje * 12)*godina);

        System.out.println("Placanje#\t\tKamata\t\tStanje\t\tBalans");
        double balans = iznosPozajmice, stanje, kamata;

        for (int i = 1; i <= godina * 12; i++){
            kamata = mjesecnaStopa * balans;
            stanje = mjesecnoPlacanje - kamata;
            balans = balans - stanje;

            System.out.println(i+"\t\t"+kamata+"\t\t"+stanje+"\t\t"+balans);

        }








    }
}
