package Poglavlje7;

public class GamePickFourCards7_29 {
    public static void main(String[] args) {

        int [] spil;
        do {
            spil = new int[52];

            izaberiKarte(spil);

        }while (sum(spil) != 24);

        ispis(spil);


    }


    public static void izaberiKarte(int []spil) {
        for (int i = 0; i < 4; i++) {
            spil[(int) (Math.random() * 52)]++;
        }
    }
    public static int sum(int []spil) {
        int suma = 0;
        for (int i = 0; i < spil.length; i++) {
             suma += ((i + 1) % 13) * spil[i];
        }
        return suma;
    }
    public static void ispis(int []spil) {
        String []rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};

        System.out.println("Cetiri karte koje daju sumu od 24: ");
        for (int i = 0; i < spil.length; i++) {
            if (spil[i] > 0) {
                System.out.print(rank[i % 13]+" ");
            }
        }
    }
}
