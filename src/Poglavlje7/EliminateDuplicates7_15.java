package Poglavlje7;

import java.util.Scanner;

public class EliminateDuplicates7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int []niz = new int[10];

        System.out.println("Unesite 10 brojeva u niz: ");
        for (int i = 0; i < niz.length; i++){
            niz[i] = input.nextInt();
        }

        ispisListe(niz);
    }

    public static void ispisListe(int []lista) {
        int []drugaLista = eliminateDuplicates(lista);
        System.out.print("Lista bez duplikata: ");
        for (int e : drugaLista) {
            if (e > 0) {
                System.out.print(e+" ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int [] novaLista = new int[list.length];
        int index = 0;

        for (int e : list) {
            if (duplikati(e,novaLista) == -1) {
                novaLista[index] = e;
                index++;
            }
        }
        return novaLista;
    }

    public static int duplikati(int broj, int []niz) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == broj) {
                return i;
            }
        }
        return -1;
    }
}
