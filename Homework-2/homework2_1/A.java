package homework2_1;

public class A {
    public static void main(String[] args) {
        Circle circle = new Circle(Math.E);
        Lader lader = new Lader(2.5, 5.6, 11);
        System.out.println("半径为" + circle.radius + "的圆的周长为:\t" + circle.getPerimeter());
        System.out.println("半径为" + circle.radius + "的圆的面积为:\t" + circle.getArea());
        System.out.print("上下底为" + lader.upperLine + "和" + lader.lowerLine);
        System.out.println(",高为" + lader.height + "的梯形的面积为\t" + lader.getArea());
    }
}