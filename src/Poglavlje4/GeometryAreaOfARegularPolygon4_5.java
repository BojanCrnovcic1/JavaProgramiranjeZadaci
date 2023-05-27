package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfARegularPolygon4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj strana poligona: ");
        int brojStrana = input.nextInt();
        System.out.println("Unesite stranu: ");
        double strana = input.nextDouble();

        double povrsina = (brojStrana * Math.pow(strana,2)) / (4 * Math.tan(Math.PI / brojStrana));

        System.out.println("Povrsina poligona je : "+povrsina);
    }
}
