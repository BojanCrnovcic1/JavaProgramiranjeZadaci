package Poglavlje9;

import Klase.Rectangle;

public class TheRectangleClass9_1 {
    public static void main(String[] args) {

        Rectangle pravougaonik1 = new Rectangle(4,40);
        Rectangle pravougaonik2 = new Rectangle(3.5,35.9);

        System.out.println("Pravouganik jedan : ");
        System.out.println("\nObim : "+pravougaonik1.getPerimeter()+"" +
                "\nPovrsina : "+pravougaonik1.getArea()+"\n");
        System.out.println("Pravouganik dva : ");
        System.out.println("\nObim : "+pravougaonik2.getPerimeter()+"" +
                "\nPovrsina : "+pravougaonik2.getArea());

    }
}
