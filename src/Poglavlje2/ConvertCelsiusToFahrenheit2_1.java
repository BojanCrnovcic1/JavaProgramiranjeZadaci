package Poglavlje2;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite temperaturu u celzijusima: ");
        double celzijus = input.nextDouble();

        double fahrenheit =  (9.0 / 5) * celzijus + 32;

        System.out.println(celzijus+" celzijusa je "+fahrenheit+" fahrenheita. ");
    }
}
