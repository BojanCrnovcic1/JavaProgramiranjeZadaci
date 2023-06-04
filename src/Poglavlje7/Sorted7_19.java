package Poglavlje7;

import java.util.Scanner;

public class Sorted7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj elemenata u listu: ");
        int elementi = input.nextInt();

        int []lista = new int[elementi];
        System.out.println("Unesite listu: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = input.nextInt();
        }
        System.out.println("Lista "+(isSorted(lista)? " je vec soritana" : " nije sortirana."));

    }


    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i] + 1) {
                return false;
            }
        }
        return true;
    }
}
