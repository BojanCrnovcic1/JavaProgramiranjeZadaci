package Poglavlje4;

import java.util.Scanner;

public class FindTheUnicodeOfACharacter4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite karakter: ");
        String karakter = input.next();
        char kar = karakter.charAt(0);

        System.out.println("Unikod za karakter "+kar+" je "+(int)kar);
    }
}
