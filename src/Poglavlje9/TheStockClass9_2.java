package Poglavlje9;

import Klase.Stock;

public class TheStockClass9_2 {
    public static void main(String[] args) {

        Stock akcija = new Stock("ORCL","Oracle Corporation");

        akcija.bivsaCijena = 34.5;
        akcija.sadasnjaCijena = 34.35;

        System.out.println("Simbol : " + akcija.simbol +"" +
                "\nIme : " + akcija.ime + "" +
                "\nPromenjeni procenat : " + akcija.getPromjenjeniProcenti() + "%");
    }
}
