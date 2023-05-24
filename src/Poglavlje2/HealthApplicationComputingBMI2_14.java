package Poglavlje2;

import java.util.Scanner;

public class HealthApplicationComputingBMI2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu u funtama :");
        double funta = input.nextDouble();
        System.out.println("Unesite visinu u incima: ");
        double inc = input.nextDouble();

        double kilogram = funta * 0.45359237;
        double metar = inc * 0.0254;

        double bmi = kilogram / (metar * metar);

        System.out.println("BMi je : "+bmi);
    }
}
