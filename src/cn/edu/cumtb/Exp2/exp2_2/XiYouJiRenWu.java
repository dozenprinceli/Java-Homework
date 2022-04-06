package pers.dozenlee.exp.exp2.exp2_2;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class XiYouJiRenWu {

    private String name;
    private double height;
    private String weapon;

    public XiYouJiRenWu(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getWeapon() {
        return weapon;
    }

    public void printName() {
        System.out.println(getName());
    }

    public void printWeapon() {
        System.out.println(getWeapon());
    }
}
