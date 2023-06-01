package Poglavlje6;

import java.util.Scanner;

public class GeometryAreaOfARegularPolygon6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj strana: ");
        int brojStrana = input.nextInt();
        System.out.println("Unesite stranu: ");
        double strana = input.nextDouble();

        System.out.println("Povrsina poligona je : "+area(brojStrana,strana));
    }


    public static double area(int n, double side) {
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
