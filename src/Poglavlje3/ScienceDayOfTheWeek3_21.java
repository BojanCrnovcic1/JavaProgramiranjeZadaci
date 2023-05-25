package Poglavlje3;

import java.util.Scanner;

public class ScienceDayOfTheWeek3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();
        System.out.println("Unesite mjesec: 1 - 12 ");
        int mjesec = input.nextInt();
        int m;
        if (mjesec == 1) {
            m = 13;
            godina -= 1;
        }
        else if (mjesec == 2) {
            m = 14;
            godina -= 1;
        }
        else m = mjesec;

        System.out.println("Unesite dan u mjesecu: 1 - 31 ");
        int q = input.nextInt();

        int j = (godina / 100);
        int k = (godina % 100);

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        System.out.print("Dan u sedmici je ");
        switch (h) {
            case 0: {
                System.out.print("Subota.");
            }break;
            case 1: {
                System.out.print("Nedelja.");
            }break;
            case 2: {
                System.out.print("Ponedeljak.");
            }break;
            case 3: {
                System.out.print("Utorak.");
            }break;
            case 4: {
                System.out.print("Sreda.");
            }break;
            case 5: {
                System.out.print("Cetvrtak.");
            }break;
            case 6: {
                System.out.print("Petak.");
            }break;
        }


    }
}
