package homework2_1;

/**
 * 测试类A，用于测试Lader类和Circle类
 */
public class A {
    public static void main(String[] args) {
        Circle circle = new Circle(Math.E);
        Lader lader = new Lader(2.5, 5.6, 11);
        System.out.println("半径为" + circle.getRadius() + "的圆的周长为:\t" + circle.perimeter());
        System.out.println("半径为" + circle.getRadius() + "的圆的面积为:\t" + circle.area());
        System.out.print("上下底为" + lader.getUpperLine() + "和" + lader.getLowerLine());
        System.out.println(",高为" + lader.getHeight() + "的梯形的面积为:\t" + lader.area());
    }
}