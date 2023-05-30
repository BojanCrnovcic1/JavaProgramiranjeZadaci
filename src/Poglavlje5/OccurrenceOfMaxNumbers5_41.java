package Poglavlje5;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int broj;
        int max = 0;
        int count = 0;

        System.out.println("Unosite brojeve dok ne unesete 0: ");
        do {
            broj = input.nextInt();

            if (broj > max) {
                max = broj;
                count++;
            }
        }while (broj != 0);

        System.out.println("Najveci broj je: "+max+"" +
                "\nNajveci broj se ponavlja: "+count);
    }
}
