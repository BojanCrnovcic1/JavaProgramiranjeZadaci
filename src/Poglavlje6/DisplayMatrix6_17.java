package Poglavlje6;

import java.util.Scanner;

public class DisplayMatrix6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj za velicinu matrixa:");
        int broj = input.nextInt();

        printMatrix(broj);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int randomBroj = (int) (Math.random() * 2);
                System.out.print(randomBroj+" ");
            }
            System.out.println();
        }
    }
}
