package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElementInArrayList11_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Unosite brojeve u listu dok ne unesete 0 : ");
        int broj = input.nextInt();

        while (broj !=0 ) {
            lista.add(broj);
            broj = input.nextInt();
        }
        System.out.println("Najveci element u listi je : " + max(lista));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

}
