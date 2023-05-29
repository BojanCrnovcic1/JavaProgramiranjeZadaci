package Poglavlje5;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbersAndComputeTheAverageOfNumbers5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int countPositiv = 0;
        int countNegativ = 0;
        int suma = 0;
        double prosjek = 0.0;

        System.out.println("Unosite brojeve, unos se zavrsava sa 0: ");
        int broj = input.nextInt();
        if (broj == 0) {
            System.out.println("Nema brojeva, unijeli ste prvo "+broj);
        }else
        {
        while (broj != 0) {
            if (broj > 0) {
                countPositiv++;
            }
            else {
                countNegativ++;
            }

            suma+=broj;
            count++;
            broj = input.nextInt();
        }
        prosjek = suma / count;

        System.out.println("Broj pozitivnih brojeva je: "+countPositiv+"" +
                "\nBroj negativnih brojeva je: "+countNegativ+"" +
                "\nZbir brojeva je: "+suma+"" +
                "\nProsjek brojeva je: "+prosjek);
        }
    }
}
