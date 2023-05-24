package Poglavlje2;

import java.util.Scanner;

public class ScienceCalculatingEnergy2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos vode u kilogramima: ");
        double M = input.nextDouble();
        System.out.println("Unesite pocetnu temperaturu: ");
        double pocetnaTemperatura = input.nextDouble();
        System.out.println("Unesite konacnu temperaturu: ");
        double finalTemperatura = input.nextDouble();

        double Q = M * (finalTemperatura - pocetnaTemperatura) * 4184;

        System.out.println("Potrebna energija je : "+Q);
    }
}
