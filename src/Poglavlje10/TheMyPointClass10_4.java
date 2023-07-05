package Poglavlje10;

import Klase.MyPoint;

public class TheMyPointClass10_4 {
    public static void main(String[] args) {

        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10,30.5);

        System.out.println("Distanca izmedju 2 tacke je "+myPoint1.distance(myPoint2));
    }
}
