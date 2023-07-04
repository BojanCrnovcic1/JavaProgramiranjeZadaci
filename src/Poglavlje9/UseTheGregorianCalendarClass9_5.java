package Poglavlje9;

import java.util.GregorianCalendar;

public class UseTheGregorianCalendarClass9_5 {
    public static void main(String[] args) {

        GregorianCalendar kalendar = new GregorianCalendar();

        System.out.println("Vrati tacno vrijeme : godina / mjesec / dan ");
        System.out.println(kalendar.get(kalendar.YEAR)+" / "+kalendar.get(kalendar.MONTH)+" / " +
                kalendar.get(kalendar.DAY_OF_MONTH));

        kalendar.setTimeInMillis(1234567898765l);
        System.out.println("Vrati tacno vrijeme od 1970 : godina / mjesec / dan ");
        System.out.println(kalendar.get(kalendar.YEAR)+ " / "+kalendar.get(kalendar.MONTH)+ " / " +
                kalendar.get(kalendar.DAY_OF_MONTH));
    }
}
