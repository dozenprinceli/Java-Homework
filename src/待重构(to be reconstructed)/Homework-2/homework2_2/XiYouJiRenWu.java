package homework2_2;

/**
 * 西游记人物类。可编辑身高、名字、武器
 */
public class XiYouJiRenWu {
    private double height;
    private String name,weapon;
    
    /**
     * 输出名字
     */
    public void printName() {
        System.out.println(name);
    }

    /**
     * 输出武器名
     */
    public void printWeapon() {
        System.out.println(weapon);
    }

    /**
     * 设置身高
     * @param height 设置的身高值
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 设置名字
     * @param name 设置的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置武器
     * @param weapon 设置的武器名
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}