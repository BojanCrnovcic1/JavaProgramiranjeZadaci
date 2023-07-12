package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> odgovori = new ArrayList<>();

        int broj1 = (int) (Math.random() * 10);
        int broj2 = (int) (Math.random() * 10);

        System.out.println("Koliko je "+broj1+" + "+broj2+" ?");
        int odgovor = input.nextInt();

        while (broj1 + broj2 != odgovor) {

            if (odgovori.contains(odgovor)) {
                System.out.println("Vec ste odgovorili sa "+odgovor+" Pogresan odgovor. Pokusajte ponovo." +
                        " Koliko je "+broj1+" + "+ broj2+" ?");
            }
            else System.out.println("Pogresan odgovor. Pokusajte ponovo. Koliko je "+broj1+" + "+
                    broj2+" ?");
            odgovori.add(odgovor);
            odgovor = input.nextInt();
        }
        System.out.println("Tacan odgovor. ");
    }
}
