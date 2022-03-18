package homework2_1;

/**
 * 梯形类，通过初始化上底、下底、高计算面积
 */
public class Lader {
    private double upperLine, lowerLine, height, area;
    
    /**
     * 初始化一个梯形
     * @param upperLine 上底长度
     * @param lowerLine 下底长度
     * @param height 高度
     * @throws IllegalArgumentException("BaseOrHeightRangeException") 若输入的上底、下底或高为非正数
     */
    public Lader(double upperLine, double lowerLine, double height) {
        // Exception handling
        if(upperLine <= 0 || lowerLine <= 0 || height <= 0) throw new IllegalArgumentException("BaseOrHeightRangeException");
        
        this.upperLine = upperLine;
        this.lowerLine = lowerLine;
        this.height = height;
        area = (upperLine + lowerLine) * height / 2;
    }
    
    /**
     * 计算面积
     * @return 梯形的面积
     */
    public double area() {
        return area;
    }

    /**
     * 获取上底长度
     * @return 梯形的上底长度
     */
    public double getUpperLine() {
        return upperLine;
    }

    /**
     * 获取下底长度
     * @return 梯形的下底长度
     */
    public double getLowerLine() {
        return lowerLine;
    }

    /**
     * 获取高度
     * @return 梯形的高度
     */
    public double getHeight() {
        return height;
    }
}