package Poglavlje5;

public class FindNumbersDivisibleBy5And6_5_10 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Ispisi brojeve dijeljive sa 5 i 6 (100 - 1000) : ");
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i+" ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
