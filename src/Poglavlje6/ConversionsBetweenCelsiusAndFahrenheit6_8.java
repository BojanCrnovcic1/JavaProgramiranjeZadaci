package Poglavlje6;

public class ConversionsBetweenCelsiusAndFahrenheit6_8 {
    public static void main(String[] args) {

        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        for (double i = 40.0, y = 120.0; i >= 31.0 && y >= 30; i--, y -= 10) {
            System.out.println(i+"\t\t\t"+celsiusToFahrenheit(i)+"\t\t\t|\t\t\t"+y+"\t\t\t"+fahrenheitToCelsius(y));
        }

    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
