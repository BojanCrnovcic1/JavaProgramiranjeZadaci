package Poglavlje3;

import java.util.Scanner;

public class BusinessCheckISBN10_3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvih 9 cifara ISBN broja: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        int ostatak = isbn % 100000000;
        int d2 = ostatak / 10000000;
        ostatak %= 10000000;
        int d3 = ostatak / 1000000;
        ostatak %= 1000000;
        int d4 = ostatak / 100000;
        ostatak %= 100000;
        int d5 = ostatak / 10000;
        ostatak %= 10000;
        int d6 = ostatak / 1000;
        ostatak %= 1000;
        int d7 = ostatak / 100;
        ostatak %= 100;
        int d8 = ostatak / 10;
        ostatak %= 10;
        int d9 = ostatak;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("ISBN 10 broj je: "+d1+d2+d3+d4+d5+d6+d7+d8+d9);
        if (d10 == 10) {
            System.out.print("X");
        }else
            System.out.print(d10);


    }
}
