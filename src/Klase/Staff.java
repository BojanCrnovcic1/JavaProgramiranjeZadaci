package Klase;

public class Staff extends Employee {
    private String titula;

    public Staff() {

    }

    public Staff(String ime, String adresa, String brojTelefona, String emailAdresa,
                 int office, double plata, String titula) {
        super(ime, adresa, brojTelefona, emailAdresa, office, plata);
        this.titula = titula;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTitula : " + titula;

    }
}
