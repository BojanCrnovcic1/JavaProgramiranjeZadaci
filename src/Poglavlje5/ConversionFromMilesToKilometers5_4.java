package Poglavlje5;

public class ConversionFromMilesToKilometers5_4 {
    public static void main(String[] args) {

        final double kilometar = 1.609;

        System.out.println("Milja          Kilometar");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"              "+(i*kilometar));
        }
    }
}
