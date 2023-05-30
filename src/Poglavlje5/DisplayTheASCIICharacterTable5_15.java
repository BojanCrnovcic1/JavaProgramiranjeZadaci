package Poglavlje5;

public class DisplayTheASCIICharacterTable5_15 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Ispis ASCII tabele od ! do ~ ");

        for (int i = 33; i <= 126; i++){
            System.out.print((char)i+" ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }


    }
}
