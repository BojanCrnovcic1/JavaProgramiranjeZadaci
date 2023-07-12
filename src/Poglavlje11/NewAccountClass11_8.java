package Poglavlje11;

import Klase.Account1;

public class NewAccountClass11_8 {
    public static void main(String[] args) {

        Account1 account = new Account1("George",1122,1000);

        account.setGodisnjaKamatnaStopa(1.5);

        account.depozit(30);
        account.depozit(40);
        account.depozit(50);

        account.povlacenje(5);
        account.povlacenje(4);
        account.povlacenje(2);

        System.out.println(account.toString());
    }
}
