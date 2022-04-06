package pers.dozenlee.exp.exp3.exp3_2;

/**
 * @author DozenPrince Li
 * @date 2022/3/24
 */
public class Rect {
    protected double width, height;

    public Rect() {
        this.width = 10;
        this.height = 10;
    }

    public Rect(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width or height should be non-negative!");
        }

        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }
}
