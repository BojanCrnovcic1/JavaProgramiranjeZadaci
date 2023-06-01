package Poglavlje6;

import java.util.Scanner;

public class TheMyTriangleClass6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvu stranu trougla: ");
        double strana1 = input.nextDouble();
        System.out.println("Unesite drugu stranu trougla: ");
        double strana2 = input.nextDouble();
        System.out.println("Unesite trecu stranu trougla: ");
        double strana3 = input.nextDouble();

        ispis(strana1,strana2,strana3);

    }

    public static double area(
            double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static boolean isValid(
            double side1, double side2, double side3) {
        boolean valid = (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
        return valid;
    }

    public static void ispis(double side1, double side2, double side3) {
        if (isValid(side1,side2,side3)) {
            System.out.println("Povrsina torugla je: "+area(side1,side2,side3));
        }
        else
            System.out.println("Pogresan unos. Trougao nije jednakostranican.");
    }
}
