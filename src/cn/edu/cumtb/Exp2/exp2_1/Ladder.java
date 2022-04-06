package pers.dozenlee.exp.exp2.exp2_1;

/**
 * 梯形类
 */
@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Ladder {
    private double upper;
    private double downer;
    private double height;
    private double area;

    public Ladder(double upper, double downer, double height) {
        this.upper = upper;
        this.downer = downer;
        this.height = height;
        this.area = (upper + downer) * height / 2;
    }

    public double getArea() {
        return area;
    }

    public double getUpper() {
        return upper;
    }

    public double getDowner() {
        return downer;
    }

    public double getHeight() {
        return height;
    }
}
