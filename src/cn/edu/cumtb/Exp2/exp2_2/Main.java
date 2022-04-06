package pers.dozenlee.exp.exp2.exp2_2;

public class Main {
    public static void main(String[] args) {
        XiYouJiRenWu zhuBaJie = new XiYouJiRenWu("猪八戒");
        XiYouJiRenWu sunWuKong = new XiYouJiRenWu("孙悟空");

        zhuBaJie.setWeapon("九齿钉耙");
        sunWuKong.setWeapon("金箍棒");

        zhuBaJie.printName();
        zhuBaJie.printWeapon();

        sunWuKong.printName();
        sunWuKong.printWeapon();
    }
}
