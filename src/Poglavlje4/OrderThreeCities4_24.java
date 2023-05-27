package Poglavlje4;

import java.util.Scanner;

public class OrderThreeCities4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi grad: ");
        String grad1 = input.nextLine();
        System.out.println("Unesite drugi grad: ");
        String grad2 = input.nextLine();
        System.out.println("Unesite treci grad: ");
        String grad3 = input.nextLine();

        String temp;
        if (grad2.compareTo(grad1) < 0 && grad2.compareTo(grad3) < 0) {
            temp = grad1;
            grad1 = grad2;
            grad2 = temp;
        }
        else if (grad3.compareTo(grad1) < 0 && grad3.compareTo(grad2) < 0) {
            temp = grad1;
            grad1 = grad3;
            grad3 = temp;
        }
        if (grad3.compareTo(grad2) < 0) {
            temp = grad2;
            grad2 = grad3;
            grad3 = temp;
        }

        System.out.println("Raspored gradova po alfabetskom redu je: "+grad1+", "+grad2+", "+grad3+".");
    }
}
