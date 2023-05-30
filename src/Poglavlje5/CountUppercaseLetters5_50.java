package Poglavlje5;

import java.util.Scanner;

public class CountUppercaseLetters5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Unesite String: ");
        String unos = input.nextLine();

        for (int i = 0; i < unos.length(); i++) {
            char uno = unos.charAt(i);

            if (Character.isUpperCase(uno)) {
                count++;
            }
        }

        System.out.println("Broj velikih slova u stringu je: "+count);
    }
}
