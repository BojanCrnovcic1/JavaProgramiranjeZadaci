package Poglavlje5;

public class FindTheSmallestN2_5_12 {
    public static void main(String[] args) {

        int n = 0;

        while ((Math.pow(n,2)) < 12000) {
            n++;
        }
        System.out.println("Najmanje n na kvadrat je : "+n);
    }
}
