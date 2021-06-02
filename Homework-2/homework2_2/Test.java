package homework2_2;

public class Test {
    public static void main(String[] args) {
        XiYouJiRenWu sunWuKong = new XiYouJiRenWu();
        XiYouJiRenWu zhuBaJie = new XiYouJiRenWu();
        
        sunWuKong.name = "孙悟空";
        sunWuKong.weapon = "金箍棒";

        zhuBaJie.name = "猪八戒";
        zhuBaJie.weapon = "九齿钉耙";

        sunWuKong.printName();sunWuKong.printWeapon();
        zhuBaJie.printName();zhuBaJie.printWeapon();
    }
}