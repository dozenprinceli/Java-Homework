package pers.dozenlee.exp.exp2.exp2_4;

@SuppressWarnings("unused")
public class Clock {
    @SuppressWarnings("FieldMayBeFinal")
    private int hh, mm, ss;

    /**
     * 24小时制的时间构造器
     * @param hh 小时
     * @param mm 分钟
     * @param ss 秒
     * @throws IllegalArgumentException 时间格式不合法
     */
    public Clock(int hh, int mm, int ss) {
        if (!checkBy24(hh) || !checkBy60(mm) || !checkBy60(ss)) {
            throw new IllegalArgumentException("Illegal time format!(0<=hh<24,0<=mm<60,0<=ss<60)");
        }

        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean checkBy24(int num) {
        return 0 <= num && num < 24;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean checkBy60(int num) {
        return 0 <= num && num < 60;
    }

    public void show() {
        String formatHH = hh < 10 ? "0" + hh : "" + hh;
        String formatMM = mm < 10 ? "0" + mm : "" + mm;
        String formatSS = ss < 10 ? "0" + ss : "" + ss;
        System.out.println(formatHH + ":" + formatMM + ":" + formatSS);
    }
}
