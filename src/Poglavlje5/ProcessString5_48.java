package Poglavlje5;

import java.util.Scanner;

public class ProcessString5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String unos = input.nextLine();

        for (int i = 0; i < unos.length(); i+=2) {
            System.out.print(unos.charAt(i));
        }
    }
}
