package homework2_1;

public class Lader {
    double upperLine,lowerLine,height,area;
    
    Lader(double upperLine,double lowerLine,double height) {
        this.upperLine = upperLine;
        this.lowerLine = lowerLine;
        this.height = height;
        area = (upperLine + lowerLine) * height / 2;
    }
    
    double getArea() {
        return area;
    }
}