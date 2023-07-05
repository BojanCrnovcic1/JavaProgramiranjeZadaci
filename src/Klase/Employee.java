package Klase;

public class Employee extends Person {
    private int office;
    private double plata;
    private  MyDate vrijemeZaposljavanja;

    public Employee() {

    }

    public Employee(String ime, String adresa, String brojTelefona, String emailAdresa,
                    int office, double plata) {
        super(ime, adresa, brojTelefona, emailAdresa);
        this.office = office;
        this.plata = plata;
        vrijemeZaposljavanja = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public String getVrijemeZaposljavanja() {
        return vrijemeZaposljavanja.getGodina() + " / " + vrijemeZaposljavanja.getMjesec() +" / "+
                vrijemeZaposljavanja.getDan();
    }

    public void setVrijemeZaposljavanja(MyDate vrijemeZaposljavanja) {
        vrijemeZaposljavanja = new MyDate();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOffice : " + office +
                "\nPlata : " + plata +
                "\nVrijeme Zaposljavanja : " + getVrijemeZaposljavanja().toString();

    }
}
