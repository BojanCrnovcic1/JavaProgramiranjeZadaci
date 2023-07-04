package Poglavlje9;

import Klase.Account;

public class TheAccountClass9_7 {
    public static void main(String[] args) {

        Account account = new Account(1122,20000);

        account.setGodisnjaKamatnaStopa(4.5);
        account.povlacenje(2500);
        account.depozit(3000);
        account.getDateCreated();

        System.out.println("Balance : "+account.getBalance()+ "" +
                "\nMjesecna Kamatna Stopa : " + account.getMjesecnaKamatnaStopa()+ "" +
                "\nDatum kreiranja Racuna : " + account.getDateCreated());
    }
}
