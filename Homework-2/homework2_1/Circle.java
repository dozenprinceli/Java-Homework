package homework2_1;

import java.lang.Math;

public class Circle {
    double radius,perimeter,area;
    
    Circle(double r) {
        radius = r;
        perimeter = 2 * r * Math.PI;
        area = Math.PI * r * r;
    }
    
    double getPerimeter() {
        return perimeter;
    }
    
    double getArea() {
        return area;
    }
}