package Poglavlje5;

public class ConversionFromMilesToKilometers5_6 {
    public static void main(String[] args) {

        final double RAZLIKA = 1.609;

        System.out.println("Milja    Kilometar     |   Kilometar       Milja");
        for (int i = 1, y = 20; i <= 10 && y <= 65; i++, y+=5) {
            System.out.println(i+"        "+(i*RAZLIKA)+"         |   "+y+"        "+(y/RAZLIKA));
        }
    }
}
