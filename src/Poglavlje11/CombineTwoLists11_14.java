package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        System.out.println("Unesite 10 integera u listu 1 : ");
        lista1 = unosListe(lista1);

        System.out.println("Unesite 10 integera u listu 2 : ");
        lista2 = unosListe(lista2);

        System.out.println("Kombinovana lista : "+union(lista1,lista2));

    }

    public static ArrayList<Integer> unosListe(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int broj = input.nextInt();
            list.add(broj);
        }
        return list;
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

}
