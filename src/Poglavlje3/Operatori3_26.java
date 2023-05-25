package Poglavlje3;

import java.util.Scanner;

public class Operatori3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();

        System.out.println("Da li je "+broj+" dijeljiv sa 5 i 6? "+(broj % 5 == 0 && broj % 6 == 0));
        System.out.println("Da li je "+broj+" dijeljiv sa 5 ili 6? "+(broj % 5 == 0 || broj % 6 == 0));
        System.out.println("Da li je "+broj+" dijeljiv sa 5 ili 6, ali ne oba? "+(broj % 5 == 0 ^ broj % 6 == 0));
    }
}
