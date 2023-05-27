package Poglavlje4;

import java.util.Scanner;

public class FinancialApplicationPayroll4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ime zaposlenog: ");
        String ime = input.nextLine();
        System.out.println("Unesite broj radnih sati u sedmici: ");
        int radniSati = input.nextInt();
        System.out.println("Unesite satnicu: ");
        double satnica = input.nextDouble();
        System.out.println("Unesite federalni porez: ");
        double federalniPorezOdbici = input.nextDouble();
        System.out.println("Unesite drzavni porez: ");
        double drzavniPorezOdbici = input.nextDouble();

        double bruto = radniSati * satnica;
        double federalniPorez = bruto * federalniPorezOdbici;
        double drzavniPorez = bruto * drzavniPorezOdbici;
        double totalniOdbici = federalniPorez + drzavniPorez;
        double neto = bruto - totalniOdbici;

        System.out.println("Ime zaposlenog: "+ime+"" +
                "\nBroj radnih sati u sedmici: "+radniSati+"" +
                "\nSatnica: $"+satnica+"" +
                "\nBruto plata: $"+bruto +
                "\nOdbici:"+"" +
                "\nStopa federalnog poreza (20.0%): $"+federalniPorez+"" +
                "\nStopa drzavnog poreza (9.0%): $"+drzavniPorez+"" +
                "\nTotalni odbici: $"+totalniOdbici+"" +
                "\nNeto plata: $"+neto);



    }
}
