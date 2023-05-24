package Poglavlje2;

import java.util.Scanner;

public class SumTheDigitsInAnInteger2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj izmaedju 0 - 1000 :");
        int broj = input.nextInt();

        int zadnjaCifra = broj % 10;
        int ostatak = broj / 10;
        int srednjaCifra = ostatak % 10;
        int prednjaCifra = ostatak / 10;

        int zbir = prednjaCifra + srednjaCifra + zadnjaCifra;
        System.out.println("Zbir svih cifara je : "+zbir);
    }
}
