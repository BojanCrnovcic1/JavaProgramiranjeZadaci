package Poglavlje3;

import java.util.Scanner;

public class GameLottery3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------- L O T O ------------");

        int loto = (int) (Math.random() * 1000);

        System.out.println("Unesite trocifreni loto broj: ");
        int user = input.nextInt();

        int lotoCifra1 = loto / 100;
        int ostatak = loto % 100;
        int lotoCifra2 = ostatak / 10;
        int lotoCifra3 = ostatak % 10;

        int userCifra1 = user / 100;
        int ostatakU = user % 100;
        int userCifra2 = ostatakU / 10;
        int userCifra3 = ostatakU % 10;

        System.out.println("Broj lota je : "+loto);

        if (loto == user) {
            System.out.println("Osvojili ste 10 000$!");
        }
        else if (lotoCifra1 == userCifra2 && lotoCifra1 == userCifra3 && lotoCifra2 == userCifra1 &&
        lotoCifra2 == userCifra3 && lotoCifra3 == userCifra1 && lotoCifra3 == userCifra2) {
            System.out.println("Osvojili ste 3000$!");
        }
        else if (lotoCifra1 == userCifra1 || lotoCifra1 == userCifra2 || lotoCifra1 == userCifra3
        || lotoCifra2 == userCifra1 || lotoCifra2 == userCifra2 || lotoCifra2 == userCifra3
        || lotoCifra3 == userCifra1 || lotoCifra3 == userCifra2 || lotoCifra3 == userCifra3) {
            System.out.println("Osvojili ste 1000$!");
        }
        else
            System.out.println("Bez dobitka. ");




    }
}
