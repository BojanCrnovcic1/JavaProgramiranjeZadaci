package Poglavlje5;

import java.util.Scanner;

public class GameLottery5_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\tL O T O\t\t\t\t");

        System.out.println("Unesite vas dvocifreni loto broj: ");
        int user = input.nextInt();

        int userPrvi = user /10;
        int userDrugi = user % 10;

        int lotoPrvi = (int) (Math.random() * 10);
        int lotoDrugi;
        do {
            lotoDrugi = (int) (Math.random() * 10);
        }while (lotoPrvi == lotoDrugi);

        System.out.println("Loto broj je : "+lotoPrvi+lotoDrugi);

        if (userPrvi == lotoPrvi && userDrugi == lotoDrugi) {
            System.out.println("Osvojili te 10000$!");
        }
        else if (userPrvi == lotoDrugi && userDrugi == lotoPrvi) {
            System.out.println("Osvojili ste 3000$!");
        }
        else if (userPrvi == lotoPrvi || userPrvi == lotoDrugi || userDrugi == lotoPrvi || userDrugi == lotoDrugi) {
            System.out.println("Osvojli ste 1000$!");
        }
        else
            System.out.println("Loto broj nije dobitni. ");
    }
}
