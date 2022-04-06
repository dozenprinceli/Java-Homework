package pers.dozenlee.exp.exp2.exp2_8;

public class Main {
    public static void main(String[] args) {
        MotorVehicle car1 = new MotorVehicle();
        car1.changeVehicleNo("9752");
        car1.accelerate(50);

        MotorVehicle car2 = new MotorVehicle("5086", 150, 200);
        car2.decelerate(50);

        car1.printInfo();
        car2.printInfo();
    }
}
