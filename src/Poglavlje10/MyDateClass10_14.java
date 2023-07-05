package Poglavlje10;

import Klase.MyDate;

public class MyDateClass10_14 {
    public static void main(String[] args) {

        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);

        System.out.println("Godina / mjesec / dan : \n"+ myDate1.getGodina()+" / "+
                myDate1.getMjesec()+" / "+myDate1.getDan());
        System.out.println("Godina / mjesec / dan od 1970 / 1 / 1 : \n"+ myDate2.getGodina()+" / "+
                myDate2.getMjesec()+" / "+myDate2.getDan());
    }
}
