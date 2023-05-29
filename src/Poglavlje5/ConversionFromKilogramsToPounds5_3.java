package Poglavlje5;

public class ConversionFromKilogramsToPounds5_3 {
    public static void main(String[] args) {

        final double funta = 2.2;

        System.out.println("Kilogram        Funta");
        for (int i = 1; i <= 199; i+=2) {
            System.out.println(i+"               "+(i*funta));
        }
    }
}
