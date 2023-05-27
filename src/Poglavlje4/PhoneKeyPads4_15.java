package Poglavlje4;

import java.util.Scanner;

public class PhoneKeyPads4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite slovo: ");
        String slovoString = input.next();
        char slovo = slovoString.charAt(0);

        int broj = 0;
        slovo = Character.toUpperCase(slovo);
        if (Character.isLetter(slovo)){
            if (slovo >= 'W') {
                broj = 9;
            }
            else if (slovo >= 'T') {
                broj = 8;
            }
            else if (slovo >= 'P') {
                broj = 7;
            }
            else if (slovo >= 'M') {
                broj = 6;
            }
            else if (slovo >= 'J') {
                broj = 5;
            }
            else if (slovo >= 'G') {
                broj = 4;
            }
            else if (slovo >= 'D') {
                broj = 3;
            }
            else if (slovo >= 'A') {
                broj = 2;
            }
            System.out.println("Nalazi se na broju : "+broj);
        }else
            System.out.println(slovo+" je pogresan unos. ");
    }
}
