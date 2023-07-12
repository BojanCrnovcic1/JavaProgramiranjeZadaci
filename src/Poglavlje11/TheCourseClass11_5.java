package Poglavlje11;

import Klase.Course;

public class TheCourseClass11_5 {
    public static void main(String[] args) {
        Course kurs1 = new Course("Date Base");
        Course kurs2 = new Course("Java Programming");

        kurs1.addStudent("Zivko Peric");
        kurs1.addStudent("Pero Peric");
        kurs1.addStudent("Nikola Nikolic");

        kurs2.addStudent("Ana Andric");
        kurs2.addStudent("Pero Ilic");
        kurs2.addStudent("Simo Simic");

        System.out.println("Studenti na kursu 1: " + kurs1.getBrojStudenata());
        String[] studenti = kurs1.getStudent();
        for (int i = 0; i < kurs1.getBrojStudenata(); i++) {
            System.out.println(studenti[i] + " ");
        }

        System.out.println("Studenti na kursu 2 : "+kurs2.getBrojStudenata());
        String[] studenti2 = kurs2.getStudent();
        kurs2.dropStudent("");
        for (int i = 0; i < kurs2.getBrojStudenata(); i++) {
            System.out.println(studenti2[i] + " ");
        }
    }
}
