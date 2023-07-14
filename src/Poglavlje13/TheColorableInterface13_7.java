package Poglavlje13;

import Klase.GeometricObject;
import Klase.Square;

public class TheColorableInterface13_7 {
    public static void main(String[] args) {

        GeometricObject[] kvadrati = {new Square(1.2), new Square(3), new Square(11),
        new Square(2.56), new Square(42.1)};

        for (int i = 0; i < kvadrati.length; i++) {
            System.out.println("Kvadrat # " + (i + 1));
            System.out.println("Povrsina : " + kvadrati[i].getArea());
            System.out.println("Kako se boji : " + ((Square)kvadrati[i]).kakoSeBoji());
        }
    }
}
