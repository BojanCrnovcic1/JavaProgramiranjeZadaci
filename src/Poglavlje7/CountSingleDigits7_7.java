package Poglavlje7;

public class CountSingleDigits7_7 {
    public static void main(String[] args) {


        int []niz = new int[10];

        for (int i = 0; i < 100; i++) {
            niz[(int) (Math.random() * 10)]++;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println("Broj "+i+" se ponavlja "+niz[i]+" puta.");
        }
    }
}
