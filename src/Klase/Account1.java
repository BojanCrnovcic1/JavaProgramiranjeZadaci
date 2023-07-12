package Klase;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String imeKorisnika;
    private int id;
    private double balance;
    private double godisnjaKamatnaStopa;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account1() {
        imeKorisnika = "";
        id = 0;
        balance = 0;
        godisnjaKamatnaStopa = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account1(String imeKorisnika, int id, double balance) {
        this.imeKorisnika = imeKorisnika;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getImeKorisnika() {
        return imeKorisnika;
    }

    public void setImeKorisnika(String imeKorisnika) {
        this.imeKorisnika = imeKorisnika;
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

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void povlacenje(double iznos) {
        balance -= iznos;
        transactions.add(new Transaction('P',iznos,balance,"Povlacenje sredstava sa racuna."));
    }

    public void depozit(double iznos) {
        balance += iznos;
        transactions.add(new Transaction('D',iznos,balance,"Depozitovanje sredstava na racun."));
    }

    @Override
    public String toString() {
        return  "Ime korisnika : " + imeKorisnika +
                "\nID : " + id +
                "\nBalance : " + balance +
                "\nGodisnja kamatna stopa : " + godisnjaKamatnaStopa +
                "\nVrijeme kreiranja racuna : " + getDateCreated() +
                "\nTransakcija : " + transactions.toString();
    }
}
