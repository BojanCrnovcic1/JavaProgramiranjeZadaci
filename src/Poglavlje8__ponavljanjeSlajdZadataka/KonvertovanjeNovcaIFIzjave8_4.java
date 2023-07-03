package Poglavlje8__ponavljanjeSlajdZadataka;

import java.util.Scanner;

public class KonvertovanjeNovcaIFIzjave8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u futnama: ");
        double funte = input.nextDouble();

        double marka = funte * 2.2;

        if (funte < 0) {
            System.out.println("Greska. Unijeli ste negativni broj.");
        }
        else
            System.out.println(funte+" funti iznosi "+marka+" BAM. ");
    }
}
