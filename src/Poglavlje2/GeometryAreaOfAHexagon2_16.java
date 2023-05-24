package Poglavlje2;

import java.util.Scanner;

public class GeometryAreaOfAHexagon2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite stranu: ");
        double strana = input.nextDouble();

        double povrsina = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(strana, 2);

        System.out.println("Povrsina heksagona je "+povrsina);
    }
}
