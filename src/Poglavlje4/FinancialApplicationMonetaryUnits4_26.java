package Poglavlje4;

import java.util.Scanner;

public class FinancialApplicationMonetaryUnits4_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u dolarima: ");
        String iznos = input.next();

        String iznosDolar = iznos.substring(0,iznos.indexOf('.'));

        int cent = Integer.parseInt(iznos.substring(iznos.indexOf('.')+1));

        int cetvrtina = cent / 25;
        cent %= 25;

        int desetina = cent / 10;
        cent %= 10;

        int petina = cent / 5;
        cent %= 5;

        System.out.println("Vasi iznos "+iznos+" $ sadrzi: "+"" +
                "\nDolara: "+iznosDolar+"" +
                "\nCetvrtina: "+cetvrtina+"" +
                "\nDesetina: "+desetina+"" +
                "\nPetina: "+petina);


    }
}
