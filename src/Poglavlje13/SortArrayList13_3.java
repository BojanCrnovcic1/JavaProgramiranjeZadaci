package Poglavlje13;

import java.util.ArrayList;

public class SortArrayList13_3 {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(4.5);
        numbers.add(6);
        numbers.add(7.8);
        numbers.add(1);
        numbers.add(0.6);
        numbers.add(2.5);

        sort(numbers);
        ispisListe(numbers);
    }

    public static void ispisListe(ArrayList<Number> list) {
        System.out.print("Sortirana lista : ");
        for (Number numb : list) {
            System.out.print(numb + ", ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    index = j;
                }
            }
            if (index != i) {
                list.set(index, list.get(i));
                list.set(i,min);
            }
        }
    }
}
