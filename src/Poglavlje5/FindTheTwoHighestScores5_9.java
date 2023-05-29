package Poglavlje5;

import java.util.Scanner;

public class FindTheTwoHighestScores5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int najboljaOcjena = 0;
        int drugaNajboljaOcjena = 0;
        String najboljiStudent = "";
        String drugiNajboljiStudent = "";

        System.out.println("Unesite broj studenata: ");
        int brojStudenata = input.nextInt();

        for (int i = 0; i < brojStudenata; i++) {
            System.out.print("Student: "+(i+1)+"" +
                    "\nIme: ");
            String ime = input.next();
            System.out.print("Ocjena:" +
                    "");
            int ocjena = input.nextInt();

            if (i == 0) {
                najboljaOcjena = ocjena;
                najboljiStudent = ime;
            }
            if (i == 1 && ocjena > najboljaOcjena) {
                drugaNajboljaOcjena = najboljaOcjena;
                najboljaOcjena = ocjena;
                drugiNajboljiStudent = najboljiStudent;
                najboljiStudent = ime;
            } else if (i == 1) {
                drugaNajboljaOcjena = ocjena;
                drugiNajboljiStudent = ime;
            } else if (i > 1 && ocjena > najboljaOcjena && ocjena > drugaNajboljaOcjena) {
                drugaNajboljaOcjena = najboljaOcjena;
                drugiNajboljiStudent = najboljiStudent;
                najboljaOcjena = ocjena;
                najboljiStudent = ime;
            } else if (i > 1 && ocjena > drugaNajboljaOcjena) {
                drugaNajboljaOcjena = ocjena;
                drugiNajboljiStudent = ime;
            }
        }
        System.out.println("Student sa najboljom ocjenom je: "+najboljiStudent+"" +
                "\nDrugi najbolji student je: "+drugiNajboljiStudent);
    }
}
