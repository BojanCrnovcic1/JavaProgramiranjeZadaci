package Poglavlje6;

public class MathPentagonalNumbers6_1 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Ispisite petougane brojeve: ");

        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i)+" ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * ((3 * n) - 1) /2;
    }
}
