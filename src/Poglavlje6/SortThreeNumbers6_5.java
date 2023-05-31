package Poglavlje6;

import java.util.Scanner;

public class SortThreeNumbers6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite 3 broja: ");
        int broj1 = input.nextInt();
        int broj2 = input.nextInt();
        int broj3 = input.nextInt();

        displaySortedNumbers(broj1,broj2,broj3);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp;
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1+", "+num2+", "+num3);
    }
}
