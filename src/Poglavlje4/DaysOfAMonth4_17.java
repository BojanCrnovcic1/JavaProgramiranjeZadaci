package Poglavlje4;

import java.util.Scanner;

public class DaysOfAMonth4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        boolean prestupnaGodina = (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0);

        System.out.println("Unesite mjesec: ");
        String mjesec = input.next();

        if (mjesec.equals("Jan") || mjesec.equals("Mar") || mjesec.equals("Maj") ||
        mjesec.equals("Jul") || mjesec.equals("Avg") || mjesec.equals("Okt") || mjesec.equals("Dec")) {
            System.out.println(mjesec+" "+godina+" ima 31 dan.");
        }
        else if (mjesec.equals("Apr") || mjesec.equals("Jun") || mjesec.equals("Sep") || mjesec.equals("Nov")) {
            System.out.println(mjesec+" "+godina+" ima 30 dana. ");
        }
        else if (mjesec.equals("Feb")) {
            System.out.println(mjesec+" "+godina+((prestupnaGodina) ? " ima 29 dana.": " ima 28 dana."));
        }
    }
}
