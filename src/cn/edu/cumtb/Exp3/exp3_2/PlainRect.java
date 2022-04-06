package pers.dozenlee.exp.exp3.exp3_2;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class PlainRect extends Rect {
    private double startX, startY;

    public PlainRect() {
        super(0, 0);
        this.startX = 0;
        this.startY = 0;
    }

    public PlainRect(double startX, double startY, double width, double height) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public boolean isInside(double x, double y) {
        boolean xCheck = x >= startX && x <= startX + width;
        boolean yCheck = y >= startY && y <= startY + height;
        return xCheck && yCheck;
    }
}
