package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCalculateTips2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite racun i procenat napojnice: ");
        double racun = input.nextDouble();
        double procenatNapojnice = input.nextDouble();

        double procenat = procenatNapojnice / 100;
        double napojnica = racun * procenat;
        double totalRacun = racun + napojnica;

        System.out.println("Iznos napojnice je $"+napojnica+" a cijelog racuna je $"+totalRacun);
    }
}
