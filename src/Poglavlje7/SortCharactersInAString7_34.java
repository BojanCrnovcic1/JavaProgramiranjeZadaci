package Poglavlje7;

import java.util.Scanner;

public class SortCharactersInAString7_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String string = input.nextLine();

        System.out.println("Sortiran string: "+sort(string));

    }


    public static String sort(String s){
        char []str = new char[s.length()];

        for (int i = 0; i < str.length; i++) {
            str[i] += s.charAt(i);
        }
        for (int i = 0; i < str.length -1; i++) {
            char min = str[i];
            int minIndex = i;

            for (int j = i + 1; j < str.length; j++) {
                if (min > str[j]) {
                    min = str[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                str[minIndex] = str[i];
                str[i] = min;
            }
        }
        String noviString = "";
        for (int i = 0; i < str.length; i++) {
            noviString += str[i];
        }
        return noviString;
    }
}
