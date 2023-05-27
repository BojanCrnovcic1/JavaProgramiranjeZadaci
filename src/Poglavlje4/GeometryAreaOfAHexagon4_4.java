package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfAHexagon4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite stranu: ");
        double strana = input.nextDouble();

        double povrsina = (6 * Math.pow(strana,2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("Povrsina sestougla je : "+povrsina);
    }
}
