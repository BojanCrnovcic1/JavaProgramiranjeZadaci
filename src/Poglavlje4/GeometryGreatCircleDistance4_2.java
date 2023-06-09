package Poglavlje4;

import java.util.Scanner;

public class GeometryGreatCircleDistance4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double RADIUS = 6371.01;

        System.out.println("Unesite tacku jedan (sirina i duzina) u stepenima : ");
        String xy1 = input.next();
        System.out.println("Unesite tacku dva (sirina i duzina) u stepenima : ");
        String xy2 = input.next();

        int k = xy1.indexOf(',');
        double x1 = Double.parseDouble(xy1.substring(0,k-1));
        double y1 = Double.parseDouble(xy1.substring(k+2));

        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0,k-1));
        double y2 = Double.parseDouble(xy2.substring(k+2));

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double distanca =
                RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("Distanca izmedju dvije tacke je "+distanca+" km.");


    }
}
