package Poglavlje8__ponavljanjeSlajdZadataka;

import java.util.Scanner;

public class Ocjena8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj bodova: ");
        double brojBodova = input.nextDouble();

        if (brojBodova >= 90) {
            System.out.println("Ocjena je 10.");
        }
        else if (brojBodova <= 89 && brojBodova >= 80) {
            System.out.println("Ocjena je 9.");
        }
        else if (brojBodova <= 79 && brojBodova >= 70) {
            System.out.println("Ocjena je 8.");
        }
        else if (brojBodova <= 69 && brojBodova >= 60) {
            System.out.println("Ocjena je 7.");
        }
        else if (brojBodova <= 59 && brojBodova >= 50) {
            System.out.println("Ocjena je 6.");
        }
        else if (brojBodova <= 49) {
            System.out.println("Student nije polozio ispit. ");
        }

    }
}
