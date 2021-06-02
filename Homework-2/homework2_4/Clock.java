package homework2_4;

public class Clock {
    int hour,minute,second;
    
    Clock(int hh,int mm,int ss) {
        if(hh > 23 || hh < 0 || mm > 59 || mm < 0 || ss > 59 || ss < 0) {
            System.out.println("Time Range Error!");
            System.exit(1);
        }
        else {
            hour = hh;
            minute = mm;
            second = ss;
        }
    }

    void show() {
        System.out.print(Integer.toString(hour/10) + hour%10 + ":");
        System.out.print(Integer.toString(minute/10) + minute%10 + ":");
        System.out.println(Integer.toString(second/10) + second%10);
    }
}