package Poglavlje13;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList13_2 {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(1.2);
        numbers.add(2);
        numbers.add(2.4);
        numbers.add(3.1);
        numbers.add(6);
        numbers.add(8.7);

        shuffle(numbers);
        ispisListe(numbers);
    }

    public static void ispisListe(ArrayList<Number> list) {
        System.out.print("Izmijesana lista : ");
        for (Number numb : list) {
            System.out.print(numb + ", ");
        }
    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}
