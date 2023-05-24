package Poglavlje1;

public class AverageSpeedInMiles1_10 {
    public static void main(String[] args) {

        double kilometri = 14;
        double brzina = 45.30;

        double kilometarNaSat = brzina / kilometri;

        double miljaNaSat = kilometarNaSat / 1.6;

        System.out.println("Prosijecna brzina milje na cas je : "+miljaNaSat);
    }
}
