package pers.dozenlee.exp.exp2.exp2_7;

/**
 * 人类
 */
public class People {
    private String name;
    private int age;
    private Sexual sex;
    private double height;

    public People(String name, int age, Sexual sex, double height) {
        if (age < 0) {
            throw new IllegalArgumentException("Illegal age!");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Illegal height!");
        }

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public void speak(String words) {
        System.out.println(name + "说:\"" + words + "\"");
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public String changeName(String newName) {
        String oldName = name;
        name = newName;
        return oldName;
    }

    public String getName() {
        return name;
    }
}

enum Sexual {
    /**
     * 男性
     */
    MALE,
    /**
     * 女性
     */
    FEMALE;
}
