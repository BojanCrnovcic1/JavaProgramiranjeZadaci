package Klase;

import java.util.Date;

public class Transaction {
    private Date date;
    private char tip;
    private double iznos;
    private double balance;
    private String opis;

    public Transaction(char tip, double iznos, double balance, String opis) {
        date = new Date();
        this.tip = tip;
        this.iznos = iznos;
        this.balance = balance;
        this.opis = opis;
    }

    public String getDate() {
        return date.toString();
    }

    public char getTip() {
        return tip;
    }

    public double getIznos() {
        return iznos;
    }

    public double getBalance() {
        return balance;
    }

    public String getOpis() {
        return opis;
    }

    public void setTip(char tip) {
        this.tip = tip;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "\nVrijeme : " + date +
                "\nTip : " + tip +
                "\nIznos : " + iznos +
                "\nBalance : " + balance +
                "\nBalance : " + opis;
    }
}
