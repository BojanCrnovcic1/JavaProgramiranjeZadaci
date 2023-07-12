package Klase;

import java.util.ArrayList;

public class Course {
    private String imeKursa;
    private ArrayList<String> studenti;

    public Course() {

    }

    public Course(String imeKursa) {
        this.imeKursa = imeKursa;
        studenti = new ArrayList<>();
    }

    public String getImeKursa() {
        return imeKursa;
    }

    public void addStudent(String student) {
        studenti.add(student);
    }

    public void dropStudent(String student) {
        studenti.remove(student);
    }

    public String[] getStudent() {
        String[] s = new String[studenti.size()];
        return studenti.toArray(s);
    }

    public int getBrojStudenata() {
        return studenti.size();
    }
}
