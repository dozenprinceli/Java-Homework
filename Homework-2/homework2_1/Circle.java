package homework2_1;

import java.lang.Math;

/**
 * 圆类，通过初始化半径计算周长和面积
 */
public class Circle {
    private double radius,perimeter,area;
    
    /**
     * 初始化一个圆
     * 
     * @param r 半径
     * @throws IllegalArgumentException("RadiusRangeException") 如果输入的r为负数
     */
    public Circle(double r) {
        // Exception handling
        if(r < 0) throw new IllegalArgumentException("RadiusRangeException");
        
        radius = r;
        perimeter = 2 * r * Math.PI;
        area = Math.PI * r * r;
    }
    
    /**
     * 计算周长
     * @return 圆的周长
     */
    public double perimeter() {
        return perimeter;
    }
    
    /**
     * 计算面积
     * @return 圆的面积
     */
    public double area() {
        return area;
    }

    /**
     * 获取半径
     * @return 圆的半径
     */
    public double getRadius() {
        return radius;
    }
}