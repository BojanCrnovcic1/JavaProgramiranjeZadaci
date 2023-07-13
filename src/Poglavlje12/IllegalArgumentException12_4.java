package Poglavlje12;

import Klase.Loan;

import java.util.Scanner;

public class IllegalArgumentException12_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Unesite godisnju kamatnu stopu : ");
            double godisnjaKamatnaStopa = input.nextDouble();
            System.out.println("Unesite broj godina : ");
            int brojGodina = input.nextInt();
            System.out.println("Unesite iznos pozajmice : ");
            double iznosPozajmice = input.nextDouble();

            Loan pozajmica = new Loan(godisnjaKamatnaStopa,brojGodina,iznosPozajmice);

            System.out.println("Vrijeme kreiranja pozajmice : "+pozajmica.getVrijemePozajmice().toString() +"" +
                    "\nKamata : " + pozajmica.getMjesecnoPlacanje() + "" +
                    "\nUkupni iznos za vratiti : " + pozajmica.getTotalnoPlacanje());

        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        input.close();
    }
}
