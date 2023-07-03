package Poglavlje8__ponavljanjeSlajdZadataka;

import java.util.Scanner;

public class KonvertovanjeNovca8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u futnama: ");
        double funta = input.nextDouble();

        double marka = funta * 2.2;

        System.out.println(funta+" funti iznosi "+marka+" BAM.");
    }
}
