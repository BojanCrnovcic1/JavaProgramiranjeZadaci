package Poglavlje10;

import Klase.MyInteger;

public class TheMyIntegerClass10_3 {
    public static void main(String[] args) {

        MyInteger broj = new MyInteger(12);

        System.out.println("Broj : "+broj.getVrijednost()+"" +
                "\nJe paran ? "+broj.isEven()+"" +
                "\nJe neparan ? "+broj.isOdd()+"" +
                "\nJe prost ? "+ broj.isPrime());
        System.out.println("Da li je broj jednak broju 12 ? "+broj.equals(6));
        System.out.println("Da li je broj jednak broju 7 ? "+broj.equals(broj));
        System.out.println("Njegova char vrijednost : "+MyInteger.parseInt(new char[]{1,4,5}));
        System.out.println("String vrijednost : "+MyInteger.parseInt("234"));
    }
}
