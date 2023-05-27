package Poglavlje4;

public class RandomCharacter4_16 {
    public static void main(String[] args) {

        int karakter = 65+ (int)(Math.random() * (91 - 65));

        System.out.println("Random karakter velikih slova je: "+(char)karakter);

    }
}
