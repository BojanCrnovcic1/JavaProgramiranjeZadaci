package Poglavlje7;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedLists7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []array1 = new int[6];
        int []array2 = new int[5];

        System.out.println("Unesite listu jedan: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Unesite listu dva: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        ispis(merge(array1,array2));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int dveListe = list1.length + list2.length;

        int[] rezultat = new int[dveListe];
        for (int i = 0; i < list1.length; i++) {
            rezultat[i] += list1[i];
        }

        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            rezultat[j] += list2[i];
        }
        Arrays.sort(rezultat);
        return rezultat;
    }

    public static void ispis(int []merge) {
        for (int e : merge) {
            System.out.print(e+" ");
        }
    }
}
