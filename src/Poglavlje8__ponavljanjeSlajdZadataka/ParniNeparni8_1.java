package Poglavlje8__ponavljanjeSlajdZadataka;

import java.util.Scanner;

public class ParniNeparni8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite cijeli broj: ");
        int broj = input.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Broj "+broj+" je paran.");
        }
        else
            System.out.println("Broj "+broj+" je neparan.");
    }
}
