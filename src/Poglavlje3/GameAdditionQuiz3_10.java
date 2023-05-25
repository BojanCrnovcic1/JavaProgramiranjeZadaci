package Poglavlje3;

import java.util.Scanner;

public class GameAdditionQuiz3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int broj1 = (int) (Math.random() * 100);
        int broj2 = (int) (Math.random() * 100);

        System.out.println("Koliko je "+broj1+" + "+broj2+" ?");
        int rezultat = input.nextInt();

        if (broj1 + broj2 == rezultat) {
            System.out.println("Tacan odgovor!");
        }
        else
            System.out.println("Odgovor je netacan. Tacan rezultat je "+(broj1+broj2));
    }
}
