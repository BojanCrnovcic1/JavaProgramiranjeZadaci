package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList11_12 {
    public static void main(String[] args) {

        ArrayList<Double> lista = new ArrayList<>();

        lista = unesiListu(lista);

        System.out.println("Zbir elemenata liste : " + sum(lista));

    }

    public static ArrayList<Double> unesiListu(ArrayList<Double> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite 5 double brojeva : ");
        for (int i = 0; i < 5; i++) {
            double broj = input.nextDouble();
            list.add(broj);
        }
        return list;
    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
