package Poglavlje3;

import java.util.Scanner;

public class GameCissorRockPaper3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Izaberite : kamen -> 0 , papir -> 1 , makaze -> 2");
        int user = input.nextInt();

        int computer = (int) (Math.random() * 3);

        System.out.print("Kompjuter igra ");
        switch (computer) {
            case 0 : {
                System.out.print("kamen. ");
            }break;
            case 1 : {
                System.out.print("papir. ");
            }break;
            case 2 : {
                System.out.print("makaze. ");
            }break;
        }

        switch (user) {
            case 0 : {
                if (computer == 0) {
                    System.out.println("Igrac je igrao kamen. Igra je nerijesena. ");
                }
                else if (computer == 1) {
                    System.out.println("Igrac je igrao kamen. Vi ste izgibili. ");
                }
                else if (computer == 2) {
                    System.out.println("Igrac je igrao kamen. Vi ste pobjedili!");
                }
            }break;
            case 1 : {
                if (computer == 0) {
                    System.out.println("Igrac je igrao papir. Vi ste pobjedili. ");
                }
                else if (computer == 1) {
                    System.out.println("Igrac je igrao papir. Igra je nerijesena. ");
                }
                else if (computer == 2) {
                    System.out.println("Igrac je igrao papir. Vi ste izgubili. ");
                }
            }break;
            case 2 : {
                if (computer == 0) {
                    System.out.println("Igrac je igrao makaze. Vi ste izgubili. ");
                }
                else if (computer == 1) {
                    System.out.println("Igrac je igrao makaze. Vi ste pobjedili!");
                }
                else if (computer == 2) {
                    System.out.println("Igrac je igrao makaze. Igra je nerijesena. ");
                }
            }break;
        }
    }
}
