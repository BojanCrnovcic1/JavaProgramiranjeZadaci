package Klase;

public class Krug {
    private double radius;
    private int brojObjekata;

    public Krug(){
        radius = 1;
        brojObjekata++;
    }

    public Krug(double radius) {
        this.radius = radius;
        brojObjekata++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getBrojObjekata() {
        return brojObjekata;
    }

    public void setBrojObjekata(int brojObjekata) {
        this.brojObjekata = brojObjekata;
    }

    @Override
    public String toString() {
        return "Radius : " + radius +
                "\nBroj objekata : " + brojObjekata;
    }
}
