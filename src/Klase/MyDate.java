package Klase;

import java.util.GregorianCalendar;

public class MyDate {
    private int godina;
    private int mjesec;
    private int dan;

    public MyDate() {
        GregorianCalendar kalendar = new GregorianCalendar();
        godina = kalendar.get(GregorianCalendar.YEAR);
        mjesec = kalendar.get(GregorianCalendar.MONTH);
        dan = kalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime) {
            setDate(elapsedTime);
        }


        public int getGodina() {
            return godina;
        }

        public String getMjesec() {
            String m = String.valueOf(mjesec +1);
            return (mjesec < 10 ? "0" + m : m);
        }

        public String getDan() {
            String d = String.valueOf(dan);
            return (dan < 10 ? "0" + d : d);
        }
        private void setDate(long elapsedTime) {
            GregorianCalendar kalendar = new GregorianCalendar();
            kalendar.setTimeInMillis(elapsedTime);
            godina = kalendar.get(GregorianCalendar.YEAR);
            mjesec = kalendar.get(GregorianCalendar.MONTH);
            dan = kalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
