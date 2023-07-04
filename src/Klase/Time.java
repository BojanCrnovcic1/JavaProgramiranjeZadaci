package Klase;

public class Time {
    private long sat;
    private long minut;
    private long sekunda;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long prosloVrijeme) {
        setTime(prosloVrijeme);
    }

    public Time(long sat, long minut, long sekunda) {
        this.sat = sat;
        this.minut = minut;
        this.sekunda = sekunda;
    }

    public long getSat() {
        return sat;
    }

    public long getMinut() {
        return minut;
    }

    public long getSekunda() {
        return sekunda;
    }

    public void setTime(long prosloVrijeme) {
        long milisekundi = System.currentTimeMillis();
        long totalSekund = milisekundi / 1000;
        sekunda = totalSekund % 60;
        long totalMinut = totalSekund / 60;
        minut = totalMinut % 60;
        long totalSat = totalMinut / 60;
        sat = totalSat % 24;

        if (prosloVrijeme > 0) {
            totalSekund = prosloVrijeme / 1000;
            sekunda = totalSekund % 60;
            totalMinut = totalSekund / 60;
            minut = totalMinut % 60;
            totalSat = totalMinut / 60;
            sat = totalSat % 24;
        }
    }
}
