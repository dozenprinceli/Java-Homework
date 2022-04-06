package pers.dozenlee.exp.exp2.exp2_8;

public class MotorVehicle {
    private static final IllegalArgumentException SPEED_ILLEGAL_EXCEPTION =
            new IllegalArgumentException("Illegal speed!");

    private String vehicleNo;
    private int velocity;
    private double capacity;

    public MotorVehicle() {
        this.vehicleNo = "XX1234";
        this.velocity = 100;
        this.capacity = 100.0D;
    }

    public MotorVehicle(String vehicleNo, int velocity, double capacity) {
        if (velocity < 0) {
            throw new IllegalArgumentException("Illegal velocity!");
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity");
        }

        this.vehicleNo = vehicleNo;
        this.velocity = velocity;
        this.capacity = capacity;
    }

    public void accelerate(int speed) {
        if (speed < 0) {
            throw SPEED_ILLEGAL_EXCEPTION;
        }
        velocity += speed;
    }

    public void decelerate(int speed) {
        if (speed < 0 || speed > velocity) {
            throw SPEED_ILLEGAL_EXCEPTION;
        }
        velocity -= speed;
    }

    public String changeVehicleNo(String newVehicleNo) {
        String oldNo = vehicleNo;
        vehicleNo = newVehicleNo;
        return oldNo;
    }

    public double getCapacity() {
        return capacity;
    }

    public void printInfo() {
        System.out.println("车辆编号:" + vehicleNo + "\t当前速度:" + velocity + "\t载重量:" + capacity);
    }
}
