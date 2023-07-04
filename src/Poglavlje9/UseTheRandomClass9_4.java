package Poglavlje9;

import java.util.Random;

public class UseTheRandomClass9_4 {
    public static void main(String[] args) {

        Random random = new Random(1000);

        for (int i = 0; i <= 50; i++) {
            if (i % 10 == 0) {
                System.out.print(random.nextInt(100) + "\n");
            }
            else
                System.out.print(random.nextInt(100) + " ");
        }
    }
}
