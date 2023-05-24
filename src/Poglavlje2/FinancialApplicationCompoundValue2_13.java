package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCompoundValue2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite mjesecni iznos ustede: ");
        double usteda = input.nextDouble();

        double mjesecnaKamata = 0.05/12;

        double ustedaPrvogMjeseca = usteda * (1 + mjesecnaKamata);
        double ustedaDrugogMjeseca = (usteda + ustedaPrvogMjeseca) * (1 + mjesecnaKamata);
        double ustedaTrecegMjeseca = (usteda + ustedaDrugogMjeseca) * (1 + mjesecnaKamata);
        double ustedaCetvrtogMjeseca = (usteda + ustedaTrecegMjeseca) * (1 + mjesecnaKamata);
        double ustedaPetogMjeseca = (usteda + ustedaCetvrtogMjeseca) * (1+ mjesecnaKamata);
        double ustedaSestogMjeseca = (usteda + ustedaPetogMjeseca) * (1 + mjesecnaKamata);

        System.out.println("Nakon sest mjeseci vrijednost na racunu je $"+ustedaSestogMjeseca);

    }
}
