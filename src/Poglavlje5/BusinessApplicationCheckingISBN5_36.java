package Poglavlje5;

import java.util.Scanner;

public class BusinessApplicationCheckingISBN5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvih 9 ISBN cifara: ");
        String isbn = input.next();

        int d10 = 0;

        for (int i = 0; i < 9; i++) {
            d10 += Integer.parseInt(isbn.charAt(i)+ "") * (i + 1);
        }
        d10 %= 11;

        for (int i = 0; i < 9; i++) {
            System.out.print(isbn.charAt(i));
        }
        if (d10 == 10) {
            System.out.println("X");
        }
        else
            System.out.println(10);


    }
}
