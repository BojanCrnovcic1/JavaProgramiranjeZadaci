package Poglavlje5;

public class FinancialApplicationComputeFutureaTuition5_7 {
    public static void main(String[] args) {

        System.out.println("Izracunavanje buduce skolarine: ");

        int skolarina = 10000;
        double rastRate = 0.05;
        int finalnaCijena = 0;
        int cijena10godina = 0;

        for (int i = 1; i <= 14; i++) {
            skolarina += (skolarina * rastRate);

            if (i == 10) {
                cijena10godina += skolarina;
            }
            if (i > 10) {
                finalnaCijena += skolarina;
            }
        }

        System.out.println("Cijena skolarine nakon 10 godina je : "+cijena10godina+" $."+"" +
                "\nA jos dodatne cetiri godine je: "+finalnaCijena+" $.");


    }
}
