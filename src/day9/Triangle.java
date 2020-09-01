package day9;

public class Triangle extends Figure {

    private int lengthSide1;
    private int lengthSide2;
    private int lengthSide3;

    public Triangle(int lengthSide1, int lengthSide2, int lengthSide3, String color) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        double p = (lengthSide1 + lengthSide2 + lengthSide3) / 2.0;
        return Math.sqrt(p * (p - lengthSide1) * (p - lengthSide2) * (p - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }
}
