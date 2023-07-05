package Klase;

public class MyInteger {
    private int vrijednost;

    public MyInteger(int vrijednost) {
        this.vrijednost = vrijednost;
    }

    public int getVrijednost() {
        return vrijednost;
    }

    public boolean isEven() {
        return isEven(vrijednost);
    }

    public boolean isOdd() {
        return isOdd(vrijednost);
    }

    public boolean isPrime() {
        return isPrime(vrijednost);
    }

    public static boolean isEven(int vrijednost) {
        return vrijednost % 2 == 0;
    }

    public static boolean isOdd(int vrijednost) {
        return vrijednost % 2 != 0;
    }

    public static boolean isPrime(int vrijednost) {
        for (int i = 2; i <= vrijednost / 2; i++) {
            if (vrijednost % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int vrijednost) {
        return this.vrijednost == vrijednost;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.equals(vrijednost);
    }

    public static int parseInt(char[] array) {
        int vrijednost = 0;
        for (int i = 0; i < array.length; i++) {
            vrijednost  += (array[i] - '0') * Math.pow(10, array.length - i - 1);
        }
        return vrijednost;
    }

    public static int parseInt(String vrijednost) {
        return Integer.parseInt(vrijednost);
    }
}
