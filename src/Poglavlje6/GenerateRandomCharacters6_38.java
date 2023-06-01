package Poglavlje6;

public class GenerateRandomCharacters6_38 {
    public static void main(String[] args) {

        System.out.println("100 random karaktera. 10 po liniji. ");
        ispisRandomKaraktera();
    }
    public static void ispisRandomKaraktera() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(randomKarakter(i)+" ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

   public static char randomKarakter(int n) {
      int random = 65 + (int) (Math.random() * (91 - 60));
      return (char)random;

  }
}
