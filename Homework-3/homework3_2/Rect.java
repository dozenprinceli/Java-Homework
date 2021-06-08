package homework3_2;

public class Rect {
    protected double width, height;

    public Rect() {
        width = 10;
        height = 10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double peimeter() {
        return 2 * (width + height);
    }
}