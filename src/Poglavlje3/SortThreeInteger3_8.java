package Poglavlje3;

import java.util.Scanner;

public class SortThreeInteger3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi integer: ");
        int prviBroj = input.nextInt();
        System.out.println("Unesite drugi integer: ");
        int drugiBroj = input.nextInt();
        System.out.println("Unesite treci integer: ");
        int treciBroj = input.nextInt();

        int temp;
        if (drugiBroj > prviBroj|| treciBroj > prviBroj ) {
            if (drugiBroj > prviBroj) {
                temp = prviBroj;
                prviBroj = drugiBroj;
                drugiBroj = temp;
            }
            if (treciBroj > prviBroj) {
                temp = prviBroj;
                prviBroj = treciBroj;
                treciBroj = temp;
            }
        }
        if (treciBroj > drugiBroj) {
            temp = drugiBroj;
            drugiBroj = treciBroj;
            treciBroj = temp;
        }

        System.out.println("Raspored integera od veceg prema manjem je : "+prviBroj+", "+drugiBroj+", "+treciBroj);
    }
}
