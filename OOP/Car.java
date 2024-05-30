package OOP;

public class Car extends Vehicle {


    int wheels = 4;
    int doors = 4;

    @Override
    void go() {
        System.out.println("The driver is driving the car. ");
    }
    // String make = "Chevrolet";
    // String model = "Corvette";
    // int year = 2020;
    // String color = "blue";
    // double price = 50000.00;
    // String name;

    // Car (String name){
    //     this.name = name;
    // }

    // void drive() {
    //     System.out.println("You just drove the car...");
    // }

    // void brake() {
    //     System.out.println("You just braked...");
    // }

    // public String toString() {
    //     return "The car's make is " +  this.make + " of " + this.year + " with a color of " + this.color;

    // }

    // public String toString() {
    //     return this.name;
    // }
    
}
