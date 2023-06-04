package Poglavlje7;

import java.util.Scanner;

public class CultureChineseZodiac7_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String []zodijak = {"majmunq", "pijetla", "psa",
                "svinje", "pacova", "vola", "tigra", "zeca", "zmaja", "zmije", "konja", "koze"};

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        System.out.println(godina+" po kineskom zodijaku je godina "+zodijak[godina % 12]);
    }
}
