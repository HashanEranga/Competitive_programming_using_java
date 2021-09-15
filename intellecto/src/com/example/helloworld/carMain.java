package com.example.helloworld;

public class carMain {
    public static void main(String[] args) {
        Car mercedes = new Car();
        ICar ferrari = new Truck();

        mercedes.setColor("red");
//        prime.setColor("black");
        System.out.println("Color of the car is : " + mercedes.getColor());
//        System.out.println("Color of the truck is : " + prime.getColor());

//        test methods
        mercedes.applyBreaks();
        ferrari.brake();

    }
}
