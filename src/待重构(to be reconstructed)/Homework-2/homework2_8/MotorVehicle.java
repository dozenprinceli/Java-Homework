package homework2_8;

/**
 * 机动车类。初始化一个机动车对象
 */
public class MotorVehicle {
    private String carPlate;
    private int velocity;
    private double carryCapacity;

    /**
     * 无参构造，默认车牌号为"XX1234"，车速为100，载重量为100
     */
    public MotorVehicle() {
        carPlate = "XX1234";
        velocity = 100;
        carryCapacity = 100;
    }

    /**
     * 全参数初始化
     * @param carPlate 车牌号
     * @param velocity 车速
     * @param carryCapacity 载重量
     * @throws IllegalArgumentException("VelocityRangeException") 若车速为负数
     * @throws IllegalArgumentException("CarryCapacityRangeException") 若载重量为负数
     */
    public MotorVehicle(String carPlate, int velocity, double carryCapacity) {
        // Exception handling
        if(velocity < 0) throw new IllegalArgumentException("VelocityRangeException");
        if(carryCapacity < 0) throw new IllegalArgumentException("CarryCapacityRangeException");

        this.carPlate = carPlate;
        this.velocity = velocity;
        this.carryCapacity = carryCapacity;
    }

    /**
     * 加速
     * @param speed 增加的速度
     * @throws IllegalArgumentException("QuickenSpeedRangeException") 若增加的速度为负数
     */
    public void Quicken(int speed) {
        // Exception handling
        if(speed < 0) {
            throw new IllegalArgumentException("QuickenSpeedRangeException");
        }
        else velocity += speed;
    }

    /**
     * 减速
     * @param speed 减少的速度
     * @throws IllegalArgumentException("ModerateSpeedRangeException") 若减少的速度为负数，或超过当前速度
     */
    public void Moderate(int speed) {
        // Exception handling
        if(speed > velocity || speed < 0) {
            throw new IllegalArgumentException("ModerateSpeedRangeException");
        }
        else velocity -= speed;
    }

    /**
     * 修改车牌号
     * @param newPlate 新的车牌号
     */
    public void ChangePlate(String newPlate) {
        carPlate = newPlate;
    }

    /**
     * 查询载重量
     * @return 载重量，并输出载重量到控制台
     */
    public double InquireCarryCapacity() {
        System.out.println(carryCapacity);
        return carryCapacity;
    }

    /**
     * 输出车辆信息
     */
    public void show() {
        System.out.print(carPlate + ", ");
        System.out.print("车速: " + velocity + ", ");
        System.out.println("载重量: " + carryCapacity);
    }
}