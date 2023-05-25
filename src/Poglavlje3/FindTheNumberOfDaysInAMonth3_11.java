package Poglavlje3;

import java.util.Scanner;

public class FindTheNumberOfDaysInAMonth3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite mjesec 1 - 12 : ");
        int mjesec = input.nextInt();
        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        boolean prestupnaGodina = (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0);

        switch (mjesec) {
            case 1 : {
                System.out.println("Januar "+godina+". ima 31 dan.");
            } break;
            case 2 : {
                System.out.println("Februar "+godina+" ima "+(prestupnaGodina?"29 dana. ":"28 dana."));
            } break;
            case 3 : {
                System.out.println("Mart "+godina+". ima 31 dan.");
            } break;
            case 4 : {
                System.out.println("April "+godina+". ima 30 dana.");
            } break;
            case 5 : {
                System.out.println("Maj "+godina+". ima 31 dan.");
            } break;
            case 6 : {
                System.out.println("Jun "+godina+". ima 30 dana.");
            } break;
            case 7 : {
                System.out.println("Jul "+godina+". ima 31 dan.");
            } break;
            case 8 : {
                System.out.println("Avugst "+godina+". ima 31 dan.");
            } break;
            case 9 : {
                System.out.println("Septembar "+godina+". ima 30 dana.");
            } break;
            case 10 : {
                System.out.println("Oktobar "+godina+". ima 31 dan.");
            } break;
            case 11 : {
                System.out.println("Novembar "+godina+". ima 30 dana.");
            } break;
            case 12 : {
                System.out.println("Decembar "+godina+". ima 31 dan.");
            } break;
        }
    }
}
