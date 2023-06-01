package Poglavlje6;

import java.util.Scanner;

public class CountTheLettersInAString6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite String: ");
        String unos = input.nextLine();

        ispisBrojanja(unos);
    }

    public static int countLetters(String s) {
        int countLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                countLetters++;
            }
        }
        return countLetters;
    }

    public static void ispisBrojanja(String s) {
        System.out.println("String sadrzi "+countLetters(s)+" slova.");
    }
}
