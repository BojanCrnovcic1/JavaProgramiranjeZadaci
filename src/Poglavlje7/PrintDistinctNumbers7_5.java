package Poglavlje7;

import java.util.Scanner;

public class PrintDistinctNumbers7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] niz = new int[10];
        int count = 0;
        int broj;
        System.out.println("Unesite 10 brojeva: ");
        for (int i = 0; i < niz.length; i++) {
            broj = input.nextInt();

            if (razlicitiBrojevi(niz, broj)) {
                niz[count] = broj;
                count++;
            }
        }

        System.out.println("Broj razlitih brojeva: "+count);
        System.out.print("Svi razliciti brojevi: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
            System.out.print(niz[i]+" ");
            }
        }
        }


    public static boolean razlicitiBrojevi(int[] niz, int broj) {
        for (int i = 0; i < niz.length; i++) {
            if (broj == niz[i]) {
                return false;
            }
        }
        return true;
    }
}
