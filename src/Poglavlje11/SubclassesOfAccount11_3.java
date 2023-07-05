package Poglavlje11;

import Klase.Account;
import Klase.CheckingAccount;
import Klase.SavingsAccount;

public class SubclassesOfAccount11_3 {
    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new Account(1122,3000);
        accounts[1] = new CheckingAccount(1212,3000,-40);
        accounts[2] = new SavingsAccount(3322,3000);

        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
