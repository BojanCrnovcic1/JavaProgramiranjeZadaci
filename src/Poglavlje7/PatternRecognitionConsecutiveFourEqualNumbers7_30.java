package Poglavlje7;

import java.util.Scanner;

public class PatternRecognitionConsecutiveFourEqualNumbers7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj vrijednosti: ");
        int vrijednost = input.nextInt();

        int []niz = new int[vrijednost];

        System.out.println("Unesite vrijednost: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        System.out.println("Lista "+(isConsecutiveFour(niz)?"ima":"nema")+" cetiri uzastopne jednake.");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length -1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
            }
            if (count >= 4) {
                return true;
            }
            if (values[i] != values[i + 1]) {
                count = 1;
            }
        }
        return false;
    }
}
