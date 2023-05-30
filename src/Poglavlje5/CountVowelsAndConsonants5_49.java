package Poglavlje5;

import java.util.Scanner;

public class CountVowelsAndConsonants5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int samoglanici = 0;
        int suglasnici = 0;

        System.out.println("Unesite string: ");
        String unos = input.nextLine();

        for (int i = 0; i < unos.length(); i++) {

            char uno = unos.charAt(i);

            if (Character.isLetter(uno)) {
                String slovo = uno + "";
                if ("aeiou".contains(slovo.toLowerCase())) {
                    samoglanici++;
                }
                else
                    suglasnici++;
            }
        }
        System.out.println("Broj samoglasnika : "+samoglanici+"" +
                "\nBroj suglanika: "+suglasnici);

    }
}
