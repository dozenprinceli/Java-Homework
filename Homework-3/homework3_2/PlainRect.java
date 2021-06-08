package homework3_2;

public class PlainRect extends Rect {
    public double startX, startY;

    public PlainRect() {
        startX = 0; startY = 0;
        width = 0; height = 0;
    }

    public PlainRect(double startX, double startY, double width, double height) {
        this.startX = startX; this.startY = startY;
        super.height = height; super.width = width;
    }

    public boolean isInside(double x, double y) {
        boolean result = false;
        if(x >= startX && x <= startX + width) {
            if(y <= startY && y>= startY - height) result = true;
        }
        return result;
    }
}