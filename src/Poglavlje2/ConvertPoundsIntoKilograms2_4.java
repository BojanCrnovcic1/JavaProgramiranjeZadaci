package Poglavlje2;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj funti: ");
        double funte = input.nextDouble();

        double kilogram = funte * 0.454;

        System.out.println(funte+" funti iznosi "+kilogram+" kilograma. ");
    }
}
