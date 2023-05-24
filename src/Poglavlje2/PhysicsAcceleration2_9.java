package Poglavlje2;

import java.util.Scanner;

public class PhysicsAcceleration2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite v0, v1, i t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("Prosjecno ubrzanje je : "+a);


    }
}
