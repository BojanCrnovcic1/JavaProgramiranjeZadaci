package Poglavlje5;

import java.util.Scanner;

public class RepeatAdditions5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int BROJPITANJA = 10;
        int count = 0;
        int countTacno = 0;
        String ispis ="";
        long startVrijeme = System.currentTimeMillis();

        while (count < BROJPITANJA) {
            int broj1 = (int) (Math.random() * 15) +1;
            int broj2 = (int) (Math.random() * 15) +1;

            System.out.println("Koliko je "+broj1+" + "+broj2+" ?");
            int odgovor = input.nextInt();

            if (broj1+broj2 == odgovor) {
                System.out.println("Tacan odgovor: ");
                countTacno++;
            }
            else
                System.out.println("Odgovor je netacan. Tacan odgovor je "+(broj1+broj2));
            count++;

            ispis+= "\n "+broj1+" + "+broj2+" = "+odgovor+
                    ((broj1 + broj2 == odgovor)?" tacno ":" netacno ");
        }

        long krajVrijeme = System.currentTimeMillis();
        long testVrijeme = krajVrijeme - startVrijeme;

        System.out.println("Tacnih odgovora je: "+countTacno+"" +
                "\nTestno vrijeme je : "+testVrijeme/1000+" sekundi. "+ispis);
    }
}
