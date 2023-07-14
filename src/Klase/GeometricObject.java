package Klase;

public abstract class GeometricObject {
    private String boja;
    private boolean ispunjen;

    public GeometricObject() {

    }

    public GeometricObject(String boja, boolean ispunjen) {
        this.boja = boja;
        this.ispunjen = ispunjen;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isIspunjen() {
        return ispunjen;
    }

    public void setIspunjen(boolean ispunjen) {
        this.ispunjen = ispunjen;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return "\nBoja : " + boja +
                "\nIspunjen (true / false) : " + ispunjen;
    }
}
