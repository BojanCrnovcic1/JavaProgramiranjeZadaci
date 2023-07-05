package Klase;

public class Person {
    private String ime;
    private String adresa;
    private String brojTelefona;
    private String emailAdresa;

    public Person() {

    }

    public Person(String ime, String adresa, String brojTelefona, String emailAdresa) {
        this.ime = ime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
        this.emailAdresa = emailAdresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getEmailAdresa() {
        return emailAdresa;
    }

    public void setEmailAdresa(String emailAdresa) {
        this.emailAdresa = emailAdresa;
    }

    @Override
    public String toString() {
        return "\nIme : " + ime +
                "\nAdresa : " + adresa +
                "\nBroj telefona : " + brojTelefona +
                "\nEmail adresa : " + emailAdresa;
    }
}
