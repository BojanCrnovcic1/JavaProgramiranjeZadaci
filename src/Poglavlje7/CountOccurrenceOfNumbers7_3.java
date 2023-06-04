package Poglavlje7;

import java.util.Scanner;

public class CountOccurrenceOfNumbers7_3 {
    public static void main(String[] args) {
        int niz[] = new int[100];

        System.out.println("Unesite integere od 1 do 100:");
        counts(niz);

        for (int i = 0; i < niz.length; i++) {
            if( niz[i] > 0 )System.out.println(niz[i + 1] + " se ponavlja " + niz[i] + " puta");
        }
    }
    public static void counts(int niz[]){
        Scanner input = new Scanner(System.in);
        int unos;
        do {
            unos = input.nextInt();
            if (unos>= 1 && unos <= 100){
                niz[unos - 1]++;
            }
        }while (unos != 0);
    }
}
