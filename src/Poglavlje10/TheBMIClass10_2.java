package Poglavlje10;

import Klase.BMI;

public class TheBMIClass10_2 {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Petar",34,87,176.6);
        BMI bmi2 = new BMI("Ana",23,54,6,12);

        System.out.println("BMI za prvu osobu : \nIme : " + bmi1.getIme() +"" +
                "\nGodine : " + bmi1.getGodine() + "" +
                "\nBMI : " + bmi1.getBMI() + "" +
                "\nStatus : " + bmi1.getStatus()+ "\n");
        System.out.println("BMI za drugu osobu : \nIme : " + bmi2.getIme() +"" +
                "\nGodine : " + bmi2.getGodine() + "" +
                "\nBMI : " + bmi2.getBMI() + "" +
                "\nStatus : " + bmi2.getStatus());
    }
}
