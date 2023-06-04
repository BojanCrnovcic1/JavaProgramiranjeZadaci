package Poglavlje7;

import java.util.Scanner;

public class MathCombinations7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] niz = new int[10];

        System.out.println("Unesite deset integera: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        System.out.println("Ispis svih kombinacija: ");
        sveKombinacije(niz);
    }

    public static void sveKombinacije(int []array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i]+" "+array[j]);
            }
        }
    }
}
