package homework2_2;

/**
 * 测试类Test，用于测试XiYouJiRenWu类
 */
public class Test {
    public static void main(String[] args) {
        XiYouJiRenWu sunWuKong = new XiYouJiRenWu();
        XiYouJiRenWu zhuBaJie = new XiYouJiRenWu();

        sunWuKong.setName("孙悟空");
        sunWuKong.setWeapon("金箍棒");

        zhuBaJie.setName("猪八戒");
        zhuBaJie.setWeapon("九齿钉耙");

        sunWuKong.printName();sunWuKong.printWeapon();
        zhuBaJie.printName();zhuBaJie.printWeapon();
    }
}