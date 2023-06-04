package Poglavlje7;

import java.util.Scanner;

public class ReverseAnArray7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] niz = new int[10];

        System.out.println("Unesite 10 brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }
        System.out.print("Obrnuti niz: ");
        reverseArray(niz);
    }


    public static void reverseArray(int []array) {

        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }

    }
}
