package homework2_7;

/**
 * 人物类。通过姓名、年龄、性别、身高初始化一个人物对象
 */
public class People {
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    
    private String name;
    private int age;
    private double height;
    private int sexual;

    /**
     * 初始化一个人物对象
     * @param name 姓名
     * @param age 年龄
     * @param height 身高
     * @param sexual 性别
     * @throws IllegalArgumentException("AgeRangeException") 若年龄为负数
     * @throws IllegalArgumentException("HeightRangeException") 若身高为负数
     * @throws IllegalArgumentException("SexualRangeError") 若性别参数不为1或2
     */
    public People(String name, int age, double height, int sexual) {
        this.name = name;
        
        // Exception handling
        if(age <= 0) throw new IllegalArgumentException("AgeRangeException");
        else this.age = age;
        
        // Exception handling
        if(height <= 0) throw new IllegalArgumentException("HeightRangeException");
        else this.height = height;

        // Exception handling
        if (sexual != MALE && sexual != FEMALE) throw new IllegalArgumentException("SexualRangeError");
        else this.sexual = sexual;
    }

    /**
     * 让人物说话，输出要说的话
     * @param words 说话的内容
     */
    public void Talk(String words) {
        System.out.println(name + " says:\"" + words + "\"");
    }

    /**
     * 做加法
     * @param a 加数1
     * @param b 加数2
     * @return 两数之和，并将和输出在控制台
     */
    public int doPlus(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    /**
     * 修改人物的姓名
     * @param newName 新的姓名
     */
    public void changeName(String newName) {
        name = newName;
    }

    /**
     * 获取姓名
     * @return 人物的姓名
     */
    public String getName() {
        return name;
    }
}