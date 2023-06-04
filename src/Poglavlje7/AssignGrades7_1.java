package Poglavlje7;

import java.util.Scanner;

public class AssignGrades7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj studenata: ");
        int brojStudenata = input.nextInt();

        int [] niz = new int[brojStudenata];

        int brojBodova = 0;

        System.out.println("Unesite "+brojStudenata+" rezultata: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = brojBodova;
            brojBodova = input.nextInt();

            System.out.print("Student "+(i+1)+" osvjio je "+brojBodova+" bodova i dobio "+"");
            ocjene(brojBodova);

        }
    }

    private static double ocjene(double bodovi) {
        if (bodovi >= 90) {
            System.out.print("ocjenu A.");
        }
        else if (bodovi < 89 && bodovi >= 80) {
            System.out.print("ocjenu B.");
        }
        else if (bodovi < 79 && bodovi >= 70) {
            System.out.print("ocjenu C.");
        }
        else if (bodovi < 69 && bodovi >= 60) {
            System.out.print("ocjenu D.");
        }
        else if (bodovi <= 59) {
            System.out.print("ocjenu F.");
        }
        return bodovi;
    }
}

