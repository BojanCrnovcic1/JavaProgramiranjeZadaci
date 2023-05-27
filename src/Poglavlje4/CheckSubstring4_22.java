package Poglavlje4;

import java.util.Scanner;

public class CheckSubstring4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi string: ");
        String string1 = input.nextLine();
        System.out.println("Unesite drugi string: ");
        String string2 = input.nextLine();

        System.out.println(string2+(string1.contains(string2)? " je ":" nije ")+"podniz od "+string1);
    }
}
