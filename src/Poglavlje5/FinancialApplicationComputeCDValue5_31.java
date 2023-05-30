package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationComputeCDValue5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite pocetni iznos depozita: ");
        double iznos = input.nextDouble();
        System.out.println("Unesite godisnji procentalni prinos: ");
        double godisnjiProcenat = input.nextDouble();
        System.out.println("Unesite broj mjeseci : ");
        int mjesec = input.nextInt();

        double mjesecniProcenat = godisnjiProcenat / 1200;

        System.out.println("Mjesec\t\t\tCD vrijednost");
        for (int i = 1; i <= mjesec; i++) {
            iznos += iznos * mjesecniProcenat;

            System.out.println(i+"."+"\t\t\t\t"+iznos);
        }
    }
}
