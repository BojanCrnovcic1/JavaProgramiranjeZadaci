package Poglavlje2;

import java.util.Scanner;

public class CostOfDriving2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite distancu voznje: ");
        double distanca = input.nextDouble();
        System.out.println("Unesite potrosnju goriva po litri: ");
        double potrosnjaGoriva = input.nextDouble();
        System.out.println("Unesite cijenu goriva: ");
        double cijenaGoriva = input.nextDouble();

        double cijenaVoznje = (distanca / potrosnjaGoriva) * cijenaGoriva;

        System.out.println("Cijena voznje je : $"+cijenaVoznje);
    }
}
