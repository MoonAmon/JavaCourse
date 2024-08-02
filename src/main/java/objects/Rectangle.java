package objects;

public class Rectangle {

    protected double length;
    protected double width;
    protected int sides = 4;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public void print() {
        System.out.println("I'm rectangle!!");
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return width * length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
