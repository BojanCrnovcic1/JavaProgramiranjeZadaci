package Poglavlje3;

import java.util.Scanner;

public class GameHeadsOrTails3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Izaberite glavu -> 0 ili pismo -> 1 : ");
        int user = input.nextInt();

        int novcic = (int) (Math.random() * 2);

        System.out.print("Novcic je pao na ");
        switch (novcic) {
            case 0 : {
                System.out.print("glavu. ");
            }break;
            case 1 : {
                System.out.print("pismo. ");
            }break;
        }
        switch (user) {
            case 0 : {
                if (novcic == 0) {
                    System.out.println("Igrac je pogodio. ");
                }
                else
                    System.out.println("Igrac nije pogodio. ");
            }break;
            case 1: {
                if (novcic == 1) {
                    System.out.println("Igrac je pogodio. ");
                }
                else
                    System.out.println("Igrac nije pogodio. ");
            }break;
        }

    }
}
