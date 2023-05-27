package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfAPentagon4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite duzinu od centra do kraja: ");
        double r = input.nextDouble();

        double strana = (2 * r) * Math.sin(Math.PI / 5);

        double povrsina = (5 * Math.pow(strana,2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("Povrsina petougla je : "+povrsina);
    }
}
