package Klase;

public class Student extends Person {
    static final int FRESHMAN = 1;
    static final int SOPHOMORE = 2;
    static final int  JUNIOR = 3;
    static final int SENIOR = 4;
    private int status;

    public Student() {

    }

    public Student(String ime, String adresa, String brojTelefona, String emailAdresa, int status) {
        super(ime, adresa, brojTelefona, emailAdresa);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
           case 1 : return "Freshman";
           case 2 : return "Sophomore";
           case 3 : return "Junior";
           case 4 : return "Senior";
            default: return "Nepoznato";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStatus : " + status;
    }
}
