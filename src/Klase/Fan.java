package Klase;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int brzina;
    private boolean on;
    private double radius;
    private String boja;

    public Fan() {
        brzina = SLOW;
        on = false;
        radius = 5;
        boja = "Plava";
    }

    public Fan(int brzina, boolean on, double radius, String boja) {
        this.brzina = brzina;
        this.on = on;
        this.radius = radius;
        this.boja = boja;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public void isOn() {
        on = true;
    }

    public void isOff() {
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    @Override
    public String toString() {
         if (on == true) {
            return "Brzina : " + brzina +
                    "\nBoja : " + boja +
                    "\nRadius : " + radius;
        }
         else
             return "Boja : " + boja +
                     "\nRadius : " + radius +
                     "\nVentilator je iskljucen.";
    }
}
