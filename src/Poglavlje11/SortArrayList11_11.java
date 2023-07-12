package Poglavlje11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList11_11 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista = unesiListu(lista);

        System.out.print("Sortirana lista : ");
        sort(lista);
        ispisListe(lista);


    }

    public static void ispisListe(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
    public static ArrayList<Integer> unesiListu(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite 5 integera : ");
        for (int i = 0; i < 5; i++) {
            int broj = input.nextInt();
            list.add(broj);
        }
        return list;
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
