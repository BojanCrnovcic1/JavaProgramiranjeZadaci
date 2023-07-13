package Poglavlje12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException12_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean nastavi = true;

        do {
            System.out.println("Unesite 2 integera i dobite njihov zbir : ");
            try {
                int broj1 = input.nextInt();
                int broj2 = input.nextInt();

                System.out.println("Zbir dva integera je : "+(broj1 + broj2));

            }catch (InputMismatchException ex) {
            System.out.println("Pogresan unos. ");

            nastavi = false;
            }
        }while (nastavi);

        input.close();
    }
}
