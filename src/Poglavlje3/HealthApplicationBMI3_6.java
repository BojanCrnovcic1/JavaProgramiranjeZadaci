package Poglavlje3;

import java.util.Scanner;

public class HealthApplicationBMI3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu u funtama: ");
        double tezina = input.nextDouble();
        System.out.println("Unesite stope: ");
        double stope = input.nextDouble();
        System.out.println("Unesite ince: ");
        double ince = input.nextDouble();

        final double KILOGRAM_PO_FUNTI = 0.45359237;
        final double METAR_PO_INCU = 0.0254;
        final double STOPA_PO_INCU = 0.0833333;

        tezina *= KILOGRAM_PO_FUNTI;
        double visina = (ince += stope / STOPA_PO_INCU) * METAR_PO_INCU;
        double bmi = tezina / Math.pow(visina,2);

        System.out.println("BMI je: "+bmi);
        if (bmi < 18.5) {
            System.out.println("Pothranjenost. ");
        }
        else if (bmi < 25.0 && bmi >= 18.5) {
            System.out.println("Normalan.");
        }
        else if (bmi < 30.0 && bmi >= 25.0) {
            System.out.println("Gojaznost. ");
        }
        else if (bmi >= 30.0) {
            System.out.println("Pretilost. ");
        }






    }
}
