package pers.dozenlee.exp.exp2.exp2_1;

/**
 * 圆形类
 */
@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Circle {
    private final double radius;
    private final double parameter;
    private final double area;

    public Circle(double radius) {
        this.radius = radius;
        this.parameter = 2 * this.radius * Math.PI;
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public double getArea() {
        return area;
    }

    public double getParameter() {
        return parameter;
    }

    public double getRadius() {
        return radius;
    }
}
