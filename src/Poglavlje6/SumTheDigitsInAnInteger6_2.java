package Poglavlje6;

import java.util.Scanner;

public class SumTheDigitsInAnInteger6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();

        System.out.println("Zbir cifara unesenog broja je : "+sumDigits(broj));

    }

    public static int sumDigits(long n) {
        int zadnji = (int) (n % 10);
        int ostatak = (int) (n / 10);
        int prednji = ostatak / 10;
        int srednji = ostatak % 10;
        return prednji + srednji + zadnji;
    }
}
