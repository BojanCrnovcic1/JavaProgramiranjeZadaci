package Poglavlje9;

import java.util.Date;

public class UseTheDateClass9_3 {
    public static void main(String[] args) {

        Date date = new Date();

        for (long i = 10000; i < 100000000000l; i*=10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
