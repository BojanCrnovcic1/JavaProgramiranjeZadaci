package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates11_13 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista = unesiListu(lista);

        removeDuplicate(lista);

        System.out.print("Lista bez duplikata : ");
        ispisiListu(lista);

    }


    public static ArrayList<Integer> unesiListu(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite 10 integera : ");
        for (int i = 0; i < 10; i++) {
            int broj = input.nextInt();
            list.add(broj);
        }
        return list;
    }

    public static void ispisiListu(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
