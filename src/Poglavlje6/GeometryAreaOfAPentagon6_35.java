package Poglavlje6;

import java.util.Scanner;

public class GeometryAreaOfAPentagon6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite stranu: ");
        double strana = input.nextDouble();

        System.out.println("Povrsina pentagona je : "+area(strana));
    }


    public static double area(double side) {
        return (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 5));
    }
}
