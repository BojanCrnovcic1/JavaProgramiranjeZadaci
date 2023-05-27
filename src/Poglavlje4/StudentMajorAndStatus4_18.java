package Poglavlje4;

import java.util.Scanner;

public class StudentMajorAndStatus4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite dva karaktera: ");
        String unos = input.next();
        char major = unos.charAt(0), status = unos.charAt(1);

        switch (major) {
            case 'M' : {
                System.out.print("Mathematics");
            }break;
            case 'C' : {
                System.out.print("Computer Science");
            }break;
            case 'I' : {
                System.out.print("Information Technology");
            }break;
            default:
                System.out.print("Pogresan unos. ");
        }

        switch (status){
            case '1' : {
                System.out.print(" Freshman");
            }break;
            case '2' : {
                System.out.print(" Sophomore");
            }break;
            case '3' : {
                System.out.print(" Junior");
            }break;
            case '4' : {
                System.out.print(" Senior");
            }break;
            default:
                System.out.println("Pogresan unos. ");
        }

    }
}
