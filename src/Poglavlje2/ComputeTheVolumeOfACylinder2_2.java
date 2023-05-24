package Poglavlje2;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite radisu i duzinu cilindra: ");
        double radius = input.nextDouble();
        double duzina = input.nextDouble();

        double povrsina = radius * radius * Math.PI;
        double zapremina = povrsina * duzina;

        System.out.println("Povrsina je : "+povrsina);
        System.out.println("Zapremina je : "+zapremina);
    }
}
