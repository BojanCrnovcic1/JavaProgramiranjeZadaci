package Poglavlje5;

import java.util.Scanner;

public class GameScissorRockPaper5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userWin = 0;
        int compWin = 0;

        int user, computer;

        do {
            System.out.println("Izaberite : Kamen -> 0, Papir -> 1, Makaze -> 2");
            user = input.nextInt();

            System.out.print("Igrac igra : ");
            switch (user) {
                case 0: {
                    System.out.print(" kamen ");
                }break;
                case 1: {
                    System.out.print(" papir ");
                }break;
                case 2: {
                    System.out.print(" makaze ");
                }break;
            }

            System.out.print("Kompjutor igra :");
            computer = (int) (Math.random() * 3);

            switch (computer) {
                case 0: {
                    System.out.print(" kamen. ");
                }break;
                case 1: {
                    System.out.print(" papir. ");
                }break;
                case 2: {
                    System.out.print(" makaze. ");
                }break;
            }

            if (user == computer) {
                System.out.println("Igra je nerijesena.");
            }
            else {
                boolean win = (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1);
                if (win) {
                    System.out.println("Vi ste pobjedili!");
                    userWin++;
                }
                else
                    System.out.println("Komjuter je pobjedio. ");
                compWin++;


                System.out.println("Pobjede: " +
                        "\nIgrac: "+userWin+"" +
                        "\nKompjuter: "+compWin);
            }
        }while (Math.abs(compWin - userWin) < 2);
    }
}
