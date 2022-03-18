package homework2_8;

/**
 * Test类，用于测试MotorVehicle类
 */
public class Test {
    public static void main(String[] args) {
        MotorVehicle v1 = new MotorVehicle();
        v1.ChangePlate("9752");
        v1.Quicken(20);
        
        MotorVehicle v2 = new MotorVehicle("5086", 150, 200);
        v2.Moderate(20);

        v1.show();
        v2.show();
    }
}