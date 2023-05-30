package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationCompoundValue5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ustedu: ");
        double usteda = input.nextDouble();
        System.out.println("Unesite godisnju kamatnu stopu: ");
        double godisnjaKamatnaStopa = input.nextDouble();
        System.out.println("Unesite broj mjeseci: ");
        int mjesec = input.nextInt();

        double kamatnaStopa = godisnjaKamatnaStopa / 1200;

        double mjesecnaUsteda = 0;

        for (int i = 1; i <= mjesec; i++) {
            mjesecnaUsteda = (usteda + mjesecnaUsteda) * (1+ kamatnaStopa);
        }

        System.out.println("Nakon "+mjesec+". mjeseci na racunu je: "+mjesecnaUsteda);


    }
}
