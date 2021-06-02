package homework2_7;

public class People {
    String name;
    int age;
    double height;
    boolean sexual;

    People(String name,int age,double height,String sexual) {
        this.name = name;
        
        if(age <= 0) {
            System.out.println("Age Range Error!");
            System.exit(1);
        }
        else this.age = age;
        
        if(height <= 0) {
            System.out.println("Height Range Error!");
            System.exit(1);
        }
        else this.height = height;

        if(sexual.compareTo("男") == 0 || sexual.compareToIgnoreCase("male") == 0) {
            this.sexual = true;
        }
        else if(sexual.compareTo("女") == 0 || sexual.compareToIgnoreCase("female") == 0) {
            this.sexual = false;
        }
        else {
            System.out.println("Sexual Input Error!");
            System.exit(1);
        }
    }

    
    void Talk(String words) {
        System.out.println(name + " says:\"" + words + "\"");
    }

    void doPlus(int a, int b) {
        System.out.println(a+b);
    }

    void changeName(String newName) {
        name = newName;
    }
}