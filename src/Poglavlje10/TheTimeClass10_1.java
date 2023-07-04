package Poglavlje10;

import Klase.Time;

public class TheTimeClass10_1 {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println("Vrijeme 1 : " + time1.getSat()+":"+time1.getMinut()+":"+time1.getSekunda());
        System.out.println("Vrijeme 2 : " + time2.getSat()+":"+time2.getMinut()+":"+time2.getSekunda());
    }
}
