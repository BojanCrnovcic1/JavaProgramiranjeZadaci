package Poglavlje5;

public class DisplayPrimeNumbersBetween2And1000_5_20 {
    public static void main(String[] args) {

        int count = 0;
        int number = 2;

        System.out.println("Ispis prime brojeva od 2 do 1000 :");

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
            for ( int k = 2; k <= 1000; k++) {
                if (isPrime) {
                    System.out.print(" "+k);
                    count++;
                }
                if (count == 10) {
                    System.out.println();
                    count = 0;

            }

        }
    }
}
