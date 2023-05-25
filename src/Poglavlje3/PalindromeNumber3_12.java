package Poglavlje3;

import java.util.Scanner;

public class PalindromeNumber3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite trocifreni broj: ");
        int broj = input.nextInt();

        int prednjaCifra = broj / 100;
        int ostatak = broj % 10;
        int zadnjaCifra = ostatak % 10;

        if (prednjaCifra == zadnjaCifra) {
            System.out.println(broj+" je palindrom. ");
        }
        else
            System.out.println(broj+" nije palindrom. ");
    }
}
