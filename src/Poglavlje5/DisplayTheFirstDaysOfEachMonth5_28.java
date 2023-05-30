package Poglavlje5;

import java.util.Scanner;

public class DisplayTheFirstDaysOfEachMonth5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();
        System.out.println("Unesite prvi dan u godini: ");
        int dan = input.nextInt();

        String ispis;

        for (int mjesec = 1; mjesec <= 12; mjesec++) {
            ispis = "";
            switch (mjesec) {
                case 1: ispis+="Januar"; break;
                case 2: ispis+="Februar"; break;
                case 3: ispis+="Mart"; break;
                case 4: ispis+="April"; break;
                case 5: ispis+="Maj"; break;
                case 6: ispis+="Jun"; break;
                case 7: ispis+="Jul"; break;
                case 8: ispis+="Avgust"; break;
                case 9: ispis+="Septembar"; break;
                case 10: ispis+="Oktobar"; break;
                case 11: ispis+="Novembar"; break;
                case 12: ispis+="Decembar"; break;
            }

            ispis += " 1, "+godina+". je ";

            dan %= 7;

            switch (dan) {
                case 0 : {
                    System.out.println(ispis+"Nedelja.");
                }break;
                case 1 : {
                    System.out.println(ispis+"Ponedeljak.");
                }break;
                case 2 : {
                    System.out.println(ispis+"Utorak");
                }break;
                case 3 : {
                    System.out.println(ispis+"Sreda.");
                }break;
                case 4 : {
                    System.out.println(ispis+"Cetvrtak.");
                }break;
                case 5 : {
                    System.out.println(ispis+"Subota.");
                }break;
                case 6 : {
                    System.out.println(ispis+"Nedelja.");
                }break;
            }
            if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7 || mjesec == 8
            || mjesec == 10 || mjesec == 12) {
                dan += 31;
            }
            else if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
                dan += 30;
            }
            else {
                if (mjesec % 4 == 0 && mjesec % 100 != 0 || mjesec % 400 == 0) {
                    dan += 29;
                }
                else
                    dan += 28;
            }
        }

    }
}
