package Poglavlje6;

import java.util.Scanner;

public class FinancialApplicationComputeTheFutureInvestmentValue6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int BROJGODINA = 30;

        System.out.println("Unesite ulozeni iznos: ");
        double iznos = input.nextDouble();
        System.out.println("Unesite godisnju kamatnu stopu: ");
        double godisnjaKamata = input.nextDouble();
        double mjesecnaKamata = godisnjaKamata / 1200;

        System.out.println("Godina\t\tBuduca Vrijednost");
        for (int godina = 1; godina <= BROJGODINA; godina++) {
            System.out.println(godina+"\t\t\t"+futureInvestmentValue(iznos,godisnjaKamata,godina));
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
