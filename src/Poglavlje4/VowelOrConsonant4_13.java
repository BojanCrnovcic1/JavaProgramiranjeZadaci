package Poglavlje4;

import java.util.Scanner;

public class VowelOrConsonant4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite slovo: ");
        String slovoString = input.next();
        char slovo = slovoString.charAt(0);

        if(Character.isLetter(slovo)) {
            String maloSlovo = slovo + "";
            if ("aeiou".contains(maloSlovo.toLowerCase())){
                System.out.println(slovo+" je samoglasnik.");
            }
            else
                System.out.println(slovo+" je suglasnik.");
        }
        else System.out.println(slovo+" je pogresan simbol. ");


    }
}
