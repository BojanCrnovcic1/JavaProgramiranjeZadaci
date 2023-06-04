package Poglavlje7;

public class RandomNumberChooser7_13 {


    public static int getRandom(int... numbers) {
        int broj;
        boolean isExcluded = true;

        do {
            isExcluded = false;
            broj = (int) (Math.random() * 54) +1;
            for (int e : numbers) {
                if (broj == e) {
                    isExcluded = true;
                }
            }
        }while (isExcluded);
        return broj;
    }
}
