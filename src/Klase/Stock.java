package Klase;

public class Stock {
    public String simbol;
    public String ime;
    public double bivsaCijena;
    public double sadasnjaCijena;

    public Stock() {

    }

    public Stock(String simbol, String ime) {
        this.simbol = simbol;
        this.ime = ime;
    }

    public double getPromjenjeniProcenti() {
        return ((sadasnjaCijena - bivsaCijena) / bivsaCijena) * 100;
    }
}
