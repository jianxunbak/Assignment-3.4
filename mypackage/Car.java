package mypackage;

public class Car {
    // static method
    public static void aboutCar() {
        System.out.println("static method: A car us 4 wheel vehicle");
    }

    // instance method
    public void drive() {
        System.out.println("instance method: the car moves ahead 1m");
    }

    // instance method 2
    public void startEngine() {
        System.out.println("instance method: Started engine");
        startAirCon();
        startRadio();
        checkSeatBelt();
    }

    // instance method 3
    private void startAirCon() {
        System.out.println("instance method: Started aircon");
    }

    // instance method 4
    private void startRadio() {
        System.out.println("instance method: Started radio");
    }

    // instance method 5
    private void checkSeatBelt() {
        System.out.println("instance method: checked seat belt");
    }
}