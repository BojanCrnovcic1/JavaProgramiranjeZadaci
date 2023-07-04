package Poglavlje9;

import Klase.QuadraticEquation;

import java.util.Scanner;

public class AlgebraQuadraticEquations9_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation kvadratnaJednacina = new QuadraticEquation(a,b,c);

        System.out.print("Jednacina ");
        if (kvadratnaJednacina.getDiscriminant() < 0) {
            System.out.println("nema pravi korijen. ");
        }
        else if (kvadratnaJednacina.getDiscriminant() > 0) {
            System.out.println("jednacina ima dva korijena : "+kvadratnaJednacina.getRoot1()+" i "+
                    kvadratnaJednacina.getRoot2());
        }
        else
            System.out.println("ima jedan korijen : "+((kvadratnaJednacina.getRoot1() > 0) ?
                    kvadratnaJednacina.getRoot1() : kvadratnaJednacina.getRoot2()));

    }
}
