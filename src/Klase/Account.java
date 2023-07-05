package Klase;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double godisnjaKamatnaStopa;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        godisnjaKamatnaStopa = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getGodisnjaKamatnaStopa() {
        return godisnjaKamatnaStopa;
    }

    public void setGodisnjaKamatnaStopa(double godisnjaKamatnaStopa) {
        this.godisnjaKamatnaStopa = godisnjaKamatnaStopa;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMjesecnaKamatnaStopa() {
        return getGodisnjaKamatnaStopa() / 12;
    }

    public double getMjesecnaKamata() {
        return balance * (getMjesecnaKamatnaStopa() / 100);
    }

    public void povlacenje(double iznos) {
        balance -= iznos;
    }

    public void depozit(double iznos) {
        balance += iznos;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                "\nBalance : " + balance +
                "\nGodisnja kamatna stopa : " + godisnjaKamatnaStopa +
                "\nVrijeme kreiranja racuna : " + getDateCreated();
    }
}
