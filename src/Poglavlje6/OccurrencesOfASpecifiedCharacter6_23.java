package Poglavlje6;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacter6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String string = input.nextLine();
        System.out.println("Unesite karakter: ");
        String karakter = input.next();
        char ch = karakter.charAt(0);

        System.out.println("Izabrani karakter u stringu se ponavlja "+count(string,ch)+" puta.");
    }



    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
