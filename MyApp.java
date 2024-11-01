import com.example.Animal;

import mypackage.Car;
import mypackage.HelloWorld;
import mypackage.House;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("This is MyApp.java");
        // House myHouse = new House();
        // Animal animal = new Animal();
        // HelloWorld helloWorld = new HelloWorld();
        // // 11 and 88 are arguments
        // addNumber(11, 88);
        // System.out.println("Minus number: " + minusNumber(100, 50));

        // call a static method
        Car.aboutCar();

        // call instance method
        Car car = new Car();
        car.drive();
        car.startEngine();
        // car.startAirCon();
        // car.startRadio();
        // car.checkSeatBelt();
    }

    // creating a method.
    // void means return nothing
    // int a and int b are called parameters//
    // static means it is a method that belows to the class
    public static void addNumber(int a, int b) {
        System.out.println("add numbers: " + a + b);
    }

    // creating a method.
    // to return an int
    public static int minusNumber(int a, int b) {
        return a - b;
    }
}
