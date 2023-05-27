package Poglavlje4;

import java.util.Scanner;

public class ConvertLetterGradeToNumber4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ocjenu u vidu slova: ");
        String slovoString = input.next();
        char slovo = slovoString.charAt(0);

        switch (slovo) {
            case 'A' : {
                System.out.println("Ocjena je 5. ");
            }break;
            case 'B' : {
                System.out.println("Ocjena je 4. ");
            }break;
            case 'C' : {
                System.out.println("Ocjena je 3. ");
            }break;
            case 'D' : {
                System.out.println("Ocjena je 2. ");
            }break;
            case 'F' : {
                System.out.println("Ocjena je 1. ");
            }break;
            default:
                System.out.println("Pogresan unos. ");
        }

    }
}
