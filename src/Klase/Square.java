package Klase;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String boja, boolean ispunjen, double side) {
        super(boja, ispunjen);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public String kakoSeBoji() {
        return "Boje se sve cetiri stane. ";
    }
}
