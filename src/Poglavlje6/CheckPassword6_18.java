package Poglavlje6;

import java.util.Scanner;

public class CheckPassword6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite lozinku: ");
        String lozinka = input.next();

        ispisPassworda(lozinka);
    }

    public static boolean duzinaLozinke(String lozinka, int duzina) {
        return lozinka.length() >= duzina;
    }

    public static boolean slovaBrojevi(String lozinka) {
        for (int i = 0; i < lozinka.length(); i++) {
            char ch = lozinka.charAt(i);
            if (!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean viseOdDvaBroja(String lozinka, int brojBrojeva) {
        int countNumber = 0;
        for (int i = 0; i < lozinka.length(); i++) {
            char ch = lozinka.charAt(i);
            if (Character.isDigit(ch)) {
                countNumber++;
                if (countNumber >= brojBrojeva) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(String lozinka) {
        final int DUZINALOZINKE = 8;
        final int BROJSLOVA = 2;

        boolean isValid = (duzinaLozinke(lozinka,DUZINALOZINKE) &&
                slovaBrojevi(lozinka) && viseOdDvaBroja(lozinka,BROJSLOVA));

        return isValid;
    }

    public static void ispisPassworda(String lozinka) {
        if (isValid(lozinka)) {
            System.out.println(lozinka+" je validna.");
        }
        else
            System.out.println(lozinka+" nije validna.");
    }
}
