package Klase;

public class Faculty extends Employee {
    private String radnoVrijeme;
    private String rank;

    public Faculty(){

    }

    public Faculty(String ime, String adresa, String brojTelefona, String emailAdresa,
                   int office, double plata, String radnoVrijeme, String rank) {
        super(ime, adresa, brojTelefona, emailAdresa, office, plata);
        this.radnoVrijeme = radnoVrijeme;
        this.rank = rank;
    }

    public String getRadnoVrijeme() {
        return radnoVrijeme;
    }

    public void setRadnoVrijeme(String radnoVrijeme) {
        this.radnoVrijeme = radnoVrijeme;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRadno Vrijeme : " + radnoVrijeme +
                "\nRank : " + rank;
    }
}
