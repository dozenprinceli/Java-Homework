package homework2_4;

/**
 * 时钟类。可初始化和显示对象时间，采用24小时制
 */
public class Clock {
    private int hour,minute,second;
    
    /**
     * 初始化一个时钟对象
     * @param hh 时
     * @param mm 分
     * @param ss 秒
     * @throws IllegalArgumentException("TimeRangeError") 若时(hh)或分(mm)或秒(ss)的范围不合法，即分或秒小于0或大于59，时小于0或大于23
     */
    public Clock(int hh,int mm,int ss) {
        // Exception handling
        if(hh > 23 || hh < 0 || mm > 59 || mm < 0 || ss > 59 || ss < 0) {
            throw new IllegalArgumentException("TimeRangeError");
        }
        else {
            hour = hh;
            minute = mm;
            second = ss;
        }
    }

    /**
     * 显示对象的时间
     * @return 索引值分别为时、分、秒的整型数组，并输出一个显示时间的语句
     */
    public int[] show() {
        int[] returnList = {hour, minute, second};
        System.out.print(Integer.toString(hour/10) + hour%10 + ":");
        System.out.print(Integer.toString(minute/10) + minute%10 + ":");
        System.out.println(Integer.toString(second/10) + second%10);
        return returnList;
    }
}