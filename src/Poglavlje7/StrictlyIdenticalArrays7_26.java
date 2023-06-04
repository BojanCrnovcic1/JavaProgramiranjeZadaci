package Poglavlje7;

import java.util.Scanner;

public class StrictlyIdenticalArrays7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []lista1 = new int[6];
        int []lista2 = new int[6];

        System.out.println("Unesite listu jedan: ");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = input.nextInt();
        }
        System.out.println("Unesite listu dva: ");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = input.nextInt();
        }

        System.out.println("Dve liste "+(equals(lista1,lista2)? "su":"nisu")+" striktno indeticne.");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    return false;
            }
        }
        return true;
    }
}
