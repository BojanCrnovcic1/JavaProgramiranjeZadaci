package Poglavlje9;

import Klase.Fan;

public class TheFanClass9_8 {
    public static void main(String[] args) {

        Fan ventilator1 = new Fan();
        Fan ventilator2 = new Fan();

        ventilator1.isOn();
        ventilator1.setBrzina(Fan.FAST);
        ventilator1.setRadius(10);
        ventilator1.setBoja("Zuta");

        ventilator2.isOff();
        ventilator2.setBrzina(Fan.MEDIUM);
        ventilator2.setRadius(5);
        ventilator2.setBoja("Plava");

        System.out.println(ventilator1.toString() + "\n");
        System.out.println(ventilator2.toString());
    }
}
