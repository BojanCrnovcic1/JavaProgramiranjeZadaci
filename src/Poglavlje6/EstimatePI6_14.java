package Poglavlje6;

public class EstimatePI6_14 {
    public static void main(String[] args) {

        System.out.println("i\t\t\t\tm(i)");
        for (int i = 1; i <= 901; i+=100) {
            System.out.println(i+"\t\t\t\t"+estimatePi(i));
        }
    }

    public static double estimatePi(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }
}
