package Poglavlje2;

import java.util.Scanner;

public class CurrentTime2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vremensku zonu : ");
        int GMT = input.nextInt();

        long totalMiliSekund = System.currentTimeMillis();
        long totalSekund = totalMiliSekund / 1000;
        long sekund = totalSekund % 60;
        long totalMinut = totalSekund / 60;
        long minut = totalMinut % 60;
        long totalSat = totalMinut / 60;
        long sat = totalSat % 24;

        sat = sat + GMT;



        System.out.println("Trenutno vrijeme je "+sat+":"+minut+":"+sekund+" GMT. ");




    }
}
