package Poglavlje4;

import java.util.Scanner;

public class FindTheCharacterOfAnASCIICode4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ASCII kod: ");
        int kod = input.nextInt();

        System.out.println("Karakter za ASCII kod "+kod+" je "+(char)kod);


    }
}
