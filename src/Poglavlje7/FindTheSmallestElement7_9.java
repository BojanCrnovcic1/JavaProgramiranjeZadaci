package Poglavlje7;

import java.util.Scanner;

public class FindTheSmallestElement7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] niz = new double[10];

        System.out.println("Unesite 10 brojeva: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextDouble();
        }
        System.out.println("Najmanji broj u nizu je: "+min(niz));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
