package Klase;

public class BMI {
    static final double KILOGRAM_U_FUNTE = 0.45359237;
    static final double METRI_U_INCE = 0.0254;
    private String ime;
    private int godine;
    private double tezina;
    private double visina;

    public BMI(String ime, int godine, double tezina, double visina) {
        this.ime = ime;
        this.godine = godine;
        this.tezina = tezina;
        this.visina = visina;
    }

    public BMI(String ime, int godine, double tezina, double stope, double inci) {
        this.ime = ime;
        this.godine = godine;
        this.tezina = tezina;
        this.visina = (stope * 12) + inci;
    }

    public String getIme() {
        return ime;
    }

    public int getGodine() {
        return godine;
    }

    public double getTezina() {
        return tezina;
    }

    public double getVisina() {
        return visina;
    }

    public double getBMI() {
        double bmi = tezina * KILOGRAM_U_FUNTE /((visina * METRI_U_INCE) * (visina * METRI_U_INCE));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Pothranjenost";
        }
        else if (bmi <= 18.5 && bmi > 25.0) {
            return "Normalan BMI.";
        }
        else if (bmi <= 25.0 && bmi > 30.0) {
            return "Gojaznost.";
        }
        else
            return "Pretilost.";
    }
}
