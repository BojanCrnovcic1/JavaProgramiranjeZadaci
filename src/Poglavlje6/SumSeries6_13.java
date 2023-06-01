package Poglavlje6;

public class SumSeries6_13 {
    public static void main(String[] args) {

        System.out.println("i\t\t\t\tm(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i+"\t\t\t\t"+m(i));
        }

    }

    public static double m(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++){
            sum += i / (i + 1);
        }
        return sum;
    }
}
