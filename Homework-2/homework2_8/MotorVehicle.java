package homework2_8;

public class MotorVehicle {
    String carPlate;
    int velocity;
    double carryCapacity;

    MotorVehicle() {
        carPlate = "XX1234";
        velocity = 100;
        carryCapacity = 100;
    }

    MotorVehicle(String carPlate, int velocity, double carryCapacity) {
        this.carPlate = carPlate;
        this.velocity = velocity;
        this.carryCapacity = carryCapacity;
    }

    void Quicken(int speed) {
        if(speed < 0) {
            System.out.println("Speed Quicken Range Error!");
        }
        else velocity += speed;
    }

    void Moderate(int speed) {
        if(speed > velocity || speed < 0) {
            System.out.println("Speed Moderation Range Error!");
        }
        else velocity -= speed;
    }

    void ChangePlate(String newPlate) {
        carPlate = newPlate;
    }

    void InquireCarryCapacity() {
        System.out.println(carryCapacity);
    }

    void show() {
        System.out.print(carPlate + ", ");
        System.out.print("v = " + velocity + ", ");
        System.out.println("carry capacity = " + carryCapacity);
    }
}