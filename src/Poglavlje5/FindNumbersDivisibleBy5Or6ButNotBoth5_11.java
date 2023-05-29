package Poglavlje5;

public class FindNumbersDivisibleBy5Or6ButNotBoth5_11 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Ispisi brojeve dijeljive sa 5 ili 6 ali ne sa oba (100 - 200) : ");
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
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
