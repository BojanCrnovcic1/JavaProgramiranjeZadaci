package Poglavlje2;

import java.util.Scanner;

public class ConvertFeetIntoMeters2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vrijednost u stopama: ");
        double stopa = input.nextDouble();

        double metar = stopa * 0.305;

        System.out.println(stopa+" stopa je "+metar+" metara.");
    }
}
