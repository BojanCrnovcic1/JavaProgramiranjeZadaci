package Poglavlje7;

import java.util.Scanner;

public class AverageAnArray7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []integerNiz = new int[10];
        double []doubleNiz = new double[10];

        System.out.println("Unesite 10 brojeva: ");
        for (int i = 0; i < 10; i++) {
            doubleNiz[i] = input.nextDouble();
            integerNiz[i] = (int) doubleNiz[i];
        }

        System.out.println("Prosjek 10 double brojeva je: "+average(doubleNiz)+"" +
                "\nProsjek 10 integer brojeva je: "+average(integerNiz));

    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / 10;
    }

    public static int average(int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / 10;
    }
}
