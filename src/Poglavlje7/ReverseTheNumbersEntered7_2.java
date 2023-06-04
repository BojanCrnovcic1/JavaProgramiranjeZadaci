package Poglavlje7;

import java.util.Scanner;

public class ReverseTheNumbersEntered7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []niz = new int[10];

        System.out.println("Unesite niz od 10 integera: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        reverseArrey(niz);
    }


    private static void reverseArrey(int []array) {
        System.out.print("Obrnuti niz: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
