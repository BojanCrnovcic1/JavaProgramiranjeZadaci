package Poglavlje11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList11_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Unosite u listu integere dok ne unesete 0 : ");
        int broj = input.nextInt();
        while (broj != 0) {
            lista.add(broj);
            broj = input.nextInt();
        }

        System.out.print("Izmijesana lista : ");
        shuffle(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
