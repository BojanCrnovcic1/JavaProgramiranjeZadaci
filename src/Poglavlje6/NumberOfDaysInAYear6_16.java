package Poglavlje6;

public class NumberOfDaysInAYear6_16 {
    public static void main(String[] args) {

        System.out.println("Ispis broja dana u godini od 2000 do 2020: ");
        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i+". godina ima "+numberOfDaysInAYear(i)+" dana.");
        }
    }


    public static int numberOfDaysInAYear(int year) {
        int danUGodini = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            danUGodini += 366;
        }else
            danUGodini += 365;
        return danUGodini;
    }
}
