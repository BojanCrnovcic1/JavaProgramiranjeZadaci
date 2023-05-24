package Poglavlje2;

import java.util.Scanner;

public class FindTheNumberOfYears2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int minutSat = 60;
        final int satDan = 24;
        final int danGodina = 365;

        System.out.println("Unesite broj minuta :");
        int minuta = input.nextInt();

        int godina = minuta / minutSat / satDan / danGodina;
        int dan = minuta / minutSat / satDan % danGodina;

        System.out.println(minuta+" minuta ima priblizno "+godina+" godina i "+dan+" dana. ");
    }
}
