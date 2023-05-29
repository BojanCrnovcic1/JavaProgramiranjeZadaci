package Poglavlje5;

public class ConversionFromKilogramsToPoundsAndPoundsToKilograms5_5 {
    public static void main(String[] args) {

        final double RAZLIKA = 2.2;

        System.out.println("Kilogram       Funta    |    Funta       Kilogram");
        for (int i = 1, y = 20; i <= 199 && y <= 515; i+=2, y+=5) {
            System.out.println(i+"              "+(i*RAZLIKA)+"    |    "+y+"       "+(y/RAZLIKA));
        }


    }
}
