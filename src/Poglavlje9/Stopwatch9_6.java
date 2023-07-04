package Poglavlje9;

import Klase.StopWatch;

public class Stopwatch9_6 {
    public static void main(String[] args) {

        int[] niz = getArray();

        StopWatch stoperica = new StopWatch();

        stoperica.start();

        sortArray(niz);

        stoperica.stop();

        System.out.println();

        System.out.println("Potrebno vrijeme za 100000 sortiranje rendom brojeva : "+
                stoperica.getElapsedTime());
    }


    public static int[] getArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[0];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                array[index] = i;
                array[i] = i;
            }
        }
    }
}
