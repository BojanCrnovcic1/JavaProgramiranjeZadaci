package Poglavlje12;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] niz = getArray();

        try {
            System.out.println("Unesite index : ");
            System.out.println("Vrijednost na izabranom indexu je : "+niz[input.nextInt()]);

        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out Of Bounds.");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
}
