package Poglavlje4;

import java.util.Scanner;

public class ProcessAString4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String unos = input.nextLine();

        System.out.println("Duzina stringa je : "+unos.length());
        System.out.println("Prvi karakter u stringu je: "+unos.charAt(0));
    }
}
