package Poglavlje7;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays7_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []array1 = new int[6];
        int []array2 = new int[6];

        System.out.println("Unesite prvu listu: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Unesite drugu listu: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        System.out.println("Dve liste "+(equals(array1,array2)?"su":"nisu")+" indeticne.");
    }

    public static boolean equals(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

}
