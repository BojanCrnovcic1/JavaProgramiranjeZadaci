package Poglavlje3;

import java.util.Scanner;

public class FinancialCompareCosts3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu i cijenu prvog paketa: ");
        double tezina1 = input.nextDouble();
        double cijena1 = input.nextDouble();
        System.out.println("Unesite tezinu i cijenu drugog paketa: ");
        double tezina2 = input.nextDouble();
        double cijena2 = input.nextDouble();

        double vrijednostPrviPaket = cijena1 / tezina1;
        double vrijednostDrugiPaket = cijena2 / tezina2;

        if (vrijednostPrviPaket > vrijednostDrugiPaket) {
            System.out.println("Drugi paket ima vecu vrijednost. ");
        }
        else if (vrijednostPrviPaket < vrijednostDrugiPaket) {
            System.out.println("Prvi paket ima vecu vrijednost. ");
        }
        else
            System.out.println("Oba paketa imaju istu vrijednost. ");


    }
}
