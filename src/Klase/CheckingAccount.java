package Klase;

public class CheckingAccount extends Account {
    private double dozvoljeniLimit;

    public CheckingAccount() {
        dozvoljeniLimit = -20;
    }

    public CheckingAccount(int id, double balance, double dozvoljeniLimit) {
        super(id, balance);
        this.dozvoljeniLimit = dozvoljeniLimit;
    }

    public double getDozvoljeniLimit() {
        return dozvoljeniLimit;
    }

    public void setDozvoljeniLimit(double dozvoljeniLimit) {
        this.dozvoljeniLimit = dozvoljeniLimit;
    }

    public void povlacenje(double iznos) {
        if (getBalance() - iznos > dozvoljeniLimit) {
            setBalance(getBalance() - iznos);
        }
        else
            System.out.println("Transakcija je odbijena. Prekoracili ste dozvoljeni limit.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDozvoljeni limit : " + dozvoljeniLimit;
    }
}
