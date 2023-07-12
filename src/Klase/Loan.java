package Klase;

import java.util.Date;

public class Loan {
    private double godisnjaKamatnaStopa;
    private int godina;
    private double iznosPozajmice;
    private Date vrijemePozajmice;

    public Loan() {
        godisnjaKamatnaStopa = 2.5;
        godina = 1;
        iznosPozajmice = 1000;
        vrijemePozajmice = new Date();
    }

    public Loan(double godisnjaKamatnaStopa, int godina, double iznosPozajmice) {
        this.godisnjaKamatnaStopa = godisnjaKamatnaStopa;
        this.godina = godina;
        this.iznosPozajmice = iznosPozajmice;
        vrijemePozajmice = new Date();
    }

    public void setGodisnjaKamatnaStopa(double godisnjaKamatnaStopa) {
        this.godisnjaKamatnaStopa = godisnjaKamatnaStopa;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setIznosPozajmice(double iznosPozajmice) {
        this.iznosPozajmice = iznosPozajmice;
    }

    public double getGodisnjaKamatnaStopa() {
        return godisnjaKamatnaStopa;
    }
    public double getMjesecnoPlacanje() {
        double mjesecnaKamatnaStopa = godisnjaKamatnaStopa / 1200;
        double mjesecnoPlacanje = iznosPozajmice * mjesecnaKamatnaStopa /
                (1 - (1 / Math.pow(1 + mjesecnaKamatnaStopa, godina * 12)));
        return mjesecnoPlacanje;
    }
    public double getTotalnoPlacanje() {
        double totalnoPlacanje = getMjesecnoPlacanje() * godina * 12;
        return totalnoPlacanje;
    }

    public int getGodina() {
        return godina;
    }

    public double getIznosPozajmice() {
        return iznosPozajmice;
    }

    public String getVrijemePozajmice() {
        return vrijemePozajmice.toString();
    }

    @Override
    public String toString() {
        return "\nGodisnja kamatna stopa : " + godisnjaKamatnaStopa +
                "\nGodina : " + godina +
                "\nIznos pozajmice : " + iznosPozajmice +
                "\nVrijeme pozajmice : " + getVrijemePozajmice();
    }
}
