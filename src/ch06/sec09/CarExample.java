package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("자가용");

        myCar.getSpeed();

        myCar.setSpeed(5);
        myCar.run();
    }
}
