package Poglavlje5;

public class MathCombinations5_43 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Kombinacije svih brojeva izmedju 1 i 7 :");

        for (int i = 1; i < 7; i++) {
            for (int k = i + 1; k <= 7; k++) {
                count++;

                System.out.println(i+"\t"+k);
            }
        }
        System.out.println("Broj svih kombinacija je : "+count);
    }
}
