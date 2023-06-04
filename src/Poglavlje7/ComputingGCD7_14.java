package Poglavlje7;

import java.util.Scanner;

public class ComputingGCD7_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int niz[] = new int[5];

        System.out.println("Unesite 5 brojeva: ");
        for (int i = 0; i < niz.length; i++){
            niz[i] = input.nextInt();


        }

        System.out.println("gcd broja je "+gcd(niz));

    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean jeDijeljiv;

        for (int i = 2; i < min(numbers); i++){
            jeDijeljiv = true;
            for (int e : numbers){
                if (e % i != 0){
                    jeDijeljiv = false;
                }
                if (jeDijeljiv)
                    gcd = i;
            }
        }
        return gcd;
    }

    public static int min(int array[]){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
