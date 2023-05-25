package Poglavlje3;

import java.util.Scanner;

public class GamePickACard3_24 {
    public static void main(String[] args) {

        System.out.println("Izvucite kartu: ");

        int karta = (int) (Math.random() * 13);
        int znak = (int) (Math. random() * 4);

        System.out.print("Izvucena karta je ");
        switch (karta) {
            case 0: {
                System.out.print("A ");
            }break;
            case 1: {
                System.out.print("2 ");
            }break;
            case 2: {
                System.out.print("3 ");
            }break;
            case 3: {
                System.out.print("4 ");
            }break;
            case 4: {
                System.out.print("5 ");
            }break;
            case 5: {
                System.out.print("6 ");
            }break;
            case 6: {
                System.out.print("7 ");
            }break;
            case 7: {
                System.out.print("8 ");
            }break;
            case 8: {
                System.out.print("9 ");
            }break;
            case 9: {
                System.out.print("10 ");
            }break;
            case 10: {
                System.out.print("J ");
            }break;
            case 11: {
                System.out.print("Q ");
            }break;
            case 12: {
                System.out.print("K ");
            }break;
        }

        switch (znak) {
            case 0: {
                System.out.print("Pik.");
            }break;
            case 1: {
                System.out.print("Herc.");
            }break;
            case 2: {
                System.out.print("Tref.");
            }break;
            case 3: {
                System.out.print("Karo.");
            }break;
        }

    }
}
