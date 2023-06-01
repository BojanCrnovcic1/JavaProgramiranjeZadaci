package Poglavlje6;

import java.util.Scanner;

public class PhoneKeypads6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite String: ");
        String unos = input.nextLine();
       for (int i = 0; i < unos.length(); i++) {
           char ch = unos.charAt(i);
           if (Character.isLetter(ch)) {
               System.out.print(getNumber(Character.toUpperCase(ch)));
           }
           else
           System.out.print(ch);
       }
    }

    public static int getNumber(char uppercaseLetter) {
        int broj = 0;
        uppercaseLetter = Character.toUpperCase(uppercaseLetter);
        if (Character.isLetter(uppercaseLetter)) {
            if (uppercaseLetter >= 'W') {
                broj = 9;
            } else if (uppercaseLetter >= 'T') {
                broj = 8;
            } else if (uppercaseLetter >= 'P') {
                broj = 7;
            } else if (uppercaseLetter >= 'M') {
                broj = 6;
            } else if (uppercaseLetter >= 'J') {
                broj = 5;
            } else if (uppercaseLetter >= 'G') {
                broj = 4;
            } else if (uppercaseLetter >= 'D') {
                broj = 3;
            } else if (uppercaseLetter >= 'A') {
                broj = 2;
            }
        }return broj;
    }
}
