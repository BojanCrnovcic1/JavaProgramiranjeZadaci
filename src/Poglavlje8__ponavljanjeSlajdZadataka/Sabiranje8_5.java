package Poglavlje8__ponavljanjeSlajdZadataka;

import java.util.Scanner;

public class Sabiranje8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int brojJedan = (int) (Math.random() * 10) +1;
        int brojDva = (int) (Math.random() * 10) +1;

        System.out.println("Koliko je "+brojJedan+" + "+brojDva+" ?");
        int odgovor = input.nextInt();

        if (brojJedan + brojDva == odgovor) {
            System.out.println("Tacan odgovor. ");
        }
        else
            System.out.println("Netacan odgovor. Tacan odgovor je "+(brojJedan+brojDva));

    }
}
